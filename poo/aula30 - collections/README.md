# Java Collections Framework (Coleções java)

O **Java Collections Framework (`java.util`)** é um conjunto de classes e interfaces que padroniza a forma como agrupamos e manipulamos grupos de objetos em memória, superando as limitações dos arrays tradicionais.

## Principais Interfaces e Implementações

### 1. `List` (Lista)

- **Características**: Coleção ordenada por índice que **permite** elementos duplicados.
- **Principais Implementações**:
	- `ArrayList`: Baseada em array redimensionável. Ótima para leitura/acesso rápido por índice, mais lenta para inserções/remoções no meio.
	- `LinkedList`: Baseada em lista duplamente encadeada. Boa para inserções e remoções frequentes, mas mais lenta para acesso aleatório.

### 2. `Set` (Conjunto)

- **Características**: Coleção que **não permite** elementos duplicados e não possui acesso indexado formal.
- **Principais Implementações**:
	- `HashSet`: Não garante ordem dos elementos; opera com altíssima velocidade (O(1)) usando uma tabela hash.
	- `LinkedHashSet`: Mantém a ordem em que os elementos foram inseridos.
	- `TreeSet`: Mantém os elementos ordenados de forma natural ou via `Comparator` (\(O(\log n)\)).

### 3. `Map` (Mapa)

- **Características**: Armazena dados em formato de **chave e valor**. As chaves são **únicas**, mas os valores podem se repetir. (*Nota: `Map` não herda da interface `Collection`, mas faz parte do framework*).
- **Principais Implementaçõe**s:
	- `HashMap`: Não garante ordem; permite uma chave null e valores null.
	- `LinkedHashMap`: Preserva a ordem de inserção das chaves.
	- `TreeMap`: Mantém as chaves ordenadas.

## Classe Utilitária `Collections`

A classe utilitária `Collections` (Java Platform SE 8) contém exclusivamente métodos estáticos para operar sobre coleções, como:

- `Collections.sort()`: Ordena uma lista.
- `Collections.reverse()`: Inverte a ordem dos elementos.
- `Collections.unmodifiableList()`: Cria uma lista somente leitura (imutável).
- `Collections.synchronizedList()`: Cria uma versão segura para múltiplas threads (*thread-safe*).