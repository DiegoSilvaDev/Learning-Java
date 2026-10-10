import empresa.dados.*; 

class FolhaDePagamento  {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Arnaldo", 5000.00);
		System.out.println(func.obterInfo());
		double d = 3000;
		func.aumentarSalario(d);
		d = d + 100;

		System.out.println(func.obterInfo());
	}
}  