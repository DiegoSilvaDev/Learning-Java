class Animal {
	String nome;

	Animal(String nome) {
		this.nome = nome;
	}
}

class Cachorro extends Animal {
	String raca;

	Cachorro(String nome, String raca) {
		super(nome); // Chama o construtor da superclasse Animal
		this.raca = raca;
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex", "Labrador");
		System.out.println("Nome: " + dog.nome + "\nRaça: " + dog.raca);
	}
}