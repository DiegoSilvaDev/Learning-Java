# Polimorfismo 

O **polimorfismo** em Java é a capacidade de um mesmo método ou objeto se comportar de diferentes maneiras dependendo do contexto em que é utilizado. A palavra vem do grego e significa "muitas formas".

Existem dois tipos principais de polimorfismo em Java:

## 1. Polimorfismo Estático (Sobrecarga / Overload)

- **O que é**: Ocorre quando você define vários métodos com o **mesmo nome** dentro da mesma classe, mas com **assinaturas diferentes** (quantidade ou tipos de parâmetros diferentes).
- **Resolução**: É decidido em **tempo de compilação**.
	- **Exemplo prático**:
	
		```java
			
			public class Calculadora {
			    public int somar(int a, int b) {

			        return a + b;
			    
			    }

			    public double somar(double a, double b) {
			    
			        return a + b;
			    
			    }
			}

		```

## 2. Polimorfismo Dinâmico (Sobreposição / Override)

- **O que é**: Ocorre quando uma subclasse (filha) reescreve um método herdado de uma superclasse (pai), mantendo a mesma assinatura.
- **Resolução**: É decidido em **tempo de execução** pela Java Virtual Machine (JVM), através da ligação dinâmica (*late binding*).
	- **Exemplo prático**:

		```java
			
			class Animal {
			    public void emitirSom() {
			        System.out.println("Som de animal");
			    }
			}

			class Cachorro extends Animal {
			    
			    @Override
			    public void emitirSom() {

			        System.out.println("Latido: Au Au");

			    }
			}

			// Uso:
			Animal meuPet = new Cachorro();
			meuPet.emitirSom(); // Executa o método da classe Cachorro ("Latido: Au Au")


		```

## Principais Vantagens

- **Flexibilidade e Extensibilidade**: Você pode adicionar novas classes (como a classe `Gato` herdando de `Animal`) sem precisar reescrever o código que lida com os animais.
- **Reutilização de Código**: Permite criar lógicas genéricas baseadas em tipos mais amplos (como classes abstratas ou interfaces).