class ExemploDepreciado {

	@Deprecated
	public void metodoObsoleto() {
		System.out.println("Regras");
	}
}	

public class Exec2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ExemploDepreciado ed =  new ExemploDepreciado();

		ed.metodoObsoleto();
	}
}




