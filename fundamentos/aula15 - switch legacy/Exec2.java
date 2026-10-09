public class Exec2 {
	public static void main(String[] args) {
		String mont = "Abril";

		switch (mont) {
		case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println(mont +" tem 30 dias");
		case "Janeiro", "Março", "Julho", "Agosto", "Outubro", "Dezembro" -> System.out.println(mont +" tem 31 dias");
		case "Fevereiro" -> System.out.println(mont + " tem 28 dias");

		default -> System.out.println("Mês desconhecido");

		}

		int mes = 5; // Exemplo: 5 representa maio
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
		 	System.out.println("Novembro");
		 	break;
		case 12:
			 System.out.println("Dezembro");
			 break;
		default:
		 	System.out.println("Valor inválido para mês.");
		}


	}
}

		