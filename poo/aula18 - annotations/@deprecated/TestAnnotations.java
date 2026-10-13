class InformaRegras  {

	@Deprecated
	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para Aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("Novas regras para Aposentadoria");
	}
}	

public class TestAnnotations {
	public static void main(String[] args) {
		InformaRegras regras =  new InformaRegras();

		// Uso do método obsoleto (deprecated)
		regras.mostrarRegrasParaAposentadoria();

		// Uso do novo método
		regras.mostrarNovasRegrasParaAposentadoria();
	}
}




