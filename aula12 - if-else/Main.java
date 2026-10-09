public class Main {
	public static void main(String[] args) {
		int numero = 10;
		String resultado;

		if(numero % 2 == 0) {

			resultado = "Par";

		} else {

			resultado = "Ímpar";
		}

		System.out.println("O número é: " + resultado);

		int numeroT = 10;

		String resultadoT = (numeroT % 2 == 0) ? "Par" : "Ímpar";

		System.out.println("O numero é: " + resultadoT);
  	}	

}

		