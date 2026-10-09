# Construct (Construtor)

exemplo: 

```java
	class Funcionario {
		String nome;
		String cargo;
		int idade;

		// Este é o construtor
		Funcionario(String nome, String cargo, int idade) {
			this.nome = nome;
			this.cargo = cargo;
			this.idade = idade;
		}

		public static void main(String[] args) {
			Funcionario funcionario = new Funcionario("João", "Desenvolvedor", 30);

			System.out.println("Nome: " funcionario.nome);
			System.out.println("Cargo: " funcionario.cargo);
			System.out.println("Idade: " funcionario.idade);
		}
	}
```

## Explicação

Um construtor em Java é um bloco de código especial, semelhante a um método, utilizado para inicializar um objeto no momento em que ele é criado na memória através da palavra-chave new.

### Principais características

- **Mesmo nome da classe**: O construtor deve ter exatamente o mesmo nome da classe em que está inserido.
-  **Sem tipo de retorno**: Diferente dos métodos comuns, ele não declara nenhum tipo de retorno (nem mesmo `void`).
- **Execução automática**: É chamado automaticamente no instante exato da instanciação do objeto.
- **Modificadores de acesso**: Pode ser `public`, `private` ou `protected` (geralmente `public`)


## Tipos de Construtores

1. **Construtor Padrão (Default Constructor)**:
	- Se você não declarar nenhum construtor na sua classe, o compilador do Java cria um construtor padrão automaticamente por trás dos panos.
	- Ele não recebe nenhum parâmetro e deixa os atributos com valores padrão (ex: null para objetos, 0 para números).
2. **Construtor Sem Argumentos (No-arg Constructor)**:
	- É escrito manualmente por você, sem parâmetros, permitindo executar alguma lógica personalizada na criação.
3. **Construtor Parametrizado**:
	- Recebe argumentos para definir valores iniciais específicos para os atributos do objeto logo que ele nasce.
