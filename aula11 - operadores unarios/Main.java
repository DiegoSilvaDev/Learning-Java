public class Main {
	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println(a);

		a--; // a = a - 1;
		System.out.println(a); // Saída: 9


		int b = a--; // Pós-decremento
		System.out.println("Valor de a: " + a); // Saída: 9
		System.out.println("Valor de b: " + b); // Saída: 10

		int c = --a; // Pré-decremento
		System.out.println("Valor de a: " + a); // Saída: 8
		System.out.println("Valor de c: " + c); // Saída: 8

		int d = ++a; // Pré-incremento
		System.out.println("Valor de a: " + a); // Saída 9
		System.out.println("Valor de d: " + d); // Saída 9

		int e = a++; // Pós-incremento
		System.out.println("Valor de a: " + a); // Saída 10
		System.out.println("Valor de d: " + d); // Saída 9




	}
}