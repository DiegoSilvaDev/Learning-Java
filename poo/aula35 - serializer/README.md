# Serializer (Serializador) Java

Um **serializer** (serializador) em Java é um componente ou mecanismo responsável por **converter um objeto Java em um fluxo de dados** (como uma sequência de bytes, JSON, XML ou YAML), permitindo que ele seja salvo em disco, enviado pela rede ou compartilhado entre diferentes sistemas.

O processo inverso, transformar esse fluxo de dados de volta em um objeto vivo na memória, chama-se desserialização.

#### Top 3 Características Fundamentais

1. Persistência de Dados
2.  Comunicação entre Sistemas Distribuídos
3.  Compatibilidade com APIs e Bibliotecas

#### A serialização como opção a um banco de dados

- Armazenamento de Dados Temporários
- Cache de Dados
- Compartilhamento de Dados entre processos
- Redução de Complexibilidade 

## Como tornar uma Classe Serializável

```java
	import java.io.Serializable;

	public class Usuario implements Serializable {
	    // É altamente recomendado definir este ID para controle de versão da classe
	    private static final long serialVersionUID = 1L; 

	    private String nome;
	    private int idade;
	    
	    // O modificador 'transient' impede que este campo seja serializado (ex: dados sensíveis)
	    private transient String senha; 

	    // Construtores, Getters e Setters
	    public Usuario(String nome, int idade, String senha) {
	        this.nome = nome;
	        this.idade = idade;
	        this.senha = senha;
	    }

	    @Override
	    public String toString() {
	        return "Usuario{nome='" + nome + "', idade=" + idade + ", senha='" + senha + "'}";
	    }
	}
```

## Serializando o Objeto (Escrevendo em Arquivo)

Para converter o objeto em bytes e salvá-lo (por exemplo, em um arquivo chamado `usuario.ser`), usa-se a classe `ObjectOutputStream` em conjunto com `FileOutputStream`.

```java
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;

	public class SerializarExemplo {
	    public static void main(String[] args) {
	        Usuario usuario = new Usuario("Carlos", 30, "12345678");

	        try (FileOutputStream fileOut = new FileOutputStream("usuario.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	            
	            // Método que faz a mágica da serialização
	            out.writeObject(usuario); 
	            System.out.println("Objeto serializado com sucesso em 'usuario.ser'");
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

```
## Desserializando o Objeto (Lendo do Arquivo)

Para recuperar o objeto a partir do arquivo de bytes, usa-se `ObjectInputStream` e `FileInputStream`. O método `readObject()` retorna um `Object` genérico, necessitando de um cast manual para o tipo correto.

```java
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class DesserializarExemplo {
	    public static void main(String[] args) {
	        Usuario usuario = null;

	        try (FileInputStream fileIn = new FileInputStream("usuario.ser");
	             ObjectInputStream in = new ObjectInputStream(fileIn)) {
	            
	            // Lê o fluxo de bytes e converte de volta para o objeto
	            usuario = (Usuario) in.readObject(); 
	            
	            System.out.println("Objeto desserializado com sucesso:");
	            System.out.println(usuario);
	            // Note que o campo 'senha' virá como 'null' porque foi marcado como transient
	            
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}
```

## Conceitos Importantes para Lembrar

- **`serialVersionUID`**: É um identificador único para cada versão da classe. Se você alterar a estrutura da classe (como adicionar um novo atributo) e tentar ler um arquivo antigo sem definir um ID estático fixo, o Java lançará uma exceção `InvalidClassException`.
- **Palavra-chave `transient`**: Campos marcados com `transient` não são salvos. Quando o objeto é restaurado, esses campos recebem seu valor padrão (ex: `null` para objetos ou 0 para inteiros).
- **Campos `static`**: Atributos estáticos pertencem à classe e não ao objeto individual, por isso também **não** são serializados.
- **Dependências**: Se o seu objeto possui referências a outros objetos dentro dele (atributos compostos), essas outras classes **também** precisam implementar `Serializable`, caso contrário ocorrerá um erro `NotSerializableException`.