# Passagem por valor

Em Java, todos os parâmetros são passados exclusivamente por valor. Isso significa que, ao chamar um método, o Java cria uma **cópia** do valor que está sendo passado e a entrega para o método.
	
- Exemplo: 

	```java
		public void aumentarSalario(double aumento) {
			salario += aumento;
			// aumento += 1000;
		}
	```

### Neste método: 
	
- `public` é o modificador de acesso.
- `void` é o tipo d retorno, void não retorna nenhum valor.
- `aumentarSalario` é o nome do método.
- `double aumento` é o parâmetro.

Este método aumenta o salário do funcionário por valor fornecido.

O comportamento muda dependendo de você estar usando tipos primitivos ou objetos.

## 1. Tipos Primitivos (`int`, `double`, `boolean`, `char`, etc.)

- **O que é passado**: Uma cópia exata do valor numérico ou lógico.
- **Efeito**: Se o método alterar o valor do parâmetro, a **variável original fora do método não sofre nenhuma alteração**.

		```java
		public void testar(int x) {
    	x = 20; // Altera apenas a cópia local
		}
		// Fora do método, a variável original continua com o valor anterior.

		```

## 2. Objetos (Instâncias de Classes, Arrays, etc.)

- **O que é passado**: Uma cópia do **valor da referência** (o endereço na memória que aponta para o objeto), e não o objeto em si.

- **Efeito**: 

	- Se você modificar os **atributos** ou o **conteúdo** do objeto dentro do método (ex: `pessoa.setNome("Ana")`), essa mudança reflete no objeto original, pois a cópia da referência aponta para o mesmo local na memória.
	- Se você **reatribuir** a variável do objeto a uma nova instância dentro do método (ex: `pessoa = novo Objeto()`), a variável original **não muda**, provando que o que foi copiado foi a referência e não o ponteiro real da variável original.
