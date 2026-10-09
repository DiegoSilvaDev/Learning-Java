public class Main {
	public static void main(String[] args) {
		String day = "Ter.";

		String typeOfDay = switch (day) {
			case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
			case "Sabado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido";
		};

		System.out.println(typeOfDay); // Dia util
		  	}	

}

		