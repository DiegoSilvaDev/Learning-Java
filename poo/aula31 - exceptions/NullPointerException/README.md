# Exemplo `NullPointerException` (Objeto nulo)

```java
String nome = null;

	try {
		int tamanhoNome = nome.length(); // Tentando acessar um objeto nulo
		System.out.println("Tamanho do nome: " + tamanhoNome);


	} catch (NullPointerException e) {
		System.out.println("Erro: A variável 'nome' está nula.");
			
	} finally { // Sempre executa
		System.out.println("O programa encerrou.");
	}

```