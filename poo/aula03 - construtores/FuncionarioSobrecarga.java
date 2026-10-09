public class FuncionarioSobrecarga {
	String nome;
	String cargo;
	int idade;


	FuncionarioSobrecarga(int idadeInit, String cargoInit, String nomeInit) {
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}
	FuncionarioSobrecarga(String nomeInit, String cargoInit, int idadeInit) {
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}
	FuncionarioSobrecarga(String nomeInit) {
		nome = nomeInit;
	}
	FuncionarioSobrecarga() {

	}

	public static void main(String[] args) {
			
		FuncionarioSobrecarga funcionario1 = new FuncionarioSobrecarga(50, "Gerente", "Maria");

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);
		
	}
}