public class Exec1 {
	public static void main(String[] args) {
		int mont = 2;

		switch (mont) {
		case 1 -> System.out.println("Jan");
		case 2 -> System.out.println("Fev");
		case 3 -> System.out.println("Mar");
		case 4 -> System.out.println("Abr");
		case 5 -> System.out.println("Mai");
		case 6 -> System.out.println("Jun");
		case 7 -> System.out.println("Jul");
		case 8 -> System.out.println("Ago");
		case 9 -> System.out.println("Set");
		case 10 -> System.out.println("Out");
		case 11 -> System.out.println("Nov");
		case 12 -> System.out.println("Dez");

		default -> System.out.println("Mês desconhecido (1 a 12)");
		}

	}
}

		