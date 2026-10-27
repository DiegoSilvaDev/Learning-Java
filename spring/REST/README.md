# REST

O REST (*Representational State Transfer* ou **Transferência de Estado Representacional**) é um estilo de arquitetura de software criado em 2000 por Roy Fielding. Ele define um conjunto de regras para a criação de serviços web que permitem a comunicação entre diferentes sistemas pela internet.

## Principais características

- **Cliente-Servidor**: Separa a interface do usuário (cliente) do armazenamento de dados e lógica (servidor).
- **Stateless (Sem Estado)**: Cada requisição enviada do cliente para o servidor deve conter todas as informações necessárias para ser compreendida; o servidor não guarda a sessão do cliente.
- **Cacheável**: As respostas podem ser armazenadas em cache para diminuir requisições repetidas e melhorar a velocidade.
- **Interface Uniforme**: Padroniza a forma como os recursos são identificados (por URIs) e manipulados.
- **Sistema em Camadas**: Permite o uso de intermediários (como firewalls, proxies e balanceadores de carga) entre o cliente e o servidor.

## Métodos HTTP mais comuns

- **GET**: Recupera informações de um recurso.
- **POST**: Cria um novo recurso.
- **PUT / PATCH**: Atualiza um recurso existente.
- **DELETE**: Remove um recurso.

## Formatos utilizados

Os dados são trocados principalmente em formato **JSON**, embora `XML`, `HTML` ou textos simples também possam ser usados. Sistemas que seguem rigorosamente essas regras são chamados de **RESTful**.

## Vantagens

As principais vantagens da arquitetura **REST** explicam por que ela se tornou o padrão mais utilizado na criação de APIs modernas.

- **Alta escalabilidade**: Pelo fato de ser *stateless* (sem estado), o servidor não precisa gastar memória guardando sessões. Isso torna muito mais simples adicionar novos servidores para distribuir e aguentar uma carga massiva de acessos.
- **Flexibilidade e formatos leves**: Ao contrário de padrões rígidos como o **SOAP**, o **REST** suporta múltiplos formatos de mensagens com destaque para o **JSON** que é extremamente leve, rápido de processar e consome pouca banda.
- **Independência de linguagem**: O **REST** funciona puramente sobre o protocolo `HTTP/HTTPS`. Isso significa que um servidor construído em Python ou Java pode se comunicar de forma transparente com clientes escritos em `JavaScript`, `PHP`, `C#` ou qualquer outra tecnologia.
- **Desacoplamento total**: Como as responsabilidades do cliente (interface) e do servidor (dados) são completamente separadas, as equipes podem modificar o visual do aplicativo sem mexer nas regras de negócio do banco de dados, e vice-versa.
- **Aproveitamento da infraestrutura web**: Ele foi desenhado para usar nativamente os recursos que a própria internet já possui. O uso de cache web, por exemplo, é implementado com extrema facilidade, reduzindo o processamento repetitivo no servidor e acelerando as respostas para o usuário.
- **Simplicidade de aprendizado**: Por mapear operações diretamente nos verbos padrão do `HTTP` (`GET`, `POST`, `PUT`, `DELETE`), o fluxo de desenvolvimento é muito intuitivo e rápido, mesmo para quem está começando.