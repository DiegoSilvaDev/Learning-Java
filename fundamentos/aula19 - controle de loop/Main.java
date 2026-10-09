public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break; // Encerra o laço quando i for igual a 5
			}

			System.out.println(i);
		}

		System.out.println(); // espaçamento

		for (int j = 0; j < 10; j++) {
			if (j == 5 ) {
				continue; // Pula a iteração quando j for igual a 5, ou seja pula o 5
			}

			System.out.println(j);
		}
	} 
}

		