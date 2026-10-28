# Buscas Detalhadas

## 1. Busca por Quantidade Exata

- **Descrição**: Localiza produtos cuja quantidade seja exatamente igual ao valor informado.
- **Exemplos**: 
    - Se buscar `50`, retornará o produto:
        ```json
            {
                "nome": "Cabo USB",
                "quantidade": 50
            }
        ```
   

## 2. Busca por Quantidade Maior que o Valor Informado

- **Descrição**: Retorna produtos cuja quantidade seja maior que o valor fornecido.
- **Exemplos**: 
    - Se buscar `15`, retornará o produto:
        ```json
            {
                "nome": "Mouse Gamer",
                "quantidade": 22
            }
        ```

## 3. Busca por Quantidade Menor que o Valor Informado

- **Descrição**: Retorna produtos cuja quantidade seja menor que o valor fornecido.
- **Exemplos**: 
    - Se buscar `10`, retornará o produto:
        ```json
            {
                "nome": "Impressora",
                "quantidade": 3
            }
        ```

## Repository

```java
   // Buscas por quantidade de produto
    List<Produto> findByQuantidade(Integer quantidade);

    List<Produto> findByQuantidadeLessThan(Integer quantidade);

    List<Produto> findByQuantidadeGreaterThan(Integer quantidade);
```

## Service

```java
    // Métodos de busca por quantidade
    public List<Produto> findByQuantidade(Integer quantidade) {
            return produtoRepository.findByQuantidade(quantidade);
    }

    public List<Produto> findByQuantidadeLessThan(Integer quantidade) {
        return produtoRepository.findByQuantidadeLessThan(quantidade);
    }

    public List<Produto> findByQuantidadeGreaterThan(Integer quantidade) {
        return produtoRepository.findByQuantidadeGreaterThan(quantidade);
    }
```

## Controller

**Endpoints**

```java
    // Endpoints de busca por quantidade
    @GetMapping("/buscarPorQuantidade")
    public List<Produto> buscarPorQuantidade(@RequestParam Integer valor) {
        return produtoService.findByQuantidade(valor);
    }

    @GetMapping("/buscarPorQuantidadeMenorQue")
    public List<Produto> buscarPorQuantidadeMenorQue(@RequestParam Integer valor) {
        return produtoService.findByQuantidadeLessThan(valor);
    }

    @GetMapping("/buscarPorQuantidadeMaiorQue")
    public List<Produto> buscarPorQuantidadeMaiorQue(@RequestParam Integer valor) {
        return produtoService.findByQuantidadeGreaterThan(valor);
    }
```

# Testagem

## 1. Busca por Quantidade Exata
- Localiza produtos cuja quantidade seja exatamente igual ao valor informado.
- **Exemplo**:
    - **Busca**: 50
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorQuantidade?valor=50
        - **Exemplo de Resultado Esperado**: 
            ```json
                [
                    {
                        "nome": "Cabo USB",
                        "quantidade": 50
                    }
                ]
            ```
## 2. Busca por Quantidade Maior que o Valor Informado
- Retorna produtos cuja quantidade seja maior que o valor fornecido.
- **Exemplo**:
    - **Busca**: 15
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorQuantidadeMaiorQue?valor=15
        - **Exemplo de Resultado Esperado**:
            ```json
            [
                {
                    "nome": "Mouse Gamer",
                    "quantidade": 22
                }
            ]
            ```
## 3. Busca por Quantidade Menor que o Valor Informado
-   Retorna produtos cuja quantidade seja menor que o valor fornecido.
- **Exemplo**:
    - **Busca**: 10
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorQuantidadeMenorQue?valor=10
        - **Exemplo de Resultado Esperado**: 
            ```json
                [
                    {
                        "nome": "Impressora",
                        "quantidade": 25.0
                    }
                ]
            ```