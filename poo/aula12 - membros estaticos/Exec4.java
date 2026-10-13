public class Exec4 {

	public static void main(String[] args) {
	
		Personagem p = new Personagem("Nome", 10);

		System.out.println("Antes: " + p.nivelDePoder);
		p.tentarAumentarNivelDePoder();
		System.out.println("Depois: " + p.nivelDePoder);
		System.out.println(); // Espaçamento

		System.out.println("Antes: " + p.nome);
		p.mudarNome(p, "Jota");
		System.out.println("Depois: " + p.nome);

	}
}

class Personagem {
	String nome;
	int nivelDePoder;

	public Personagem(String nome, int nivelDePoder){
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;
	}

	public int tentarAumentarNivelDePoder() {
		nivelDePoder += 10;
		return nivelDePoder;
	}

	public void mudarNome(Personagem personagem, String nome) {
		personagem.nome = nome;
	}
}	




