class TestStatic  {
	
	public static void exibirValor(int a) {
		System.out.println("O valor do inteiro é: " + a);
	}

	public static void exibirValor(String str) {
		System.out.println("O valor da string é: " + str);
	}

	public static void main(String[] args) {
		// TestStatic.exibirValor(10); // Formas de chamar um método static
		// exibirValor(10);

		// TestStatic ts = new TestStatic();

		// ts.exibirValor(10);

		exibirValor("Oi");
	}
}	


