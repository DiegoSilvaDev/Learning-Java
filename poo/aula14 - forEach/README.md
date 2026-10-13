# For-each (ForEach) em Java

O [Java For-Each Loop - W3Schools](https://www.w3schools.com/Java/java_foreach_loop.asp) é uma estrutura de repetição usada para percorrer elementos de arrays ou coleções (como `List`, `Set`) de forma simples, direta e sem a necessidade de gerenciar índices ou contadores.


## **1. Laço For-Each (Enhanced For Loop - Java 5)**

É a estrutura nativa da linguagem para iterar sobre coleções ou arrays de maneira legível:

### Sintaxe

```java
	for (TipoVariavel nomeVariavel : arrayOuColecao) {
	    // Código executado para cada elemento
	}
```

#### Exemplo prático

```java
	String[] frutas = {"Maçã", "Banana", "Laranja"};

	for (String fruta : frutas) {
	    System.out.println(fruta);
	}
```

- **Vantagens**: Reduz a quantidade de código, evita erros de `ArrayIndexOutOfBoundsException` e melhora a legibilidade.
- **Limitações**: Não fornece acesso ao índice numérico da posição atual e não permite modificar elementos de um array primitivo diretamente (a variável do loop recebe apenas uma cópia do valor).

## **2. Método `forEach()` (Java 8+)**

Diferente do laço estrutural do Java 5, o método `forEach()` pertence às APIs de `Iterable` e `Stream` (introduzido no Java 8). Ele recebe uma expressão lambda ou referência de método (`Consumer`):

### Sintaxe

```java
	listaOuColecao.forEach(elemento -> {
	    // Ação a ser executada para cada elemento
	});
```

#### Exemplo prático

```java
	List<String> frutas = List.of("Maçã", "Banana", "Laranja");

	// Usando expressão lambda
	frutas.forEach(fruta -> System.out.println(fruta));

	// Usando Method Reference
	frutas.forEach(System.out::println);
```

- **Vantagens**: Integração fluida com a API de Streams, permitindo encadeamento de filtros e mapeamentos, além de possibilitar processamento paralelo (`parallelStream`).
- **Limitações**: Não aceita variáveis locais que não sejam `final` ou efetivamente `final` dentro do escopo da lambda, e lida com exceções checadas (`checked exceptions`) de forma mais verbosa.