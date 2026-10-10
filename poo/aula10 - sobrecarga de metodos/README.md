# Passagem por Sobrecarga (overloading)

A **sobrecarga de métodos** (*method overloading*) em Java é a criação de dois ou mais métodos com o mesmo nome dentro de uma mesma classe, desde que tenham listas de parâmetros diferentes.
	
- Exemplo: 

	```java
		class NomeDaClasse {
			tipoRetorno nomeMetodo(tipo1 param1, tipo2 param2, tipo3 param3, ...) {

				// Corpo do método

			}

			tipoRetorno nomeMetodo(tipoA paramA, tipoB paramB, tipoC paramC, ...) {

				// Corpo do método
				
			}

			// E assim por diante
		}
	```
	```java 
		public void aumentaralario(int porcentagem) {
			salario += salario * porcentagem / 100;
		}
	```

## Como funciona: 
	
- **Assinatura do método**: É formada pelo nome do método junto com os seus parâmetros (quantidade, ordem ou tipos). O **tipo de retorno **e os **modificadores de acesso** não fazem parte da assinatura e não definem a sobrecarga.
- **Diferenciação**: Na hora de executar o código, o Java identifica qual versão do método chamar com base nos argumentos que você passa na chamada.

## Regras principais

- Devem estar na **mesma classe** (ou herdados na mesma hierarquia, mas ocorre no escopo da classe).
- Devem ter **assinaturas diferentes** (mudar apenas o tipo de retorno **não** funciona).
- A ordem dos tipos de parâmetros também altera a assinatura (ex: `metodo(int a, String b)` é diferente de `metodo(String a, int b)`)

### Exemplo

```java
public class Calculadora {

    // Método 1: soma dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método 2: sobrecarga com três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método 3: sobrecarga com números decimais (double)
    public double somar(double a, double b) {
        return a + b;
    }
}
```