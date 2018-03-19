package sensedia.challenge.facebook;

import org.junit.AfterClass;
import org.junit.Test;

import framework.DriverManager;
import framework.FrameworkBase;
import page.facebook.FacebookTimelinePage;
import page.site44.SensediaChallengePage;
import rest.RestUtil;
import util.TestUtil;

public class FacebookPostTest extends FrameworkBase {

	@Test
	public void authorizeApp() {
		// Random String needed because Facebook doesn't allow same text to be
		// posted multiple times
		final String postMessage = "Hello world!\nRandom String: " + System.currentTimeMillis();
		final String updatedPostMessage = "Hello Facebook world!";
		final int postWaitMillis = 4000;
		String userAccessToken;

		SensediaChallengePage challengePage = new SensediaChallengePage();
		challengePage.openPage();

		challengePage.clickLoginButton();
		challengePage.waitAppAuthorizedMessage();
		userAccessToken = challengePage.getUserAcessToken();

		FacebookTimelinePage fbTimeline = new FacebookTimelinePage();
		fbTimeline.openPage();
		fbTimeline.clickUserProfile();

		String postId = RestUtil.postMessage(postMessage, userAccessToken);
		fbTimeline.clickUserProfile();
		// Allow evaluator to see the post
		TestUtil.sleep(postWaitMillis);

		RestUtil.updatePostText(postId, updatedPostMessage, userAccessToken);
		fbTimeline.clickUserProfile();
		// Allow evaluator to see the post
		TestUtil.sleep(postWaitMillis);
	}

	@AfterClass
	public static void quitWebDriver() {
		DriverManager.quitDriver();
	}

}
