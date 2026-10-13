public class Exec3 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
 
		p.setTelefone(1111111111);
		System.out.println(p.getTelefone());

		p.setEndereco("Rua tal");
		System.out.println(p.getEndereco());

		p.setIdade(22);
		System.out.println(p.getIdade());


	}
}

class Pessoa {
	public String nome;
	private int idade;
	protected String endereco;
	int telefone;

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade) {
		this.nome = nome;
	}

	public int getTelefone(){
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}	




