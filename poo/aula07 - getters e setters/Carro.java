public class Carro {
	private String marcaCarro;
	private String modeloCarro;
	private int anoCarro;

	public Carro () {
		marcaCarro = "Desconhecido";
		modeloCarro = "Desconhecido";		
		anoCarro = 0;
	}
	public Carro(String marca, String modelo){
		this.marcaCarro = marca;
		this.modeloCarro = modelo;
		anoCarro = 0;
	}
	public Carro(String marca, String modelo, int ano) {
		this.marcaCarro = marca;
		this.modeloCarro = modelo;
		this.anoCarro = ano;
	}

	public void exibirCarro() {
		System.out.println();
		System.out.println("Marca: " + marcaCarro + "\nModelo: " + modeloCarro + "\nAno: " + anoCarro); 	
		System.out.println(); // Espaçamento
	}
}