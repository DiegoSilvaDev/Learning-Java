public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto (String nome, double preco, int quantidaEstoque) {
		this.nome = nome;
		this.preco = preco;
	}

	public String exibirProduto() {
		return "Produto: " + nome + "\nPreço: " + preco;
	}
}