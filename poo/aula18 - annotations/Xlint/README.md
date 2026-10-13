# Xlint

A flag `-Xlint:deprecation` é uma opção do compilador Java (`javac`) usada para **exibir detalhes sobre o uso de códigos depreciados (deprecated)** durante a compilação do seu projeto.

## O que ela faz?

Por padrão, quando você compila um código que usa classes, métodos ou atributos antigos (que foram marcados com `@Deprecated`), o compilador Java exibe apenas um aviso genérico como este:

*`Note: Some input files uses or override a deprecated API.`* <br>
*`Note: Recompile with -Xlint:deprecation for details.`*

Ao adicionar a flag -Xlint:deprecation, o compilador mostra exatamente em qual linha e qual comando depreciado está sendo utilizado, facilitando a substituição por alternativas modernas.


## Como usar?

Você pode utilizá-la diretamente no terminal ou configurá-la nas suas ferramentas de build.

### Direto no Terminal

```bash 
javac -Xlint:deprecation SeuArquivo.java
```



