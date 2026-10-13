class Minhaclasse  {

	
	public int calcularSoma(int num1, int num2) {
		return num1 + num2;
	}

	@Deprecated
	public int calcularProduto(int num1, int num2) {
		return num1 + num2;
	}
}	

public class Exec1 {

	public static void main(String[] args) {
		Minhaclasse prin =  new Minhaclasse();

		System.out.println(prin.calcularSoma(20, 20));

		System.out.println(prin.calcularProduto(20,20));
	}
}




