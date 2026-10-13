# Override -  Sobrescrita de métodos (Method Overriding)

O conceito de **overriding** (*sobrescrita de métodos*) em Java <mark style = "background-color: lightcyan;">acontece quando uma subclasse (filha) fornece uma implementação específica para um método que já foi definido em sua superclasse (pai)</mark>.

- `extends` para criar uma subclasse.
- Princípio do `é um` para criar uma subclasse.

	- Exemplo: 

	```java
		public class Animal { 
			public void fazerSom {
				System.out.println("O animal faz um som");
			}
		}

		public class Cachorro extends Animal { 
			public void fazerSom() {
				System.out.println("O cachorro late");
			}
		}
	```

	Neste exemplo, a classe `Cachorro` sobrescreve o método `fazerSom()` da classe `Animal`. Portanto, quando você chama `fazerSom()` em um objeto `Cachorro`, a mensagem `"O cachorro late"` é exibida em vez de `"O animal faz um som"`. 

## O que é e para que serve

- **Mesma assinatura**: O método na classe filha deve ter o mesmo nome, os mesmos parâmetros e o mesmo tipo de retorno (ou um subtipo covariante) do método na classe pai.
- **Comportamento dinâmico**: O Java decide qual método executar em tempo de execução (*runtime*) com base no tipo real do objeto criado, e não no tipo da variável de referência.
- **Anotação `@Override`**: É uma instrução opcional, mas recomendada, que avisa o compilador e outros desenvolvedores que aquele método está sobrescrevendo outro. Se você digitar o nome do método errado por engano, o compilador gera um erro informando que não há método correspondente para sobrescrever. Você pode consultar a documentação oficial da [Oracle Help Center](https://docs.oracle.com/javase/8/docs/api/java/lang/Override.html) para detalhes técnicos.

### Regras importantes do Overriding

- **Métodos estáticos (`static`)**: Não podem ser sobrescritos; se você declarar um método estático igual na filha, você estará apenas escondendo (*hiding*) o método da classe pai.
- **Métodos finais (`final`)**: Não podem ser sobrescritos.
- **Métodos privados (`private`)**: Não são herdados, portanto não podem ser sobrescritos.
- **Modificadores de acesso**: O método sobrescrito na classe filha **não** pode ser mais restritivo do que o da classe pai (por exemplo, se o pai é `public`, o filho não pode ser `private` ou `protected`).
- **Exceções**: O método na classe filha não pode lançar exceções *checked* mais amplas do que as declaradas pelo método original.

#### Exemplo prático

```java
	public class Animal {
	    void emitirSom() {
	        System.out.println("Som genérico do animal");
	    }
	}

	public class Cachorro extends Animal {
	    @Override
	    void emitirSom() {
	        System.out.println("Au au!");
	    }
	}
```