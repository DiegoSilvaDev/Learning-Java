# Expressões Lambda

As **expressões lambda** em Java (introduzidas no **Java 8**) são funções anônimas (sem nome) que permitem escrever código de forma mais concisa, eliminando a verbosidade de classes anônimas para implementar interfaces funcionais.

- **O que são expressões lambda?**
- **Sintaxe das expressões lambda**
	1. **Argumentos**
	2. **Setas " -> "**
	3. **Corpo "{...}"**

- ### Exemplo
	```java
		List<Integer> listaDeNumeros = new Arrays.asList(1, 2, 3, 4, 5);

		for(Integer elemento: listaDeNumeros) {
			System.out.println(elemento);
		}
	```
- ### Agora, o mesmo exemplo usando Expressão lambda 

	```java
		List<Integer> listaDeNumeros = new Arrays.asList(1, 2, 3, 4, 5);

		listaDeNumeros.forEach( (Integer numero) -> System.out.println(numero));
	```
**Obs**: `numero -> System.out.println(numero)` é a expressão lambda.

### Sintaxe Básica

- **Lista de parâmetros**: Variáveis que a função recebe (os tipos podem ser explícitos ou inferidos pelo compilador).

- **Operador seta (`->`)**: Separa os parâmetros do corpo da função.
- **Corpo**: A ação ou o cálculo a ser realizado. Pode ser uma única expressão ou um bloco de código entre chaves `{}`.

#### Exemplos de sintaxe:

- **Sem parâmetros**: `() -> System.out.println("Olá")`
- **Um parâmetro (parênteses opcionais)**: `n -> n * 2`
- **Múltiplos parâmetros**: `(a, b) -> a + b`
- **Bloco de código com `return`**: `(x, y) -> { int soma = x + y; return soma; }`

## O que é uma Interface Funcional?

Para usar uma expressão lambda em Java, ela precisa estar associada a uma **Interface Funcional** que é qualquer interface que possua **exatamente um único método abstrato**.

É uma boa prática (mas não obrigatória) utilizar a anotação `@FunctionalInterface` para sinalizar isso:

```java
	@FunctionalInterface
	interface Calculadora {
	    int calcular(int a, int b);
	}

	// Usando a lambda:
	Calculadora soma = (a, b) -> a + b;
	int resultado = soma.calcular(5, 3); // Retorna 8

```

## Principais Interfaces Funcionais Nativas (`java.util.function`)

O Java já traz prontas várias interfaces funcionais comuns no pacote `java.util.function`:

- `Predicate<T>`: Recebe um valor e retorna boolean (muito usado em filtros).
	- Exemplo: `s -> s.isEmpty()`
- `Consumer<T>`: Recebe um valor e não retorna nada (`void`).
	- Exemplo: `s -> System.out.println(s)`
- `Function<T, R>`: Recebe um tipo `T` e retorna um tipo `R` (transfere/converte dados).
	- Exemplo: `s -> s.length()`
- `Supplier<T>`: Não recebe parâmetros e fornece/retorna um valor `T`.
	- Exemplo: `() -> new Object()`

### Uso prático com Streams e Coleções

As expressões lambda brilham quando combinadas com a Stream API ou métodos de coleção como `forEach`:

```java
	import java.util.List;

	public class ExemploLambda {
	    public static void main(String[] args) {
	        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Amanda");

	        nomes.stream()
	             .filter(nome -> nome.startsWith("A")) // Filtra nomes com 'A'
	             .forEach(nome -> System.out.println(nome)); // Imprime cada um
	    }
	}

```

