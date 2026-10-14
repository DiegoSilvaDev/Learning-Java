# Casos especiais de `Interface` em Java

Em Java, casos especiais de interfaces referem-se a tipagens e formatos que fogem ao modelo clássico de apenas declarar múltiplos métodos abstratos, desempenhando papéis específicos na linguagem.

- Métodos `default` e `static`.
- Métodos `default` e `static` não precisam ser sobrescritos.

### Interface em Java com métodos abstract, default e static:

```java
	public interface ExemploInterface{
		// Método abstract
		void meuMetodoAbstract();

		// Método default
		default void meuMetodoDefault(){
			System.out.println("Implementação do método default");
		}

		// Método static
		static void meuMetodoStatic() {
			System.out.println("Implementação do método static");
		}

	}
```

## Principais Casos Especiais

- **Interfaces Funcionais (Functional Interfaces)**
	- Possuem `exatamente um método abstrato` (chamadas de SAM - *Single Abstract Method*).
	- Podem ser anotadas com `@FunctionalInterface` para forçar o compilador a validar essa regra.
	- Permitem o uso de **expressões lambda** e referências a métodos.
	- Exemplos clássicos do pacote `java.util.function`: `Predicate`, `Function`, `Consumer`, `Supplier`, `UnaryOperator` e `BinaryOperator`.
- **Interfaces de Marcação (Marker Interfaces)**
	- Não possuem nenhum método ou constante em seu corpo (corpo vazio).
	- Servem apenas para "rotular" uma classe, informando à JVM ou a uma biblioteca que aquela classe possui uma capacidade ou comportamento especial.
	- Exemplos nativos: `Serializable`, `Cloneable` e `Remote`
- **Interfaces com Métodos `default` e `static` (Introduzidas no Java 8)**
	- **Métodos `default`**: Permitem adicionar implementações padrão diretamente na `interface` sem quebrar as classes antigas que já a implementavam.
	- **Métodos `static`**: Pertencem à própria `interface` e são chamados diretamente pelo nome dela (ex: I`nterface.metodoEstatico()`), sem precisar de uma instância.
- **Interfaces Seladas (Sealed Interfaces - Java 17+)**
	- Restringem **quais classes ou interfaces podem implementá-las**.
	- O autor do código controla a hierarquia usando a palavra-chave `sealed` e especificando os permitidos com `permits`.
