public class Main  {
	
	public static void main(String[] args) {
		int[] meuArray; // Declaração de Arrays;

		meuArray = new int[3]; // Criação do Array
		meuArray[0] = 5;
		meuArray[1] = 8;
		meuArray[2] = 2;

		meuArray = new int[]{5, 8, 2}; //  Cria e preenche o array com valores

		System.out.println(meuArray[0]); // Saída: 5
		System.out.println(meuArray[1]); // Saída: 8
		System.out.println(meuArray[2]); // Saída: 2
		System.out.println(); // Espaçamento

		// Alterando Elementos dentro do Array

		meuArray[0] = 10;

		System.out.println("Valor de [0] alterado: " + meuArray[0]); // Saída: 10
		System.out.println(); // Espaçamento

		// Percorrendo Arrays com (for)

		for( int i = 0; i < meuArray.length; i++) {
			System.out.println("Valores do array: " + meuArray[i]);
		}
		System.out.println(); // Espaçamento

		// Percorrendo Arrays com (for-each)

		for(int i : meuArray) {
			System.out.println(i);
		}
	}
}	


