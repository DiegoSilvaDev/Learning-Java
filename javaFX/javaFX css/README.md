# CSS (Cascading Sytle Sheets) no JavaFX

## `Prós` de usar CSS em Arquivos Separados

- Separação de preocupações/responsabilidades
- Facilidade de manutenção
- Reutilização de estilos

## `Contras` de usar CSS em Arquivos Separados

- Complexidade adicional
- Pequenos projetos
- Estilos únicos e específicos

## Propriedades de Fonte JavaFX CSS

- `-fx-font-family`
	- system
	- arial
	- serif
	- sans-serif
	- outras fonts

- `-fx-font-size` (12pt, 16px, etc).

- `-fx-font-style`
	- normal
	- italic
	- oblique
	
- `fx-font-weight`
	- normal
	- bold
	- bolder
	- lighter

### Exemplos

```java
	label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 14px; -fx-font-style: italic, -fx-font-weight: bold; ");

	botao.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 12px;");

	campoTexto.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 16px;")
```

