Esse projeto foi feito por Cleber Baldan Junior para o desafio da Sensedia.

O c�digo foi amplamente testado com o browser Chrome v65.
� prov�vel que funciona com outros browsers, basta editar `browser.name` no arquivo `src/test/resources/config.properties`.


Premissas:
==
* chrome driver dispon�vel no path to seu SO
* O usu�rio do Facebook de quem ir� testar **deve estar configurado** como test user no app

Como executar:
==
1. Execute o teste **facebookPostChallenge** da classe **FacebookPostTest**
1. O usu�rio tem 60 segundos para digitar suas credenciais do Facebook e autorizar o app **SensediaChallenge**
1. O app ir� executar o post e fazer o update do post atrav�s de chamadas REST
1. O navegardor ir� dar refresh na p�ginas ap�s cada a��o, e possui uma pausa de 4 segundos ap�s cada refresh, para que o avaliador veja diretamente no browser as a��es feitas atrav�s das chamadas REST.

O browser utilizado pelo teste � fecahdo quando o teste termina para que o processo `chromedriver` n�o fique como zumbi no sistema.