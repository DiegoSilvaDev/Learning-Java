class InformaRegras  {

	@Deprecated
	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para Aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("Novas regras para Aposentadoria");
	}

	public void chamarMetodoObsoletoNaMesmaClasse(){
		mostrarRegrasParaAposentadoria();
	}
}	

public class TestDeprecated {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		InformaRegras regras =  new InformaRegras();

		regras.chamarMetodoObsoletoNaMesmaClasse();
	}
}




