import empresa.dados.*; 

class FolhaDePagamento  {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Arnaldo", 5000.00);
		System.out.println(func.obterInfo());

		func.alterarQualquerSalario(func, 9000.00);
		System.out.println(func.obterInfo());
		func.salario = 7000.00;
		System.out.println(func.obterInfo());
	}
}  