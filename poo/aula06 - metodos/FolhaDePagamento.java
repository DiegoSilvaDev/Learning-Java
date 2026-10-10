import empresa.dados.*; // Importa todas as classes

class FolhaDePagamento  {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);

		System.out.println(funcionario.obterInfo());
	}
}  