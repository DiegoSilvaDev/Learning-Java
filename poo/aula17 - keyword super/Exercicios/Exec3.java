class Pessoa {
	String nome;
	int idade;

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}

class Estudante extends Pessoa {
	private int matricula;

	Estudante(String nome, int idade, int matricula) {
		super(nome, idade); // Chama o construtor da superclasse Animal
		this.matricula = matricula;
	}

	int getMatricula(){
		return matricula;
	}

	void obterInfo() {
		System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula());
	}
}

public class Exec3 {
	public static void main(String[] args) {
		Estudante aluno = new Estudante("João", 15, 041);
		aluno.obterInfo();
	}
}