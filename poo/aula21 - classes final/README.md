# Classes `final`

Uma classe `final` em Java é uma classe que **não pode ser estendida**, ou seja, proíbe que outras classes criem subclasses a partir dela.

- Define um elemento que não pode ser alterado
- Aplicada em diferentes contextos

## O que acontece ao usar `final` em uma classe:

- **Fim da herança**: Nenhuma outra classe pode usar a palavra-chave `extends` para herdar de uma classe `final`. Se você tentar fazer isso, o compilador do Java gerará um erro.
- **Exemplo clássico**: A classe `java.lang.String` é declarada como `final` para garantir que ninguém altere o comportamento fundamental de manipulação de textos na linguagem.

## Por que usar?

- **Segurança e Imutabilidade**: Garante que o comportamento da classe não será modificado ou "quebrado" por sobrescritas em subclasses mal planejadas.
- **Previsibilidade**: Útil ao criar bibliotecas, APIs ou classes imutáveis onde você quer ter certeza absoluta de qual código está sendo executado.

### Exemplo

```java
	class MinhaClasseFinal {

		// Corpo da classe

	}

	class MinhaSubClasse extends MinhaClasseFinal {

		 // Erro de compilação, pois MinhaClasseFinal é final enão pode ser estendida.
	
	}
```
