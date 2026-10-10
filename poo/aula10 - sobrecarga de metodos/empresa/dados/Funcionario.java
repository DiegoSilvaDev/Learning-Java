package empresa.dados;


public class Funcionario {
	private String nome;
	public double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String obterInfo() {
		return "Nome: " + nome + "\nSalario: " + salario;
	}

	public void aumentarSalario(double aumento) {
		salario += aumento;
		// aumento += 1000;	
	}
	
	public void aumentarSalario(int porcentagem) {
			salario += salario * porcentagem / 100.0;
		}

	public void alterarQualquerSalario(Funcionario func, double novoSalario) {
		func.salario = novoSalario;
	}


}