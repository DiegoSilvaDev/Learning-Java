# RESTful

**RESTful** é um termo usado para descrever serviços web e APIs que seguem rigorosamente os princípios do estilo arquitetônico **REST** (*Representational State Transfer* ou **Transferência de Estado Representacional**).

## Principais características

- **Baseado em Recursos**: Tudo no sistema é tratado como um recurso (como usuários, produtos ou pedidos), identificado por URIs (identificadores uniformes de recursos) únicas.
- **Uso de Verbos HTTP**: As ações sobre os recursos são definidas pelos métodos HTTP padrão:
	- `GET`: Recupera informações de um recurso.
	- `POST`: Cria um novo recurso.
	- `PUT`: Atualiza ou substitui um recurso existente.
	- `DELETE`: Remove um recurso.
- **Sem Estado (Stateless)**: Cada requisição do cliente para o servidor deve conter todas as informações necessárias para ser compreendida; o servidor não guarda o estado da sessão entre uma chamada e outra.
- **Cacheável**: As respostas do servidor devem indicar se podem ou não ser armazenadas em cache para melhorar o desempenho.
- **Interface Uniforme**: Padroniza a comunicação, separando a responsabilidade do cliente (interface) e do servidor (armazenamento e lógica).


## Diferenças

A diferença entre **REST** e **RESTful** é puramente conceitual, baseada em teoria versus prática:
- **REST (*Representational State Transfer*)**: É o modelo arquitetônico. Um conjunto de conceitos, restrições e regras teóricas de design criadas por Roy Fielding em sua tese de doutorado no ano 2000.
- **RESTful**: É o **sistema que aplica** esse modelo. O termo é um adjetivo usado para descrever uma API ou serviço web que implementa na prática os conceitos definidos pelo **REST**.

## Comparação Direta

|**Critério**|	**REST**|	**RESTful**|
| --- | --- | --- |
|**Definição**|	O conceito/estilo de arquitetura.|	A aplicação prática desse conceito.|
|**Natureza**|	Teórica (as regras do jogo).|	Prática (o sistema construído seguindo as regras).|
|**Exemplo**|	"Vou projetar minha API usando o padrão **REST**".|	"Nossa equipe desenvolveu uma API **RESTful**".|

Na prática, a comunidade de tecnologia costuma usar os dois termos como sinônimos no dia a dia. Falar "API REST" ou "API RESTful" transmite exatamente a mesma ideia para outros desenvolvedores.