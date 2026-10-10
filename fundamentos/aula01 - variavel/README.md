# Variável em Java

Em java, uma variável é um espaço reservado na memória RAM usado para armazenar dados que podem ser modificados durante a execução do programa.

## Como Declarar uma Variável

Para criar uma variável, você deve informar o **tipo** de dado, o **nome** (identificador) e, opcionalmente, um **valor inicial**:

### Exemplo

```java
int idade = 22;
```

## Tipos de Variáveis

As variáveis em Java são divididas principalmente em três categorias principais.

- **Locais**: Declaradas dentro de métodos, construtores ou blocos de código; Só podem ser usadas ali dentro.
- **De Instância (Campos)**: Declaradas dentro da classe, mas fora de qualquer método; Pertencem a uma instância específica do objeto.
- **Estáticas (De Classe)**: Declaradas com a palavra-chave `static`; Pertencem à própria classe e são compartilhadas por todos os objetos dela.


## Boas Práticas e Regras de Nomenclatura

- **Camel Case**: Nomes compostos devem começar com letra minúscula e as palavras seguintes com letra maiúscula (ex: `quantidadePassos`).
- **Case-sensitive**: O Java diferencia maiúsculas de minúsculas (`idade` é diferente de `Idade`).
- **Constantes**: Para criar valores imutáveis, utiliza-se a palavra-chave `final` (ou `static final` para constantes globais), geralmente escritas em letras maiúsculas.