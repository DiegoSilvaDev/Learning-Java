# Anotações predefinidas

Algumas das mais comuns.

## @SupressWarnings

O **`@SuppressWarnings`** é uma anotação em Java usada para instruir o compilador a ignorar (suprimir) avisos específicos (*warnings*) emitidos durante a compilação do código.
Consulte a [Documentação Oficial Java SuppressWarnings](https://docs.oracle.com/javase/8/docs/api/?java/lang/SuppressWarnings.html) para detalhes da especificação.


## Para que serve?

Quando você escreve um código que gera um alerta do compilador (mas que você tem certeza de que está correto ou que não pode ser evitado, como ao lidar com código legado), você pode usar essa anotação para "calar" o aviso e manter o log de compilação limpo.


## Exemplos mais comuns de uso

- **`@SuppressWarnings("unchecked"`**): Oculta avisos relacionados ao uso de tipos genéricos sem especificação (*raw types*), muito comum ao interagir com códigos antigos.
- **`@SuppressWarnings("deprecation")`**: Oculta o aviso gerado quando você utiliza um método, classe ou campo que foi marcado como `@Deprecated`.
- **`@SuppressWarnings("serial")`**: Oculta o aviso quando uma classe implementa `Serializable` mas não declara o campo `serialVersionUID`.


## Onde pode ser aplicada?

### A anotação pode ser usada em vários níveis do código:

- Classes (`TYPE`)
- Métodos (`METHOD`)
- Construtores (`CONSTRUCTOR`)
- Variáveis locais (`LOCAL_VARIABLE`)
- Parâmetros (`PARAMETER`)
- Campos (`FIELD`)

### Exemplo:

```java
	
	@SuppressWarnings("deprecation") // <-- Atenção aqui

	public static void main(String[] args) {
		InformaFundo fundo = new InformaFundo();

		// Uso do método obsoleto (deprecated)
		fundo.mostrarRegraDoFundoDeGarantia();
	}
```

**Nota**: O uso de `@SuppresWarnings("deprecation")` deve ser minimizado.