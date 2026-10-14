# Classe Object 

A `java.lang.Object` é a superclasse raiz de toda a hierarquia de classes na linguagem Java. Isso significa que **todas as classes** em Java herdam dela, de forma direta ou indireta.

Quando você cria uma nova classe sem usar a palavra-chave `extends`, o compilador Java faz ela herdar de `Object` automaticamente.

## Principais métodos da classe `Object`

A [Object (Java Platform SE 8)](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) fornece um conjunto básico de métodos que estão disponíveis em qualquer objeto do sistema:

- **`toString()`**: Retorna uma representação em texto do objeto (por padrão, exibe o nome da classe seguido do hash code em hexadecimal, como `Classe@1a2b3c`). É muito comum sobrescrevê-lo.
- **`equals(Object obj)`**: Compara se um objeto é "igual" a outro. Por padrão, compara apenas as referências de memória (se apontam para o mesmo espaço), e não o conteúdo.
- **`hashCode()`**: Retorna um valor numérico inteiro (hash code) que representa o objeto, muito usado em estruturas de dados como `HashMap` e `HashSet`.
- **`getClass()`**: Retorna o objeto Class em tempo de execução (`runtime`) que representa a classe real daquele objeto.
- **`clone()`**: Cria e retorna uma cópia (cópia rasa / *shallow copy*) do objeto (requer que a classe implemente a interface `Cloneable`).
- **`finalize()`**: Método chamado pelo coletor de lixo (*garbage collector*) antes de destruir o objeto (depreciado em versões mais recentes do Java).
- **`wait()`**, **`notify()`** e **`notifyAll()`**: Métodos fundamentais para o controle de concorrência e sincronização de threads.


## Por que ela é importante?

- **Polimorfismo universal**: Como toda classe herda de `Object`, você pode criar métodos que recebem `Object` como parâmetro e aceitar qualquer tipo de objeto Java.
- **Padronização**: Garante que ações básicas (como gerar um texto ou comparar igualdade) existam em absolutamente qualquer componente da classe `Object`.

