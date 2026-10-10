public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto("Calça", 59.90, 30);

		System.out.println(produto.exibirProduto());
	
		Carro carro1 = new Carro("Desconhecido", "Desconhcido", 0);
		Carro carro2 = new Carro("Nissan", "kicks", 0);
		Carro carro3 = new Carro("Honda", "hrv", 2026);

		carro1.exibirCarro();
		carro2.exibirCarro();
		carro3.exibirCarro();


	}
}