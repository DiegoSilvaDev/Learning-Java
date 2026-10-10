# Getters e Setters

Em Java, **getters** e **setters** são métodos especiais usados para acessar e modificar os atributos privados de uma classe, seguindo o princípio de **encapsulamento** da Programação Orientada a Objetos (POO).

## O que são e como funcionam?

- **Getter (Método Acessor)**: Retorna o valor de um atributo privado. Começa com o prefixo `get` seguido do nome do atributo com a primeira letra maiúscula (ex: `getNome()`).
- **Setter (Método Modificador)**: Altera ou define o valor de um atributo privado. Começa com o prefixo `set` seguido do nome do atributo com a primeira letra maiúscula (ex: `setNome(String nome)`).

	- Exemplo: 
		```java
		public class Pessoa {
			// Atributos privados (protegidos do acesso direto)
			private String nome;
			private int idade;

			// Getter para o nome
			public String getNome() {
				return nome;
			}

			// Setter para o nome
			public setNome(String nome) {
				this.nome = nome;
			}

			// Getter para a idade
			public int getIdade() {
				return idade;
			}

			// Setter com validação de dados
			public void setIdade(int idade) {
				if (idade >= 0) {
					this.idade = idade;
				}
			}
		}

		```

## Principais Benefícios

- **Segurança e Proteção de Dados**: Evita que variáveis da classe sejam alteradas livremente por qualquer parte do código.
- **Validação**: Permite inserir regras dentro do `setter` (por exemplo, impedir que uma idade seja negativa).
- **Controle**: Você pode criar atributos que sejam apenas de leitura (apenas `getter`, sem `setter`) ou apenas de escrita.