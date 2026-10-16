# JavaFX

O **JavaFX** é um framework moderno de código aberto para a criação de interfaces gráficas (GUI) e aplicações desktop ricas em Java. Ele surgiu como o sucessor oficial e evolução do antigo Java Swing, trazendo recursos visuais muito mais avançados, maior desempenho e melhor flexibilidade para os desenvolvedores.

## Principais Características

- **Estilização com CSS**: Permite customizar a aparência de toda a interface usando [CSS (Cascading Style Sheets)](https://openjfx.io/), facilitando a criação de designs modernos e idênticos em diferentes sistemas operacionais.
- **Separação de Conceitos (FXML)**: Utiliza arquivos estruturados em XML (chamados **FXML**) para definir a interface visual separadamente da lógica de programação (controlada pelas classes *Controller*).
- **Scene Builder**: Uma ferramenta visual do tipo "arrastar e soltar" mantida pela [Gluon](https://gluonhq.com/products/scene-builder/) que gera automaticamente o código FXML, agilizando o design das telas.
- **Renderização por Hardware**: Ao contrário do Swing, o JavaFX utiliza aceleração gráfica diretamente pela **GPU** (placa de vídeo), tornando animações e transições muito mais fluidas.
- **Suporte Multimídia**: Possui componentes nativos para reproduzir áudio e vídeo, além de uma *Web Engine* interna para renderizar conteúdo HTML5 e JavaScript dentro do programa.

## Como funciona a estrutura?

O framework utiliza uma analogia ao teatro (o chamado Scene Graph):

1. **Stage (Palco)**: Representa a janela principal da aplicação.
2. **Scene (Cena)**: O container interno que abriga os elementos visuais.
3. **Nodes (Nós)**: Os componentes individuais inseridos na cena, como botões, caixas de texto, tabelas e gráficos.

## Um detalhe importante para o desenvolvimento

A partir do **Java 11**, o JavaFX deixou de vir embutido nativamente no JDK. Ele passou a ser gerenciado de forma independente pelo projeto de código aberto [OpenJFX](https://openjfx.io/). Por conta disso, hoje ele é adicionado aos projetos como uma dependência externa utilizando gerenciadores de pacotes como o **Maven** ou **Gradle** dentro de IDEs como o [IntelliJ IDEA](https://www.jetbrains.com/help/idea/javafx.html) ou Eclipse.