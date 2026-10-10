# Comentarios (Documentação)

Em Java, os comentários são textos ignorados pelo compilador durante a execução e servem para explicar a lógica, documentar classes ou facilitar a leitura do código. Eles são divididos em três tipos principais.

## Tipos de comentários

- **Comentário de linha única**: Começa com `//` ou utilizando o atalho `'cntrl + : '`,  tudo o que for digitado após essa marcação na mesma linha é ignorado pelo compilador.
    - Exemplo:
        ```java
        // Esta é uma linha de comentário em Java
        int idade = 22; // Comentário ao lado do código
        ```
- **Comentário de múltiplas linhas (em bloco)**: Começa com `/*` e termina com `*/`. Tudo o que estiver dentro desse intervalo é ignorado.         
    - Exemplo: 
        ```java
        /* Este é um comentário
        que ocupa várias
        linhas no código */
        ```
- **Comentário de documentação (Javadoc)**: Começa com `/**` e termina com `*/`. É utilizado para gerar documentações automáticas em HTML por meio da ferramenta `javadoc`. Suporta tags especiais como `@param`, `@return` e `@throws`.
    - Exemplo: 
        ```java 
        /**
        * Calcula a soma de dois números inteiros.
        * @param a - Primeiro valor
        * @param b - Segundo valor
        * @return A soma de a e b
        */
        public int somar(int a, int b) {
            return a + b;
        }
        ```