// Regras básicas:
// byte, shor e char são promovidos para int quando usados em uma expressão.
// exemplo:

public class Main {
	public static void main(String[] args) {
		// byte a = 10;
		// int b = a + 5; // a é promovido para int antes do cálculo
		// System.out.println("Valor de a: " + a);
		// System.out.println("Valor de b: " + b);

		// Se um operando é long, o outro é promovido para long.
		// exemplo:

		// int a = 10;
		// long b = 15L;
		// long c = a + b; // a é promovido para long antes do cálculo

		// System.out.println("O valor de c = " + c);

		// Se um operando é float, o outro é promovido para float
		// exemplo:

		// int a = 10;
		// float b = 1.5f;
		// float c = a * b; // a é proovido para float antes do cálculo
		
		// System.out.println("O valor de c é: " + c);

		// Se um operando é double, o outro é promovido para double.
		// exemplo:

		int a = 10;
		double b = 1.5;
		double c = a * b; // a é promovido para double antes do cálculo
		
		System.out.println("O valor de c é: " + c);

	}
}
