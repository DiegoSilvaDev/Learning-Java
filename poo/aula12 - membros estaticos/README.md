# Membros Estáticos em Java 

Membros estáticos em Java são atributos e métodos que pertencem à própria classe em vez de pertencerem a uma instância (objeto) específica.

- Pertencem à classe, não ao objeto
- Podem ser acessados pelo nome da classe
- Compartilham o mesmo membro estático

	- Exemplo:

	```java
	class NomeDaClasse {

		static tipo nomeDoMembro;

	}
	```

## Principais Características

- **Acesso direto pela classe**: Você não precisa usar o operador `new` para criar um objeto e acessar um membro estático; basta chamar `NomeDaClasse.membro`.
- **Compartilhamento de memória**: Variáveis estáticas possuem uma única cópia na memória, compartilhada por todos os objetos criados daquela classe. Se um objeto altera esse valor, ele muda para todos os outros.
- **Ausência do `this`**: Métodos estáticos não podem usar a palavra-chave `this`, pois não estão ligados a nenhum objeto em particular.
- **Restrição de chamadas**: Um método estático só pode acessar diretamente outros métodos ou atributos estáticos da mesma classe, e não pode acessar membros de instância sem uma referência explícita a um objeto.

	- Exemplo: 

        ```java
        public class Contador {
            // Atributo estático (compartilhado)
            public static int totalDeObjetos = 0;

            public Contador() {
                totalDeObjetos++; // Incrementa a cada nova instância
            }

            // Método estático
            public static void exibirTotal() {
                System.out.println("Total: " + totalDeObjetos);
            }
        }

        // Como usar no código principal:
        public class Main {
            public static void main(String[] args) {
                new Contador();
                new Contador();
                
                // Chamando o método estático diretamente pela classe
                Contador.exibirTotal(); // Saída: Total: 2
            }
        }
        ```

## Casos de Uso Comuns: 
	
- **Método `main`**: É estático para que a Máquina Virtual Java (JVM) possa executá-lo diretamente sem precisar instanciar a classe principal.
- **Classes utilitárias**: Conjuntos de funções prontas que não dependem de dados do objeto, como `Math.sqrt()` ou `Integer.parseInt()`.
- **Constantes globais**: Geralmente combinados com `public static final` (ex: `Math.PI`).
