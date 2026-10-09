public class Main {
	public static void main(String[] args) {
		int dayOfWeek = 3; // 1 Representa segunda, 2 terça, e assim por diante.

		switch (dayOfWeek) {
		case 1:
			System.out.println("Seg.");
			break;
		case 2:
			System.out.println("Ter.");
			break;
		case 3:
			System.out.println("Qua.");
			break;
		case 4:
			System.out.println("Qui.");
			break;
		case 5: 
			System.out.println("Sex.");
			break;
		default: 
			System.out.println("Dia desconhecido");
			break;
		}

	}
}

		