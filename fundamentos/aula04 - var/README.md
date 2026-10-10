# Var

O var em Java é uma palavra reservada introduzida no Java 10 que permite a inferência de tipo local.

Isso significa que você não precisa declarar o tipo explicitamente do lado esquerdo da variável; o compilador descobre o tipo sozinho com base no valor atribuído do lado direito.

### Exemplo

```java
// Sem var (declaração tradicional)
String nome = "Maria";
ArrayList<Cliente> clientes = new ArrayList<>();

// Com var
var nome = "Maria"; // O compilador infere que é String
var clientes = new ArrayList<Cliente>(); // O compilador infere ArrayList<Cliente>
```


## Regras e características principais

- **Continua com tipagem estática**: O Java não virou JavaScript. O tipo é definido em tempo de compilação e **não muda** depois. Se você declarar `var idade = 30;`, não poderá atribuir um texto como `idade = "trinta";`.
- **Apenas para variáveis locais**: Você só pode usar `var` dentro de métodos, blocos de inicialização ou laços (`for`). Não funciona para atributos de classe (variáveis de instância ou estáticas), parâmetros de métodos ou tipos de retorno.
- **Obrigatório inicializar**: Como o compilador precisa de uma pista para adivinhar o tipo, você deve atribuir um valor na mesma linha da declaração. Fazer `var x;` gera um erro de compilação.
- **Não pode ser `null` isolado**: Se você fizer `var x = null;`, o compilador não consegue inferir qual é o tipo do objeto.
- **Imutabilidade**: Para criar uma variável local que não pode ser alterada (constante), você deve combinar com `final`: `final var nome = "Maria";`.


## Quando usar (Boas Práticas)

- **Tipos muito longos ou complexos**: Quando o nome da classe é gigante e polui o código, como na instância de `HashMap` ou chamadas de API com Generics.
- **Em loops `for`**: Fica mais limpo escrever `var item : lista` do que repetir o tipo.
- **Quando o tipo é óbvio**: Exemplos como `var x = new Usuario();` ou `var ativo = true;`.