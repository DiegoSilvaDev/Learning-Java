# Programação Funcional

A **programação funcional** chegou oficialmente ao Java no **Java 8** (lançado em 2014), permitindo que a linguagem orientada a objetos adote um estilo mais declarativo e conciso.

## Principais Conceitos

- **Expressões Lambda**: Funções anônimas e curtas que podem ser passadas como argumentos ou atribuídas a variáveis. A sintaxe básica usa o operador `->` (ex: `(a, b) -> a.compareTo(b)` ou `x -> x * 2`).
- **Interfaces Funcionais**: Interfaces que possuem **um único método abstrato** (anotadas com `@FunctionalInterface`), como `Function`, `Predicate`, `Consumer` e `Supplier`.
- **API de Streams (`java.util.stream`)**: Permite manipular coleções de dados de forma declarativa usando encadeamento de métodos, como `.filter()`, `.map()`, `.reduce()` e `.collect()`.
- **Imutabilidade**: Estímulo ao uso de valores constantes e dados que não mudam após a criação, reduzindo efeitos colaterais.
- **Referências de Métodos (`Method References`)**: Atalhos para chamadas de métodos usando o operador `::` (ex: `String::toUpperCase`)

### Exemplo Prático com Stream e Lambda

```java
	import java.util.List;

	public class ExemploFuncional {
	    public static void main(String[] args) {
	        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

	        // Paradigma funcional: filtrando pares e multiplicando por 2
	        numeros.stream()
	               .filter(n -> n % 2 == 0) // Predicate
	               .map(n -> n * 2)         // Function
	               .forEach(System.out::println); // Method Reference
	    }
	}

``` 