# Buscas Detalhadas

## 1. Busca por Preço Exato

- **Descrição**: Localiza produtos cujo preço seja exatamente igual ao valor informado.
- **Exemplos**: 
    - Se buscar `200.0`, retornará apenas os produtos que custam **200.0**
    - Se buscar `25.0`, retornará apenas os produtos que custam **25.0**.

## 2. Busca por Preço maior que o Valor informado

- **Descrição**: Retorna produtos cujo preço seja maior que o valor fornecido.
- **Exemplos**: 
    - Se buscar `500.0`, retornará os produtos que custam mais que **500.0**.
    - Se buscar `100.0`, retornará os produtos que custam mais que **100.0**.

## 3. Busca por Preço menor que o Valor informado

- **Descrição**: Retorna produtos cujo preço seja menor que o valor fornecido.
- **Exemplos**: 
    - Se buscar `100.0`, retornará os produtos que custam menos que **100.0**.
    - Se buscar `40.0`, retornará os produtos que custam menos que **40.0**.

## 4. Busca pelo Total de Preços

- **Descrição**: Calcula a soma total de preços de todos os produtos no sistema.
- **Exemplos**: 
    - Ao chamar o endpoint, retornará a somatória de cada produto.
    - Cadeira (10.00), Pente (5.00), Escova (15.00) = **30.00 (total)**

## 5. Busca por Nome terminado com

- **Descrição**: Retorna produtos cujo nome terminam com o sufixo informado.
- **Exemplos**: 
    - Se você buscar "Portátil", retornará **Notebook Portátil** e **Carregador**.
    - Se você buscar "Gamer", retornará **Mouse Gamer** e **Teclado Gamer**.


## Repository

```java
   // Busca por preço
    List<Produto> findByPreco(Double preco);

    List<Produto> findByPrecoGreaterThan(Double preco);

    List<Produto> findByPrecoLessThan(Double preco);

    // Usando anottation @Query para obter total de preços
    @Query("SELECT SUM(p.preco) FROM Produto p")
    Double findTotalPreco();
```

## Service

```java
    // Métodos de busca por preço
    public List<Produto> findByPreco(Double preco) {
        return produtoRepository.findByPreco(preco);
    }
    
    public List<Produto> findByPrecoGreaterThan(Double preco) {
        return produtoRepository.findByPrecoGreaterThan(preco);
    }
    
    public List<Produto> findByPrecoLessThan(Double preco) {
        return produtoRepository.findByPrecoLessThan(preco);
    }
    
    public Double findTotalPreco() {
        return produtoRepository.findTotalPreco();
    }
```

## Controller

**Endpoints**

```java
    // Endpoints de busca por preço
    @GetMapping("/buscarPorPreco")
    public List<Produto> buscarPorPreco(@RequestParam Double valor) {
        return produtoService.findByPreco(valor);
    }
    
    @GetMapping("/buscarPorPrecoMaiorQue")
    public List<Produto> buscarPorPrecoMaiorQue(@RequestParam Double valor) {
        return produtoService.findByPrecoGreaterThan(valor);
    }
    
    @GetMapping("/buscarPorPrecoMenorQue")
    public List<Produto> buscarPorPrecoMenorQue(@RequestParam Double valor) {
        return produtoService.findByPrecoLessThan(valor);
    }
    
    @GetMapping("/buscarTotalPreco")
    public Double buscarTotalPreco() {
        return produtoService.findTotalPreco();
    }
```

# Testagem

## 1. Busca por Preço Exato
- Localiza produtos cujo preço seja exatamente igual ao valor informado.
- **Exemplo**:
    - **Busca**: 200.0
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorPreco?valor=200.0
        - **Exemplo de Resultado Esperado**: 
            ```json
            [
                {
                    "nome": "Cadeira",
                    "preco": 200.0
                }
            ]
            ```
## 2. Busca por Preço Maior que o Valor Informado
- Localiza produtos cujo preço seja maior que o valor fornecido.
- **Exemplo**:
    - **Busca**: 500.0
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorPrecoMaiorQue?valor=500.0
        - **Exemplo de Resultado Esperado**:
            ```json
            [
                {
                    "nome": "Notebook",
                    "preco": 3500.0
                },
                {
                    "nome": "Notebook Portátil",
                    "preco": 4000.0
                },
                {
                    "nome": "Impressora",
                    "preco": 600.0
                }
            ]
            ```
## 3. Busca por Preço Menor que o Valor Informado
-  Localiza produtos cujo preço seja menor que o valor fornecido.
- **Exemplo**:
    - **Busca**: 100.0
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorPrecoMenorQue?valor=100.0
        - **Exemplo de Resultado Esperado**: 
            ```json
                [
                    {
                        "nome": "Cabo USB",
                        "preco": 25.0
                    },
                    {
                        "nome": "Adaptador USB-C",
                        "preco": 40.0
                    }
                ]
            ```
## 4. Busca pelo Total de Preços
- Calcula e retorna a soma de todos os preços dos produtos.
- **Exemplo**:
    - **Busca**: `Não necessária`
        - **Endpoint**: GET http://localhost:8080/produtos/buscarTotalPreco
        - **Exemplo de Resultado Esperado**:
            ```json
                9920.0
            ```
