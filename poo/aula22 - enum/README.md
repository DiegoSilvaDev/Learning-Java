# Enum em Java

O **enum** (enumeração) em Java é um tipo de dado especial que representa um conjunto fixo de constantes nomeadas (como os dias da semana, meses ou status de um pedido).


## Características principais

- **Tipo especial de classe**: Por trás dos panos, um `enum` é uma classe que estende implicitamente `java.lang.Enum`.
- **Constantes em maiúsculas**: Por convenção, as constantes do `enum` são escritas em letras maiúsculas e separadas por vírgula.
- **Construtor privado**: O construtor de um `enum` é sempre privado ou "*package-private*", impedindo que novas instâncias sejam criadas fora do próprio `enum`.
- **Segurança de tipo**: Evita que valores inválidos sejam passados para variáveis que esperam apenas opções específicas.

### Exemplo básico de uso

```java
// Definindo um Enum
	public enum DiaDaSemana {
	    SEGUNDA,
	    TERCA,
	    QUARTA,
	    QUINTA,
	    SEXTA,
	    SABADO,
	    DOMINGO;
	}

	// Utilizando o Enum
	public class Main {
	    public static void main(String[] args) {
	        DiaDaSemana hoje = DiaDaSemana.QUARTA;
	        System.out.println(hoje); // Saída: QUARTA
	    }
	}

```

## Enum com atributos e construtores

Você pode adicionar campos, construtores e métodos aos seus enums para carregar valores extras (como códigos ou descrições):

```java
	public enum StatusPedido {
	    PENDENTE(1, "Aguardando pagamento"),
	    PROCESSANDO(2, "Em separação"),
	    ENVIADO(3, "A caminho");

	    private final int codigo;
	    private final String descricao;

	    // Construtor privado
	    StatusPedido(int codigo, String descricao) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
	}

```

## Métodos úteis do Java Enum

- **`values()`**: Retorna um array com todas as constantes do enum.
- **`valueOf(String nome)`**: Converte uma String no enum correspondente (lança exceção se não existir).
- **`ordinal()`**: Retorna a posição numérica da constante (começando do `0`).
- **`name()`**: Retorna o nome exato da constante em formato de texto.