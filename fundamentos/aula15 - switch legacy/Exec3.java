public class Exec3 {
	public static void main(String[] args) {
		int nota1 = 5;
		int nota2 = 5;
		int media = (nota1 + nota2) / 2;

		if(media >= 6) {
			System.out.println("O aluno está dentro da média (6) seu resultado é: " + media);
		} else {
			System.out.println("O aluno está abaixo da média (6) seu resultado: " + media);
		}

		String resultado = media >= 6 ? "O aluno está dentro da média (6) seu resultado é: " + media 
		: "O aluno está abaixo da média (6) seu resultado é: " + media;

		System.out.println(resultado);

	}
}

		