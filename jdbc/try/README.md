# Aplicando	try-with-resources em JDBC

Exemplo de código antes e depois da utilização do `try` com recursos no contexto do JDBC.

## Antes do `Try` com Recursos

```java
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuBanco", "usuario", "senha");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM minhaTabela");

		while(rs.next()) {
			System.out.println("nomeColuna");
		}
	
	} catch (SQLException e) {

		e.printStackTrace();
	
	} finally {

		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();

	}
```

## Usando `try` com Recursos

```java
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuBanco", "usuario", "senha");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM minhaTabela");

		while(rs.next()) {
			System.out.println("nomeColuna");
		}
	
	} catch (SQLException e) {

		e.printStackTrace();
	
	}
```

### Benefícios `try` com Recursos

- **Gerenciamento Automático de Recursos**: Recursos são fechados automaticamente ao final do bloco `try`.
- **Código Mais Limpo e Legível**: Elimina a necessidade dos blocos `finally` para fechar recursos.
- **Menos Propensos a Erros**: Reduz o risco de vazamentos de memória.
- **Evita Connection Leak**: Esgotamento dos recursos disponíveis.

