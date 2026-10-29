# Buscas Combinadas, Padronizadas e Totalizadas

## Campos de Status e Preço

### 1. Busca por Quantidade Exata

- **Descrição**: Localiza produtos com o status informado.
- **Exemplos**: 
    - Se buscar `Disponível`, retornará o produto:

        ```json
            {
                "nome": "Notebook",
                "status": "Disponível"
                // Outros campos
            }
        ```
   

## 2. Busca por Produtos Sem Status

- **Descrição**: Localiza produtos cujo campo de status esteja vazio (nulo).
- **Exemplos**: 
    - Ao buscar produtos sem status (`null`), retornará o produto:
        
        ```json
            {
                "nome": "Luminária",
                "status": null
                // Outros campos
            },
            {
                "nome": "Ventilador",
                "status": null
                // Outros campos
            }
        ```

## 3. Busca por Preço e Status

- **Descrição**: Localiza produtos com um preço específico e o status informado.
- **Exemplos**: 
    - Se buscar `preco=200.0` e `status=Disponível`, retornará o produto:
        
        ```json
            {
                "nome": "Cadeira",
                "preco": 200.0,
                "status": "Disponível"
                // Outros campos
            }
        ```

## 4. Busca pelo Total de Produtos

- **Descrição**: Retorna o número total de produtos cadastrados no sistema.
- **Exemplos**: 
    - Ao consultar o total de produtos, retornará o valor de produtos cadastrados:
       
        ```json
            120
        ```

## 5. Busca por Status Padrão

- **Descrição**: Retorna todos os produtos que possuem o status padrão, caso nenhum valor seja informado. O padrão será `Disponível`.
- **Exemplos**: 
    - Se o status padrão for `Disponível`:
       
        ```json
            [
                {
                    "nome": "Notebook Gamer",
                    "status": "Disponível"
                    // Outros campos
                },
                {
                    "nome": "Tablet Infantil",
                    "status": "Disponível"
                    // Outros campos
                }
            ]
        ```


## Repository

```java
   // Buscas por preço e status
    List<Produto> findByStatus(String status);

    List<Produto> findByStatusIsNull();

    List<Produto> findByPrecoAndStatus(Double preco, String status); 
```

## Service

```java
    // Métodos de busca por status e preço
    public List<Produto> findByStatus(String status) {
        return produtoRepository.findByStatus(status);
    }

    public List<Produto> findByStatusIsNull() {
        return produtoRepository.findByStatusIsNull();
    }

    public List<Produto> findByPrecoAndStatus(Double preco, String status) {
        return produtoRepository.findByPrecoAndStatus(preco, status);
    }

    // Método para trazer o número total de produtos
    public Long count() {
        return produtoRepository.count();
    } 
```

## Controller

**Endpoints**

```java
    // Endpoints de busca por status e preço
    @GetMapping("/buscarPorStatus")
    public List<Produto> buscarPorStatus(@RequestParam(required = false) String
    valor) {
        return produtoService.findByStatus(valor);
    }
   
    // Retorna exclusivamente produtos com status null
    @GetMapping("/buscarPorStatusNulo")
    public List<Produto> buscarPorStatusNulos() {
        return produtoService.findByStatusIsNull();
    }
    
    // Busca baseada em dois campos (preço e status)
    @GetMapping("/buscarPorPrecoEStatus")
    public List<Produto> buscarPorPrecoEStatus(@RequestParam Double preco,
    @RequestParam String status) {
        return produtoService.findByPrecoAndStatus(preco, status);
    }
    
    // Endpoint para trazer o total de produtos
    @GetMapping("/contarTotalDeProdutos")
    public Long contarTotalDeProdutos() {
        return produtoService.count();
    }

    // Se não passar nada, volta todos produtos com status padrão, neste caso será Disponível".
    @GetMapping("/buscarPorStatusPadrao")
    public List<Produto> buscarPorStatusPadrao(@RequestParam(defaultValue = "Disponível") String valor) {
        return produtoService.findByStatus(valor);
    } 
```

# Processo de Testes

## 1. Inclusão de Massa de Dados

### **Postman**:

1. No Postman, selecione o método `POST`.
2. Insira o URL completo do endpoint: http://localhost:8080/produtos/salvarLista
3. No corpo da requisição, escolha o foramto `raw` e defina como `JSON`.
4. Cole o JSON abaixo no corpo da requisição e envie.

```json
    [
        {
            "nome": "Ventilador",
            "preco": 200.0,
            "quantidade": 10,
            "status": null
        },
        {
            "nome": "Luminária",
            "preco": 120.0,
            "quantidade": 8,
            "status": null
        }
    ]
```


# Testagem

## 1. Busca por Status Específico
- Localiza produtos com o status informado.
- **Exemplo**:
    - **Busca**: "Disponível"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorStatus?valor=Disponível
        - **Exemplo de Resultado Esperado**: 
            
            ```json
                [
                    {
                        "nome": "Notebook",
                        "status": "Disponível"
                        // Outros campos
                    }
                ]
            ```

## 2. Busca por Produtos Sem Status (`null`)
-  Localiza produtos cujo campo de status esteja vazio (nulo).
- **Exemplo**:
    - **Busca**: `Não necessária`, retornará os produtos com status `null`
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorStatusNulos
        - **Exemplo de Resultado Esperado**:
            
            ```json
            [
                {
                    "nome": "Ventilador",
                    "preco": 200.0,
                    "quantidade": 10,
                    "status": null

                },
                {
                    "nome": "Luminária",
                    "preco": 120.0,
                    "quantidade": 8,
                    "status": null
                }
            ]
            ```

## 3. Busca por Preço e Status
-  Localiza produtos com um preço específico e o status informado.
- **Exemplo**:
    - **Busca**: `preco=200.0` e `status=Disponível`
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorPrecoEStatus?preco=200.0&status=Disponível
        - **Exemplo de Resultado Esperado**: 
            
            ```json
                [
                    {
                        "nome": "Cadeira",
                        "preco": 200.0,
                        "status": "Disponível"
                        // Outros campos
                    }
                ]
            ```

## 4. Busca pelo Total de Produtos
-  Retorna o número total de produtos cadastrados no sistema.
- **Exemplo**:
    - **Busca**: `Não necessária`, retornará o total de produtos
        - **Endpoint**: GET http://localhost:8080/produtos/contarTotalDeProdutos
        - **Exemplo de Resultado Esperado**: 
            
            ```json
                120
            ```