# Identificadores

Um **identificador** em Java é o nome atribuído a elementos de um programa como variáveis, classes, interfaces, métodos e pacotes para que possam ser referenciados e manipulados no código.

## Regras para criação de identificadores

- **Primeiro caractere**: Deve começar com uma letra (maiúscula ou minúscula), um cifrão (`$`) ou um sublinhado (`_`). **Não** pode começar com um número.
- **Caracteres subsequentes**: Podem conter letras, números, cifrões (`$`) ou sublinhados (`_`).
- **Case-sensitive**: Java diferencia maiúsculas de minúsculas (ex: `minhaVariavel` e `MinhaVariavel` são diferentes).
- **Palavras reservadas**: Não podem ser usadas palavras-chave da linguagem (como `class`, `int`, `public`, `return`, etc.), nem os literais `true`, `false` ou `null`.
- **Espaços e símbolos**: Não são permitidos espaços em branco, acentos ou símbolos especiais (como `@`, `#`, `-`).

## Convenções de nomenclatura (Boas Práticas)

- **Classes e Interfaces**: Devem começar com letra maiúscula, utilizando o formato *CamelCase* (ex: `MinhaClasse`, `ClienteService`).
- **Métodos e Variáveis**: Devem começar com letra minúscula, também seguindo o *CamelCase* (ex: `calcularTotal`, `nomeDoUsuario`).
- **Constantes**: Escritas em letras maiúsculas separadas por sublinhado (`ALL_CAPS`, ex: `MAX_VALOR`).
- **Caracteres especiais**: Evite usar `$` e `_` no início dos nomes, pois o compilador costuma utilizar o `$` para arquivos gerados internamente. Por quê não usar? [StackOverflow - Convenções em java.](https://pt.stackoverflow.com/questions/152674/conven%c3%a7%c3%b5es-de-quando-utilizar-ou-em-identificadores-de-java)