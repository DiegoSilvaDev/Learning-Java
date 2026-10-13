# Palavra-chave `final`

A palavra-chave `final` (ou `final` keyword) em Java é um modificador utilizado em linguagens de programação orientadas a objetos, para restringir modificações em variáveis, métodos ou classes.

- Define um elemento que não pode ser alterado
- Aplicada em diferentes contextos

## Onde pode ser aplicada

- **Variáveis (`final`)**: Torna-se uma **constante**. Depois que o valor é atribuído (na declaração ou no construtor), ele **não pode ser alterado** ou reatribuído.após a inicialização.
- **Métodos (`final`)**: O método **não pode ser sobrescrito**(`@Override`) por nenhuma subclasse. É útil para garantir que a lógica original de um método não seja alterada.
- **Classes (`final`)**: A classe **não pode ser herdada** (não pode ter subclasses). Classes nativas do Java, como `String` e `Scanner`, são declaradas como `final` para proteger sua estrutura.

### Variáveis marcada com `final`

```java
	final int x = 10;

	x = 20; // Erro de compilação, pois x é uma constante.
```

### Métodos `final`

```java
	class MinhaClasse {
		final void meuMetodo(){

			// corpo do método
		
		}
	}

	class MinhaClasse extends MinhaClasse {

		void meuMetodo() {} // Erro de compilação, pois método final não pode ser sobrescrito.
	
	}
```
