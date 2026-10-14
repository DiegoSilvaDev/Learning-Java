# Classes abstratas em Java

Uma **classe abstrata em Java** é um modelo estrutural para outras classes que não pode ser instanciado diretamente, ou seja, você não pode usar `new` para criar um objeto dela.

Elas servem como base para compartilhar código comum e definir regras que as classes filhas (subclasses) devem seguir.

### A Palavra-chave `abstract`:

```java
	
	public abstract class Animal {
		public abstract void fazerSom();

		public void comer() {
			System.out.println("O animal está comendo");
		}

	} 

	// Classe que herda da classe abstrata
	public class Cachorro extends Animal {
		public void fazerSom() {
			System.out.println("O cachorro late");
		}
	}	
```

Neste exemplo, `Animal` é uma classe abstrata que tem um método abstrato `fazerSom()` e um método não abstrato `comer()`. A classe `Cachorro` herda da classe `Animal` e fornece uma implementação para o método `fazerSom()`.

## Principais Características

- **`Interface`**: Podem implementar interfaces.
- **Palavra-chave `abstract`**: É declarada usando o modificador `abstract` na assinatura da classe.
- **Não pode ser instanciada**: Tentar executar `new MinhaClasseAbstrata()` gera um erro de compilação.
- **Métodos concretos e abstratos**: Pode conter métodos com código pronto (implementados) e métodos apenas declarados (sem corpo).
- **Métodos abstratos**: Declarados com a palavra `abstract` e terminados em ponto e vírgula. As subclasses concretas são **obrigadas** a implementar esses métodos.
- **Atributos e Construtores**: Pode possuir variáveis de instância e construtores que são chamados pelas subclasses através do `super()`.


### Exemplo prático

```java
	// Classe abstrata
	public abstract class Animal {
	    private String nome;

	    public Animal(String nome) {
	        this.nome = nome;
	    }

	    // Método concreto (compartilhado)
	    public void dormir() {
	        System.out.println(nome + " está dormindo.");
	    }

	    // Método abstrato (sem corpo {}, obriga a implementação na filha)
	    public abstract void emitirSom();
	}

	// Subclasse concreta
	public class Cachorro extends Animal {

	    public Cachorro(String nome) {
	        super(nome);
	    }

	    @Override
	    public void emitirSom() {
	        System.out.println("O cachorro faz: Au Au!");
	    }
	}

```

## Quando usar Classes Abstratas vs. Interfaces?

- **Use Classe Abstrata quando**: Você tem classes com uma forte relação hierárquica ("é um"), deseja compartilhar código (atributos ou métodos já implementados) e precisa de construtores ou estados (variáveis).
- **Use Interface quando**: Você precisa definir um contrato que classes de diferentes hierarquias podem implementar, ou quando deseja simular herança múltipla em Java.
