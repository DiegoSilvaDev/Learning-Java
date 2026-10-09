public class Bolo {
	int quantidadeAcucar = 288; // inicialiaza sempre 0

	public static void main(String[] args) {
		Bolo boloDeChocolate = new Bolo();

		boloDeChocolate.quantidadeAcucar = 200;

		Bolo boloDeBaunilha = new Bolo();

		boloDeBaunilha.quantidadeAcucar = 150;

		System.out.println("Quantidade de açúcar no bolo de chocolate: " + 
		boloDeChocolate.quantidadeAcucar);

		System.out.println("Quantidade de açúcar no bolo de baunilha: " + 
		boloDeBaunilha.quantidadeAcucar);
	}
}