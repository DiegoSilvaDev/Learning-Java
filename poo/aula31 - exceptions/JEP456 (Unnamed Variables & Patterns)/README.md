# JEP 456 (Unnamed Variables & Patterns) 

O **JEP 456 (Unnamed Variables & Patterns)** foi finalizado no **Java 22**. Ele introduz o uso do caractere sublinhado (`_`) como um palavra-chave reservada para representar variáveis e padrões que precisam ser declarados por regras sintáticas, mas cujos valores não são intencionalmente utilizados no código.
Esta mudança melhora a legibilidade do código, reduz poluição visual e elimina avisos de "variável não utilizada" emitidos pelo compilador ou ferramentas de análise estática.

## 1. Variáveis Não Nomeadas (Unnamed Variables)

Você pode substituir o nome de uma variável por _ em cenários onde apenas o efeito colateral ou a estrutura importa.

### Casos de Uso Suportados:

- **Blocos `catch`:** Quando você precisa capturar uma exceção, mas não precisa ler suas propriedades.

    ```java
    try {
        int numero = Integer.parseInt(texto);
    } catch (NumberFormatException _) { // O objeto da exceção é ignorado
        System.out.println("Formato inválido!");
    }
    ```

- **Loops `for` e Enhanced `for`:** Útil quando o número de iterações ou a ação importa, mas o objeto iterado não.

    ```java
    // Enhanced for
    for (String _ : listaDeChamadas) {
        dispararAlerta(); 
    }

    // For básico
    for (int i = 0, _ = executarEfeitoColateral(); i < 10; i++) { ... }
    ```

- **Expressões Lambda:** Quando a assinatura do método exige parâmetros, mas o corpo da lambda não os utiliza.    

    ```java
    // Ignorando a chave e o valor em um Map.forEach
    mapa.forEach((_, _) -> System.out.println("Item processado"));
    ```

- **Try-with-resources:** Para recursos que precisam ser abertos e fechados automaticamente, mas que não são referenciados dentro do bloco.    

    ```java
    try (var _ = ScopedValue.where(CHAVE, valor)) {
        executarTarefa();
    }
    ```

## 2. Padrões Não Nomeados (Unnamed Patterns)

Aplicados no context de **Pattern Matching** (como instruções switch ou instanceof), eles permitem desestruturar Records ou validar tipos ignorando variáveis específicas.

- **Desestruturação Parcial de Records:** Se você possui um Record e precisa apenas de um dos seus atributos.

    ```java
    record Ponto(int x, int y) {}

    Object obj = new Ponto(10, 20);

    if (obj instanceof Ponto(int x, _)) {
        System.out.println("O valor de X é: " + x); // O valor 'y' foi ignorado de forma limpa
    }
    ```

- **Padrões de Tipo Incondicionais em Switch:**    

    ```java
    switch (objeto) {
        case String s -> System.out.println("Texto: " + s);
        case Number _ -> System.out.println("É um número, mas não importa qual.");
        default       -> System.out.println("Outro tipo");
    }

    ```

## Regras Importantes e Restrições

- **Variáveis não nomeadas não podem ser lidas ou escritas**: O compilador não permite acessar o caractere `_` como uma variável convencional. O código `System.out.println(_)`; resultará em erro de compilação.
- **Onde NÃO é permitido**: O uso do `_` isolado `não é válido` para campos de classe (atributos de instância/estáticos) nem para parâmetros formais de métodos normais.
- **Múltiplos usos no mesmo escopo**: Diferente de variáveis normais, você pode declarar múltiplos `_` no mesmo bloco de código (ex: na mesma assinatura de lambda) sem causar erros de colisão de nomes.