# Anotações predefinidas

Algumas das mais comuns.

## @Override

A anotação `@Override` em Java indica ao compilador que um método da classe filha está sobrescrevendo (*overriding*) um método da classe pai ou implementando um método de uma interface.

Para que serve

- **Verificação em tempo de compilação**: O compilador checa se a assinatura (nome, parâmetros e tipo de retorno) do método realmente existe na superclasse. Se houver um erro de digitação no nome ou nos parâmetros, o compilador gera um erro.
- **Legibilidade**: Deixa claro para outros desenvolvedores que aquele método é uma redefinição de um comportamento herdado.

### Exemplo:

```java
	class Animal {
		public String nome;

		public void fazerSom(){
			System.out.println("O animal faz um som");
		}
	}

	class Cachorro extends Animal {
		@Override // <--- Atenção aqui

		public void fazerSom() {
			super.fazerSom();
			System.out.println("O cachorro late");
		}
	}
```