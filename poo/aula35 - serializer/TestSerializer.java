import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class Contato implements Serializable {
	public String nome;
	public String telefone;

	public Contato(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
}

public class TestSerializer {
	// Método para serializar os contatos
	private static void serializarContatos(List<Contato> listaContatos) throws IOException {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
			outputStream.writeObject(listaContatos);
			System.out.println("Contatos serializados e salvos com sucesso!");
		}
	}

	// Método para desserializar e exibir os contatos
	// @SuppressWarnings("unchecked")
	// private static void desserializarContatos() throws IOException, ClassNotFoundException {
	// 	try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
	// 		List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();

	// 		for(Contato contato : contatosLidos) {
	// 			System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
	// 		}
	// 	}
	// }
	private static void desserializarContatos() throws IOException, ClassNotFoundException {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
			Object obj = inputStream.readObject();
			if(obj instanceof List<?>) {
				List<?> contatosLidos = (List<?>) obj;
				for(Object contato : contatosLidos){
					if(contato instanceof Contato){
						Contato contatoTyped = (Contato) contato;
						System.out.println("Nome: " + contatoTyped.nome + ", Telefone: " + contatoTyped.telefone);	
					}
					
				}
			}
		}
	}


	public static void main (String[] args) {
		Contato contato1 = new Contato("Arnaldo", "(11) 1233-2323");
		Contato contato2 = new Contato("Maria", "(22) 3212-4345");
		Contato contato3 = new Contato("João", "(33) 5555-4444");

		List<Contato> listaContatos = new ArrayList<>();
		listaContatos.add(contato1);
		listaContatos.add(contato2);
		listaContatos.add(contato3);

		try {
			serializarContatos(listaContatos);
			desserializarContatos();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro ao manipular contatos: " + e.getMessage());
		}
	}
}



