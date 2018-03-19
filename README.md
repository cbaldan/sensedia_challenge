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
1. O app irá executar o post e o update do post através de chamadas REST, e atualizará o Browser após cada ação para que o avaliador veja diretamente no brwoser as atualizações.

O browser utilizado pelo teste é fecahdo automaticamente quando o teste termina para que o processo `chromedriver` não fique como zumbi no sistema.