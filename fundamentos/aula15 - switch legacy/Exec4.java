public class Exec4 {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 5;
		int frequencia = 80;

		int media = (nota1 + nota2) / 2;

		String avaliacao = media >= 6 && frequencia >= 75 ? "O aluno está aprovado com " + media + " de média e " + frequencia + "% de frequência"
		: "O aluno não atingiu a média esperada (6) nem a frequencia desejada 75%";

		System.out.println(avaliacao);

	}
}

		