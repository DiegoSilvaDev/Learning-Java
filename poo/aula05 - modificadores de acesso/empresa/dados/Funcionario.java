package empresa.dados;


public class Funcionario {
	private String nome;
	double salario;

	private Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
	}
	public Funcionario() {
		Funcionario func = new Funcionario("Mario", 4000);
	}
}