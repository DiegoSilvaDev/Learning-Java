public class FuncionarioDefault {
	String nome;
	String cargo;
	int idade;

	FuncionarioDefault(String nomeInit, String cargoInit, int idadeInit) {
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}
	FuncionarioDefault() {

	}

	public static void main(String[] args) {
		
		// Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 30);
	
		FuncionarioDefault funcionario1 = new FuncionarioDefault();
		funcionario1.nome = "João";

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);
		
	}
}