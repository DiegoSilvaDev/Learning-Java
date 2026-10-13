# Palavra-chave `super` em Java

A *palavra-chave* `super` em Java é usada dentro de uma subclasse (classe filha) para fazer referência direta à sua superclasse (classe mãe).

- Referência à superclasse imediata.

	- Exemplo: 

	```java
		public class Animal { 
			public void fazerSom {
				System.out.println("O animal faz um som");
			}
		}

		public class Cachorro extends Animal { 
			@Override
			public void fazerSom() {
				super.fazerSom();
				System.out.println("O cachorro late");
			}
		}
	```

	Neste exemplo, a classe `Cachorro` chama o método `fazerSom()` da superclasse `Animal` usando a palavra-chave `super`. Portanto, quando você chama `fazerSom()` em um objeto `Cachorro`, a mensagem `"O animal faz um som"` e `"O cachorro late` são exibidas. 


A palavra-chave `super` é empregada principalmente em três cenários na Programação Orientada a Objetos:

### 1. Chamar o construtor da superclasse (`super(...)`)

- É usada para invocar o construtor da classe mãe.
- Pode chamar um construtor sem argumentos (`super()`) ou com parâmetros (`super(arg1, arg2)`).
- **Regra importante**: Se declarada, a chamada `super(...)` deve ser obrigatoriamente a **primeira instrução** dentro do construtor da subclasse. Se você não a colocar explicitamente, o Java insere um `super()` padrão (sem argumentos) de forma automática.

### 2. Acessar métodos sobrescritos (`super.metodo()`)

- Quando a subclasse sobrescreve (`override`) um método da classe mãe, você pode usar `super.nomeDoMetodo()` para executar a versão original que está na superclasse.

### 3. Acessar variáveis ocultas (`super.variavel`)

- Se a subclasse declara uma variável com o **mesmo nome** de uma variável existente na superclasse (ocultando-a), o uso de super.variavel permite recuperar o valor definido na classe mãe.

#### Exemplo prático

```java
	class Pessoa {
	    String nome;

	    Pessoa(String nome) {
	        this.nome = nome;
	    }

	    void exibirInfo() {
	        System.out.println("Nome: " + nome);
	    }
	}

	class Aluno extends Pessoa {
	    String matricula;

	    Aluno(String nome, String matricula) {
	        super(nome); // Chama o construtor da classe Pessoa
	        this.matricula = matricula;
	    }

	    @Override
	    void exibirInfo() {
	        super.exibirInfo(); // Chama o método da classe Pessoa
	        System.out.println("Matrícula: " + matricula);
	    }
	}

```