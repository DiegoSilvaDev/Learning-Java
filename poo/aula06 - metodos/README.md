# Métodos em Java

Em Java, métodos são blocos de código encapsulados dentro de classes que definem o comportamento dos objetos e executam tarefas específicas.

## Declaração de Métodos

A declaração de método inclui o modificador de acesso, o tipo de retorno, o nome do método e  os parâmetros.

### Exemplo: 

```java
	public String obterInfo() {
		return "Nome: " + nome + ", Salario: " + salario;
	}
```

## Neste Exemplo:

- `public` é o modificador de acesso.
- `String` é o tipo de retorno.
- `obterInfo` é o nome do método.
- Não há parâmetros.


Este método retorna uma `String`, que contém o nome e o salário do "funcionário".


## Componentes de um Método

- **Modificador de Acesso**: Define quem pode ver ou chamar o método (ex: `public`, `private`, `protected` ou `default`).
- **Tipo de Retorno**: O tipo do dado que o método devolve após a execução (ex: `int`, `String`, `boolean`). Se não retornar nada, usa-se `void`.
- **Nome do Método**: Identificador escrito por convenção em camelCase e geralmente iniciado por um verbo (ex: `calcularMedia()`, `ligarTv()`).
- **Parâmetros**: Variáveis declaradas entre parênteses que recebem dados de entrada para o método processar.
- **Corpo**: O bloco de comandos delimitado por chaves `{ }`.

## Tipos Principais de Métodos

- **Métodos de Instância**: Precisam de um objeto criado a partir da classe para serem chamados, operando sobre o estado desse objeto.
- **Métodos Estáticos (static)**: Pertencem à própria classe e podem ser chamados diretamente sem a necessidade de instanciar um objeto (ex: `Math.random()` ou `System.out.println()`).
- **Sobrecarga (Overloading)**: Capacidade de definir vários métodos com o **mesmo nome** na mesma classe, diferenciando-se apenas pela quantidade ou tipo de parâmetros.