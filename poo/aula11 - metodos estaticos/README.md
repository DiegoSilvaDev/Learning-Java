# Métodos Estáticos em Java 

Um método estático em Java é uma função que pertence à própria classe e não a uma instância (objeto) específica dela.

- Pertencem à classe
- Palavra-chave `static`

## Declaração de Métodos Estáticos

A declaração de um método estático é semelhante à de um método normal, mas inclui a palavra-chave `static`.

- Exemplo: 

```java
public class TestStatic {
	// Método estático sobrecarregado #1
	public static void exibirValor(int a ) {
		Sytem.out.println("O valor do inteiro é: " + a);
	}

	// Método estático sobrecarregado # 2
	public static void exibirValor(String str) {
		System.out.println("A string é: " + str);
	}
}
```

Neste exemplo, `exibirValor` é um método estático. Ele pode ser chamado diretamente sem a necessidade de criar uma intância da classe `TestStatic`. 

## Principais Características: 
	
- **Chamada direta**: Você pode invocá-lo usando apenas o nome da classe seguido de um ponto, sem precisar criar um objeto com o comando `new`.
- **Acesso restrito**: Um método estático só pode acessar diretamente outros métodos ou variáveis que também sejam estáticos.
- **Sem referência `this`**: Como ele não está ligado a um objeto específico, a palavra-chave `this` não pode ser usada dentro dele.
- **Não pode ser sobrescrito**: Você não pode usar `@Override` em um método estático; se você criar um método com a mesma assinatura em uma subclasse, estará apenas "ocultando" (*hiding*) o método da superclasse.


### Exemplo

```java
public class Matematica {
    // Declaração de um método estático
    public static int somar(int a, int b) {
        return a + b;
    }
}

public class Principal {
    public static void main(String[] args) {
        // Chamando o método estático diretamente pela classe, sem instanciar
        int resultado = Matematica.somar(5, 3);
        System.out.println(resultado); // Saída: 8
}
```

## Quando Utilizar?

- **Classes utilitárias**: Funções matemáticas ou de conversão que apenas recebem dados, processam e devolvem um resultado (como `Math.sqrt()` ou `Integer.parseInt()`).
- **Métodos factory (fábrica)**: Métodos auxiliares projetados para criar e retornar instâncias da própria classe.
- **Ponto de entrada**: O famoso método `public static void main(String[] args)`, que a Java Virtual Machine (JVM) chama para iniciar o programa sem precisar instanciar a classe principal.