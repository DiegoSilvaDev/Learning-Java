import empresa.dados.*; 

class FolhaDePagamento  {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Arnaldo", 5000.00);
		func.aumentarSalario(100d);

		System.out.println(func.obterInfo());
	}
}  