# Utilizando arquivo de estilo

## Propriedade `-fx-font` (uma linha)

```css
	.button {
		-fx-font: bold 14pt 'Arial';
	}
```

## Exemplo em múltiplas linhas:

```css
	.button {
		-fx-font-family: 'Arial';
		-fx-font-size: 14pt;
		-fx-font-weight: bold;
	}
```

```java
	label.getStyleClass().add("etiqueta");
	botao.getStyleClass().add("botao");
	campoTexto.getStyleClass().add("campoTexto");

	cena.getStylesheets().add("file:///caminho/do/arquivo/exemplo.css");
```


