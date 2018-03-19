Esse projeto foi feito por Cleber Baldan Junior para o desafio da Sensedia.

O código foi amplamente testado com o browser Chrome v65.
É provável que funciona com outros browsers, basta editar `browser.name` no arquivo `src/test/resources/config.properties`.


Premissas:
==
* chrome driver disponível no path to seu SO
* O usuário do Facebook de quem irá testar **deve estar configurado** como test user no app

Como executar:
==
1. Execute o teste **facebookPostChallenge** da classe **FacebookPostTest**
1. O usuário tem 60 segundos para digitar suas credenciais do Facebook e autorizar o app **SensediaChallenge**
1. O app irá executar o post e fazer o update do post através de chamadas REST
1. O navegardor irá dar refresh na páginas após cada ação, e possui uma pausa de 4 segundos após cada refresh, para que o avaliador veja diretamente no browser as ações feitas através das chamadas REST.

O browser utilizado pelo teste é fecahdo quando o teste termina para que o processo `chromedriver` não fique como zumbi no sistema.