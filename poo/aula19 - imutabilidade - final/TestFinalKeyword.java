class ExemploFinal {
	// Definição de Constante = uso de final

	final int CODIGO_FIXO = 10;

	// Método final
	final void meuMetodo(){
		System.out.println("Este é um método final");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args) {
		ExemploFinal testFinal = new ExemploFinal();

		final int testFinalVariableLocal = 777;
		testFinalVariableLocal = 333;
		System.out.println("Valor da variavel local é: " + testFinalVariableLocal);

		// testFinal.CODIGO_FIXO = 555; // --> Erro de compilação

		System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
		testFinal.meuMetodo();
	}	
}