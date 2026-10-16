# Cores no JavaFX CSS

- Propriedades de Cores

 	- Aplicada em plano de fundo, contorno ou preenchimento
 	- Pode incluir um vlaor de transparência do canal alfa

## Especificando Cores

- Nomes de cores `red`, `green`, `blue`, `white` etc
	- RGB, red, gree, blue
	- Varia de 0 a 255, Por exemplo o `Rosa` usa o `RGB(255, 192, 203)`

- Valores Hexadecimais: Por exemplo, `#FF0000` = vermelho

- Valores RGBA: Canal Alfa para transparência:
	- `rgba(0, 0, 255, 0.5)` (azul com 50% de transparência)
	- 0 (totalmente transparente) a 1 (totalmente opaco)

## Aplicando Cores

#### Exemplo:

```css
	.label-estilo {
		-fx-background-color: blue; /* ou #0000FF*/
		-fx-text-fill: pink;
	}

	.botao-estilo {
		-fx-background-color: rgba(255, 0, 0, 0.5); /* equivalente à (Red, green, blue, % Transparência) */
		-fx-text-fill: white;
	}

	.campo-texto-estilo {
		-fx-background-color: green;
		-fx-text-fill: red;
	}
```

#### Exemplo via JavaFX

```java
	label.setStyle("-fx-background-color: blue; -fx-text-fill: pink;");
	botao.setStyle("-fx-background-color: rgba(255, 0, 0, 0.5); -fx-text-fill: white;");
	campoTexto.setStyle("-fx-background-color: green; -fx-text-fill: red;");

```