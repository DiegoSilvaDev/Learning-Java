# Interface Funcional

Uma **interface funcional** em Java é qualquer interface que possui exatamente um único método abstrato. Elas são a base para o uso de **expressões lambda** e **method references** no Java (introduzidas no **Java 8**).

## Características Principais

- **Regra do método único**: Deve ter apenas um método abstrato (conhecido como *Single Abstract Method* ou **SAM**).
- **Métodos `default` e `static`**: Podem conter vários métodos padrão (`default`) ou estáticos com implementação própria.
- **Anotação `@FunctionalInterface`**: Opcional, mas recomendada. O compilador gera um erro se você tentar colocar mais de um método abstrato nela.

## Principais Interfaces Funcionais do Java

O pacote `java.util.function` fornece dezenas de interfaces prontas:

| **Interface** | **O que faz** | **Exemplo de Método** |
|:---:|:---:|:---:|
| `Supplier<T>` | Não recebe argumento e **retorna** um valor de tipo `T`. | `T get()` |
| `Consumer<T>` | Recebe um argumento `T` e não **retorna nada** (executa uma ação).| `void accept(T t)` |
| `Predicate<T>` | Recebe um argumento `T` e **retorna um booleano** (`true` ou `false`). | `boolean test(T t)` |
| `Function<T, R>` | Recebe um argumento `T` e **retorna** um resultado `R` (transformação). | `R apply(T t)` |
| `UnaryOperator<T>` | Recebe e retorna um valor do **mesmo tipo** `T` (estende `Function`). | `T apply(T t)` |	
| `BinaryOperator<T>` | Recebe dois argumentos do tipo `T` e **retorna** um resultado também do tipo `T`. | `T apply(T t1, T t2)` |

### Exemplo Prático com Lambda

```java
	// Definindo a interface funcional
	@FunctionalInterface
	interface Calculadora {
	    int calcular(int a, int b);
	}

	public class Main {
	    public static void main(String[] args) {
	        // Implementando com Expressão Lambda
	        Calculadora soma = (a, b) -> a + b;

	        System.out.println(soma.calcular(5, 3)); // Saída: 8
	    }
	}
``` 