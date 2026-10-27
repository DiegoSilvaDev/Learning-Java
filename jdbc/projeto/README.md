# Projeto JDBC - Gestão de Produtos

## Classes e Métodos

## 1. **ConexãoDB**

- `conectar():` Conecta ao banco de dados SQLite.
- `conectarGenerico(String url, String usuario, String senha)`: Conecta ao banco de dados usando URL, usuário e senha fornecidos.

## 2. **CriadorTabela**

- `main()`: Conectar e criar a tabela `produtos`.

## 3. **Produto**

- `Produto(String nome, int quantidade, double preco, String status)`: Construtor para inicializar um produto.
- `Produto()`: Construtor sem argumentos para criação de instância padrão.
- `getId()` / `setId()`: Obtém/Define o ID do produto.
- `getNome()` / `setNome()`: Obtém/Define o nome do produto.
- `getQuantidade()` / `setQuantidade(int quantidade)`: Obtém/Define a quantidade do produto.
- `getPreco()` / `setPreco()`: Obtém/Define o preço do produto.
- `getStatus()` / `setStatus()`: Obtém/Define o status do produto.

## 4. **ProdutoDAO**

### Métodos para Criar

- `inserir(Produto produto)`: Insere um novo produto no banco de dados.

### Métodos para Atualizar

- `atualizar(Produto produto)`: Atualiza as informações de um produto no banco de dados.

### Métodos para Excluir

- `excluir(int id)`: Exclui um produto pelo seu ID.
- `excluirTodos()`: Exclui todos os produtos do banco de dados.

### Métodos para Consultar

- `consultarPorId(int id)`: Consulta um produto pelo seu ID.
- `listarTodos()`: Lista todos os produtos do banco de dados.

## 5. **Main**

- `main(String[] args)`: Método principal para demonstrar o uso do ProdutoDAO.
	- `excluirTodos()`: Limpa todos os produtos antes de começar.
	- `mostrarProdutos(ProdutoDAO produtoDAO)`: Lista todos os produtos.
	- `inserir(Produto produto)`: Insere novos produtos.
	- `consultarPorId(int id)`: Consulta um produto pelo ID.
	- `atualizar(Produto produto)`: Atualiza o preço do produto.
	- `excluir(int id)`: Exclui um produto pelo ID.


## Configurando o Ambiente para o JDBC

#### Dizendo ao Javva onde estão as classes JDBC

Exemplo: 

- `DriverManager.getConnection("jdbc:mysql://localhost:3306/meuBanco", "usuario", "senha")`;

#### Configurando a variável de ambiente necessária: 

1. **Copie os arquivos** abaixo para o diretório do programa:
	- sqlite-jdbc-3.46.0.0.jar
	- slf4j-api-1.7.13.jar
	- slf4j-simple-1.7.13.jar

2. Execute sysdm.cpl

3. Adicione a variável de ambiente:
- CLASSPATH
- .;sqlite-jdbc-3.46.0.0.jar;slf4j-api-1.7.13.jar;slf4j-simple-1.7.13.jar

4. Teste se a variável está corretamente configurada
- Comando: echo %CLASSPATH%
- Saída: .;sqlite-jdbc-3.46.0.0.jar;slf4j-api-1.7.13.jar;slf4j-simple-1.7.13.jar

5. Caso não apareça a saída acima, abra um novo terminal.

