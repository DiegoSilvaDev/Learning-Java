# Tratamento de exceções

- `try`, `catch` e `finally`
- `try`
- `catch`
- `finally`


## Exemplo `ArithmeticException` (Divisão por zero)

```java
int totalNotas = 0;
int quantidadeAlunos = 0;

	try {
		int media = totalNotas / quantidadeAlunos; // Divisão por zero
	
	} catch (ArithmeticException e) {
		System.out.println("Erro: Não se pode dividir por 0");
			
	} finally { // Sempre executa
		System.out.println("O programa encerrou.");
	}

```