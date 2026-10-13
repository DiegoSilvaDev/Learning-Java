public class Exec1 {

	public static void main(String[] args) {
		SalaDeAula a1 = new SalaDeAula();
		SalaDeAula a2 = new SalaDeAula();

		a1.Contador();
		a2.Contador();

		System.out.println("O número de objetos criados é: " + SalaDeAula.total);
	}
}

class SalaDeAula {
	static int total = 0;

	static public void Contador(){
		total += 1;
	}
}	




