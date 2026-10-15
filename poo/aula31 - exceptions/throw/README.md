# Throw

No Java, a palavra-chave `throw` é usada para lançar (disparar) explicitamente uma exceção de forma manual dentro do código.

## Principais Características

- **Local de uso**: É escrita dentro do corpo de um método ou de um bloco de código.
- **Objeto**: É sempre seguida por uma instância de uma classe que herda de `Throwable` (como `new IllegalArgumentException("Mensagem")`).
- **Fluxo**: Interrompe imediatamente a execução normal do método naquele ponto.

	```java
		public void sacar(double valor) {
		    if (valor <= 0) {
		        // Lançando uma exceção manualmente com 'throw'
		        throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
		    }
		    // Continua o código se não cair no if
		}

	```

## Diferença entre `throw` e `throws`

- `throw`: Utilizado dentro do método para disparar uma exceção específica.
- `throws`: Declarado na assinatura do método para avisar quem o chamou que ele pode propagar aquele tipo de exceção.