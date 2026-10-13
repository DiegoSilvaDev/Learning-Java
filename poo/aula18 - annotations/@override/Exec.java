class SuperClasse {
	public void imprime() {
		System.out.println("Imprime");
		// Será sobrescrito na classe filha
	}
}

class MinhaClasse extends SuperClasse {
	@Override
	public void imprime() {
		System.out.println("Imprime diferente");
	}
}

class Exec {
	public static void main(String[] args) {
		MinhaClasse mc = new MinhaClasse();

		mc.imprime();
	}
}