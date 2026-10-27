# JDBC

## O que é JDBC?

O **JDBC** (Java Database Connectivity) é uma API do Java que permite a comunicação e a execução de comandos SQL entre uma aplicação e bancos de dados relacionais. Ele faz parte do Java SE (Standard Edition) através dos pacotes `java.sql` e `javax.sql`.

## Componentes Principais do JDBC

- **DriverManager**: Gerencia a lista de drivers de banco de dados e estabelece a conexão inicial.
- **Connection**: Representa a sessão de conexão ativa com o banco de dados.
- **Statement / PreparedStatement**: Usados para enviar e executar instruções SQL (o `PreparedStatement` pré-compila o comando e evita vulnerabilidades como SQL Injection).
- **ResultSet**: Armazena e percorre os dados retornados por uma consulta do tipo `SELECT`.


## Tipos de Drivers JDBC

- **Tipo 1 (JDBC-ODBC Bridge)**: Usa uma ponte ODBC para acessar o banco (obsoleto).
- **Tipo 2 (Native-API)**: Usa uma biblioteca nativa específica do cliente do SGBD instalado na máquina.
- **Tipo 3 (Network-Protocol)**: Usa um intermdiário (middleware) de rede totalmente em Java.
- **Tipo 4 (Thin Driver)**: Driver totalmente em Java que se comunica diretamente com o protocolo proprietário do banco de dados (o mais utilizado atualmente).

### Passos Básicos para usar JDBC

1. Carregar o Driver JDBC: 
```java
	Class.forName("com.mysql.cj.jdbc.Driver");
```

2. Estabelecer uma conexão: 
```java
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuBanco", "usuario", "senha");
```

3. Criar um Statement:
```java
	Statement stmt = conn.createStatement();
```

4. Executar uma consulta: 
```java
	ResultSet rs = stmt.executeQuery("SELECT * FROM minhaTabela");
```

5. Processar os resultados: 
```java
	while (rs.next()) {
		System.out.println(rs.getString("nomeColuna"));
	}
```

6. Fechar a conexão:  
```java
	rs.close();
	stmt.close();
	conn.close();
```

