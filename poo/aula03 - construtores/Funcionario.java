public class Funcionario {
	String nome;
	String cargo;
	int idade;


	// Funcionario(String nome, String cargo, int idade) {
	// 	this.nome = nome;
	// 	this.cargo = cargo;
	// 	this.idade = idade;
	// }

	Funcionario(String nomeInit, String cargoInit, int idadeInit) {
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 30);

		Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 50);

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("idade: " + funcionario1.idade);

		System.out.println(); // Espaçamento

		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("idade: " + funcionario2.idade);
	}
}