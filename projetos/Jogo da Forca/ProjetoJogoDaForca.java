import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProjetoJogoDaForca {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> palavraSecretas = new ArrayList<>(); // ArrayList irá conter três palavras
		palavraSecretas.add("cobra"); // Cobra está no índice 0 e tem 5 letras.
		palavraSecretas.add("elefante"); // Elefante está no índice 1 e tem 8 letras.
		palavraSecretas.add("girafa"); // Girafa está no índice 2 e tem 6 letras.
	
		Random random = new Random();

		int tamanhoDoArray = palavraSecretas.size();
		int indicePalavraAleatoria = random.nextInt(tamanhoDoArray);
		String palavraSecreta = palavraSecretas.get(indicePalavraAleatoria); // Seleciona uma palavra secreta aleatoriamente.

		ArrayList<Character> letrasDescobertas = new ArrayList<>(); // ArrayList para armazenar as letras descobertas.

		for (int i = 0; i < palavraSecreta.length(); i++ ) {
			letrasDescobertas.add('_'); // Inicializa com traços para cada letra.
		}

		int tentativas =  6; // Número máximo de tentativas
		boolean palavraFoiDescoberta = false; // Adiciona uma flag para verificar se a palavra foi descoberta.

		// Enquanto a palavraFoiDescoberta for false, e ainda tiver tentativas para descobrir o programa continuára rodando.
		while(!palavraFoiDescoberta && tentativas > 0) {
			System.out.println();
			System.out.println("Palavra: " + letrasDescobertas);
			System.out.print("Chute uma letra: " );
			char chute = scanner.next().charAt(0);

			boolean acertou = false;
			for(int i = 0; i < palavraSecreta.length(); i++) { // Passa por cada letra da palvra (5, 8 ou 6)
				if(palavraSecreta.charAt(i) == chute) {// Verifica cada letra da palavra secreta se é igual ao chute
					letrasDescobertas.set(i, chute); // Se for igual, acrescenta a lista de descobertas, na posição correta
					acertou = true;
				}
			}

			if(!acertou) {
				tentativas --;
				System.out.println("Você tem mais " + tentativas + " tentativas.");
			}

			// Verifica se a palvra foi completamente descoberta 
			palavraFoiDescoberta = !letrasDescobertas.contains('_');
		}

			if(palavraFoiDescoberta) {
				System.out.println("Parabéns, você acertou! a palavra era: " + palavraSecreta);

			} else {
				System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
			}

	}
}