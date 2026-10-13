# Anotações predefinidas

Algumas das mais comuns.

## @Deprecated

Em Java, o termo refere-se à anotação @Deprecated (ou à tag de Javadoc @deprecated), usada para indicar que uma classe, método, campo ou outro elemento não deve mais ser utilizado.


## Principais características

- **Desencorajado**: Indica que o recurso está obsoleto, foi substituído por uma alternativa melhor ou pode ser removido em versões futuras do Java.
- **Avisos de compilação (Warnings)**: Quando você utiliza um código marcado com `@Deprecated`, o compilador gera um aviso (*warning*), embora o programa ainda seja compilado e execute normalmente.
- Visualização na IDE: Ambientes de desenvolvimento (como IntelliJ ou Eclipse) geralmente exibem o código tachado (riscado) para alertar o programador.
- Diferença entre a anotação e a tag:
	- **`@Deprecated` (anotação)**: Processada pelo compilador para gerar os avisos no código.
	- **`@deprecated` (tag do Javadoc)**: Usada dentro de comentários de documentação `(/** ... */)` para explicar por que o elemento foi depreciado e o que usar no lugar. É comum usar os dois juntos

### Exemplo:

```java
	
	@Deprecated // <-- Atenção aqui

	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para Aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("NOVAS regras para Aposentadoria");
	}
```