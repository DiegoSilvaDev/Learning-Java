# Metodos `final`

Em java, um método `final` é aquele que **não pode ser sobrescrito** (sobrescrito ou overridden) por nenhuma subclasse.

- Define um elemento que não pode ser alterado
- Aplicada em diferentes contextos

## Principais características

- **Bloqueio de herança de comportamento**: Impede que classes filhas mudem a lógica original daquele método.
- **Erro de compilação**: Se uma subclasse tentar declarar um método com a mesma assinatura de um método `final` da superclasse, o compilador do Java gerará um erro.
- **Segurança e previsibilidade**: Garante que o funcionamento essencial de um algoritmo permaneça intacto em toda a hierarquia de herança.

## Quando usar?

- **Lógica crítica de negócios**: Quando um método contém regras que não devem ser alteradas por extensões da classe.
- **Classes de utilidade ou segurança**: Para proteger o comportamento padrão de classes base.
- **Performance (histórico)**: Em versões antigas da JVM, métodos `final` podiam ser otimizados via inline pelo compilador, embora nas versões modernas essa diferença de desempenho seja mínima ou irrelevante.

*Nota: A palavra-chave **`final`** também pode ser aplicada a **variáveis** (transformando-as em constantes) e a **classes** (impedindo que sejam herdadas).*

### Exemplo

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
