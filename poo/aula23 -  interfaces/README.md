# Interfaces em Java

Uma **interface em Java** é um contrato que define um conjunto de métodos que uma classe é obrigada a implementar, determinando o que ela deve fazer, mas sem especificar como.

## Principais Características

- **Contrato de Comportamento**: Lista assinaturas de métodos (sem corpo) que as classes concretas precisam escrever.
- **Palavra-chave `implements`**: Utilizada pela classe para assumir e cumprir o contrato da interface.
- **Múltiplas Implementações**: Uma classe pode implementar várias interfaces ao mesmo tempo, contornando a limitação de herança múltipla de classes do Java.
- **Atributos**: Todos os atributos declarados em uma interface são implicitamente `public`, `static` e `final` (constantes).
- **Novidades (Java 8+)**: Permite o uso de métodos `default` (com implementação padrão) e métodos `static`.
- A palavra `abstract` no método é opcional.
- Uma `interface` pode **implementar/estender** outra(s) `interface`.
- Todos os métodos devem ser o mais acessível possível, ou seja, devem ser `public`.

Para definir (criar) uma interface usamos a palavra chave `interface`. 

 ```java
	 public interface MinhaInterface {

	 	// métodos e constantes

	 }
 ```

## Implementando uma `interface`

Uma classe implementa uma interface usando a palavra-chave `implements`. 
- Por exemplo:

	```java
		public class MinhaClasse implements MinhaInterface {

			// implementação dos métodos

		}
	```


