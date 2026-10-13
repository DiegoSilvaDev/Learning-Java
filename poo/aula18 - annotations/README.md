# Java Annotations (Anotações)

As anotações em Java (introduzidas no Java 5) são **metadados** inseridos no código-fonte que fornecem informações adicionais sobre classes, métodos, campos e parâmetros, sem alterar diretamente a lógica de execução do programa.

- Adicionar metadados
- Fornecem informações
	- Ferramentas de compilação
	- Bibliotecas
	- Frameworks
	- Partes do código.

	- Exemplo: 

	```java
		public class MinhaCasa extends SuperClasse { 

			@Override

			public void meuMetodo {

				// Sua implementação aqui

			}
		}
	```

## Para que servem?

- **Instruções para o compilador**: Avisam sobre erros ou comportamentos (ex: `@Override`).
- **Geração de código ou arquivos**: Ferramentas e IDEs leem as anotações para gerar código auxiliar.
- **Configuração em frameworks**: Frameworks como **Spring Boot**, **Hibernate/JPA** e **JUnit** usam anotações para mapear rotas, tabelas de banco de dados, injeção de dependência e testes, substituindo arquivos XML extensos.


## Exemplos nativos comuns

- **`@Override`**: Indica que o método está sobrescrevendo um método da superclasse.
- **`@Deprecated`**: Marca uma classe ou método como obsoleto, avisando que seu uso deve ser evitado.
- **`@SuppressWarnings`**: Solicita ao compilador que ignore determinados avisos.

### Como criar uma anotação personalizada?

Você define uma anotação usando a palavra-chave `@interface` e utiliza **meta-anotações** para configurar seu comportamento.

- Exemplo:

```java
	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	@Target(ElementType.METHOD) // Onde ela pode ser aplicada (métodos, classes, campos...)
	@Retention(RetentionPolicy.RUNTIME) // Por quanto tempo ela fica disponível (SOURCE, CLASS, RUNTIME)
	
	public @interface MinhaAnotacao {
	    String valor() default "padrão";
	}
```

- **`@Target`**: Define o alvo da anotação (ex: `ElementType.CLASS`, `ElementType.FIELD`, `ElementType.METHOD`).
- **`@Retention`**: Define o nível de visibilidade:
	- `SOURCE`: Descartada após a compilação.
	- `CLASS`: Gravada no arquivo `.class`, mas não lida pela JVM.
	- `RUNTIME`: Disponível em tempo de execução para ser lida via **Reflection**.