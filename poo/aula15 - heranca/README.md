# Herança em Java

A herança em Java <mark style="background-color: lightcyan;">é um mecanismo da Programação Orientada a Objetos (POO) que permite criar novas classes (chamadas de subclasses ou classes filhas) a partir de classes já existentes (superclasses ou classes pais), reutilizando atributos e métodos</mark>.

- `extends` para criar uma subclasse.
- Princípio do `é um` para criar uma subclasse.

	- Exemplo: 

	```java
		class Animal { // Superclasse
			void comer {

			}
		}

		class Cachorro extends Animal { // Subclasse
			void latir() {

			}
		}
	```

	Neste exemplo, `Cachorro` é uma subclasse de `Animal`. Isso significa que um objeto `Cachorro` pode usar o método `comer()` da classe `Animal`, além do método `latir()` que é específico  da classe `Cachorro`.

## Conceitos Principais

- **Palavra-chave `extends`**: É utilizada para indicar que uma classe herda de outra (ex: `class Cachorro extends Animal`).
- Relação "É um": Define a hierarquia; por exemplo, um `Cachorro` é um `Animal`, e um `Professor` é uma `Pessoa`.
- **Palavra-chave `super`**: Usada para referenciar a superclasse imediata, permitindo invocar construtores ou acessar métodos e atributos da classe pai.
- **Sobrescrita (Override)**: Permite que a subclasse altere ou redefina o comportamento de um método herdado da superclasse.
- **Classe `Object`**: É a raiz de toda a hierarquia de classes em Java; se uma classe não estende explicitamente nenhuma outra, ela herda implicitamente de `Object`.
- **Herança Simples**: O Java suporta apenas **herança simples** de classes (uma classe só pode ter uma única superclasse direta). Para simular herança múltipla, a linguagem utiliza interfaces com a palavra `implements`.

### Sintaxe básica

```java
	// Superclasse (Classe Pai)
	public class Pessoa {
	    protected String nome;
	    
	    public void falar() {
	        System.out.println("Olá!");
	    }
	}

	// Subclasse (Classe Filha)
	public class Aluno extends Pessoa {
	    private String matricula;
	    
	    public void estudar() {
	        System.out.println("Estudando...");
	    }
	}

```