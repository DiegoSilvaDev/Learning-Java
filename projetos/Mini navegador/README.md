# Projeto Mini Navegador Web Java

Wireframe (rascunho) Mini Navegador Web Java

```text
+----------------------------------+
| Meu Browser Java 				   |
+----------------------------------+
+----------------------------------+
| 								   |
| 								   |
| 								   |
+----------------------------------+

```

### 1. Descrição:

- Criar um navegador web simples em Java usando JavaFX.
- Permitir a inserção e carregamento de uma URL.

### 2. Funcionalidades: 

- Carregar a página ao pressionar Enter.
- Não há necessidade de implementar controles adicionais ( Voltar, Parar, etc).

### 3. Componentes chave: 

- `TextField` - Para digitar o endereço da página
- `WebView` - janela
- `WebEngine` - motor

### 4. Compilação com Dependências Transitivas: 

javac --module-path "Caminho" --add-modules javafx.web ProjetoMiniNavegador.java

