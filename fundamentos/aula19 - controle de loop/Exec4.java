public class Exec4 {
	public static void main(String[] args) {
		int codigoDeSaida = 9;

		for(int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++ ) {
			if (codigoCarteirinha  == codigoDeSaida) {
				System.out.println("codigoDeSaida foi encontrado");
				break;
			}

		}

		System.out.println(); // Espaçamento

		for (int codigoCarteirinha = 1; codigoCarteirinha <= 10 ; codigoCarteirinha++ ) {

			// if(codigoCarteirinha == 3) {
			// 	System.out.println("O código foi aceito: " + codigoCarteirinha);
			// } else if (codigoCarteirinha == 7) {
			// 	System.out.println("O código foi aceito: " + codigoCarteirinha);
			// } else if (codigoCarteirinha == 10) {
			// 	System.out.println("O código foi aceito: " + codigoCarteirinha);
			// } else {
			// 	System.out.println("O código " + codigoCarteirinha +  " não é valido para o hospital");
			// 	continue;

			// }

			if(codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
					System.out.println("O código da carteirinha " + codigoCarteirinha + 
						" é aceito");
					continue;
			}

			System.out.println("O código " + codigoCarteirinha + " não é aceito." );
			
		}

	} 
}

		