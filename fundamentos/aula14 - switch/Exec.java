public class Exec {
	public static void main(String[] args) {
		int nivel = 1;

		String satisfaction = switch (nivel) {
			case 1 -> "Muito insatisfeito";
			case 2 -> "Insatisfeito";
			case 3 -> "Neutro";
			case 4 -> "Satisfeito";
			case 5 -> "Muito satisfeito!";
			default -> "Opção inválida, deve estar entre (1 e 5)";
		};

		System.out.println(satisfaction); // Dia util
		  	}	

}

		