public class Exec2 {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();

		livro.exibirLivro();
		livro1.exibirLivro();
		livro2.exibirLivro();


	}
}

class Livro {
	public String titulo;
	protected String anoPublicacao;
	private String autor;
	double preco;

	public Livro(){
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = "0";
		this.preco =  0.0;
	}

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = "0";
		this.preco =  0.0;
	}

	public Livro(String titulo, String autor, String anoPublicacao, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}

	public void exibirLivro() {
		System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao 
			+  "\nPreço: " + preco);
		System.out.println();
	}
}	 




