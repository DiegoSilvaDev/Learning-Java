# Exceptions (Exceções) em Java

Uma exceção em Java é um evento indesejado ou inesperado que ocorre durante a execução do programa e interrompe o fluxo normal de instruções, conforme explicado no artigo da [IBM](https://www.ibm.com/docs/pt-br/i/7.6.0?topic=driver-java-exceptions).

## Hierarquia e Tipos de Exceções

O mecanismo de exceções em Java herda da classe raiz `Throwable`:

- **Checked Exceptions (Checadas)**: São erros que o compilador obriga você a tratar ou declarar na assinatura do método (`throws`). Exemplos: `IOException`, `FileNotFoundException`.
- **Unchecked Exceptions (Não checadas / RuntimeException)**: Ocorrem em tempo de execução, geralmente por bugs de lógica (como divisão por zero ou acesso nulo) e o compilador não exige o tratamento obrigatório. Exemplos: `NullPointerException`, `ArrayIndexOutOfBoundsException`.
- **Errors (Erros)**: Problemas graves no ambiente da JVM (como `OutOfMemoryError`) que a aplicação não deve tentar capturar.

## Estrutura Básica de Tratamento

O tratamento é feito com blocos lógicos estruturados:

- `try` : Isola o trecho de código que pode gerar a exceção.
- `catch`: Captura e lida com um tipo específico de exceção.
- `finally`: Bloco opcional que executa sempre (com ou sem exceção), ideal para fechar conexões ou arquivos.
- `throw`: Utilizado para lançar uma exceção de forma explícita no código.
- `throws`: Declarado no cabeçalho do método para avisar que ele pode propagar uma exceção.


### Exemplo prático

```java
	try {
	    int resultado = 10 / 0; // Gera uma ArithmeticException
	
	} catch (ArithmeticException e) {
	    System.out.println("Erro: Não é possível dividir por zero.");
	
	} finally {
	    System.out.println("Bloco executado sempre.");
	}
```
