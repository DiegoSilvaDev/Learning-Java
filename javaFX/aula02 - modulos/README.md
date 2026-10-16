# Módulos (module)

Módulos são como caixas de ferramentas organizadas.

- Exemplos: 
	- **javafx.controls**: Este módulo fornece componentes gráficos.
	- **javafx.web**: Integração de conteúdo web.
	- **javafx.media**: Suporte para reprodução de áuido e vídeo.

### Compilação exemplo:

```bash
	javac --module-path "C:\Program Files\Java\javafx-sdk-21.0.12\lib" --add-modules javafx.controls JavaFXMinhaAplicacao.java
	
	// Ou

	javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls JavaFXMinhaAplicacao.java
```

### Execução exemplo:

```bash
	java --module-path "C:\Program Files\Java\javafx-sdk-21.0.12\lib" --add-modules javafx.controls JavaFXMinhaAplicacao

	// Ou

	java --module-path "%PATH_TO_FX%" --add-modules javafx.controls JavaFXMinhaAplicacao
```