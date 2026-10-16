private static void desserializarContatos() throws IOException, ClassNotFoundException {
	try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
		Object obj = inputStream.readObject();
		if(obj instanceof List<?>) {
			List<?> contatosLidos = (List<?>) obj;
			for(Object contato : contatosLidos){
				if(contato instanceof : contatosLidos){
					Contato contatoTyped = (Contato) contato;
					System.out.println("Nome: " + contatoTyped.nome + ", Telefone: " + contatoTyped.telefone);	
				}
				
			}
		}
	}
}