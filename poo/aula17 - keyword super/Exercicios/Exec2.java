class Funcionario {
	private String nome;
	private double salario;

	void addAumento(double valor){
		salario	+= valor;
	}

	double getSalario() {
		return this.salario;
	}

	void setSalario(double salario){
		this.salario = salario;
	}

	String getNome(){
		return this.nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	double ganhoAnual(){
		return salario * 12;
	}
	
}

class Assistente extends Funcionario {
	private int numeroMatricula;

	double ganhoAnual(){
		return super.ganhoAnual() + 1000;
	}
}

public class Exec2 {
	public static void main(String[] args) {
		Assistente func = new Assistente();

		func.setNome("João");
		func.setSalario(3000.00);
		func.addAumento(500);

		System.out.println("Nome: " + func.getNome() + "\nSalario anual: R$" + func.ganhoAnual());
	}
}