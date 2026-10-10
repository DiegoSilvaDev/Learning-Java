# Passagem por referência

Em Java, não existe passagem por referência verdadeira; a linguagem opera **estritamente por valor**, mas o comportamento varia conforme o tipo de dado.
	
- Exemplo: 

	```java
		public void alterarQualquerSalario(Funcionario func, double novoSalario) {
			func.salario = novoSalario;
		}
	```

### Neste método: 
	
- `public` é o modificador de acesso.
- `void` é o tipo d retorno, void não retorna nenhum valor.
- `alterarQualquerSalario` é o nome do método.
- `Funcionario func, double novoSalario` são os parâmetros.

Este método altera o salário do funcionário especificando `func` para o novo salário fornecido `novoSalario`.

## Como funciona na prática

- **Tipos primitivos (`int`, `double`, `boolean`, etc.)**: O **valor real** da variável é copiado. Alterar o parâmetro dentro do método não afeta a variável original.
- **Objetos e Arrays (tipos de referência como: `String`, `List`, instâncias de classes, etc.)**: O que é passado para o método é uma cópia do valor da **referência** (o endereço de memória que aponta para o objeto na *heap*).

## O que isso significa?

1. **Modificar os atributos de um objeto funciona**: Como a cópia da referência aponta para o mesmo objeto na memória, se você alterar um atributo ou chamar um método que modifica o estado desse objeto dentro da função, a alteração refletirá fora dela.
2. **Reatribuir a variável não funciona**: Se dentro do método você atribuir um novo objeto (`outroObjeto = new MeuObjeto()`) a essa variável, você estará mudando apenas a cópia local da referência. A variável original continuará apontando para o objeto antigo.