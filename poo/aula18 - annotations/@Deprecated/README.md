# Anotações predefinidas

Algumas das mais comuns.

## @Deprecated

Em Java, a anotação `@Deprecated` e a tag `@deprecated` do Javadoc servem para indicar que uma classe, método, campo ou outro elemento do programa não deve mais ser utilizado, geralmente por estar obsoleto, inseguro, com bugs ou substituído por uma alternativa melhor.

## Para que serve

- **`@Deprecated` (Anotação)**: Introduzida no Java 5, é interpretada pelo compilador em tempo de compilação. Ela faz com que a IDE (como IntelliJ ou Eclipse) exiba o texto tachado (*strikethrough*) e gera **avisos (warnings)** quando o código usa esse recurso. A partir do Java 9, ganhou os atributos `since` (versão em que foi depreciado) e `forRemoval` (se será removido no futuro).
- **`@deprecated` (Tag do Javadoc)**: Introduzida no Java 1.1, é um comentário de documentação (iniciado por `/** ... */`). Ele serve para explicar **o porquê** da depreciação e o que deve ser usado no lugar.


## O que acontece ao usar um elemento deprecated?

**1. O código compila normalmente**: O uso de elementos depreciados não impede que o programa rode; ele apenas emite um aviso no console de build.
**2. Aviso na IDE**: A ferramenta de desenvolvimento destaca a chamada para alertar o programador de que ele deve migrar para a versão mais recente.

### Exemplo:

```java
	@Deprecated // <-- Atenção aqui

	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para Aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("NOVAS Regras para Aposentadoria");
	}
```