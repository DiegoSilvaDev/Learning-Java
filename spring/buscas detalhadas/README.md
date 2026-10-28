# Buscas Detalhadas

## 1. Busca por Nome Exato

- **Descrição**: Localiza produtos cujo nome seja exatamente igual ao informado.
- **Exemplos**: 
    - Se você buscar "Cadeira", retornará apenas **Cadeira**.
    - Se você buscar "Caixa de Som", retornará apenas **Caixa de Som**.

## 2. Busca por Nome Completo

- **Descrição**: Localiza produtos que contenham o trecho informado em qualquer parte do nome.
- **Exemplos**: 
    - Se você buscar "Caixa", retornará **Caixa de Som** e **Caixa Organizadora**.
    - Se você buscar "USB", retornará **Cabo USB** e **Adaptador USB-C**.

## 3. Busca por Nome e Status

- **Descrição**: Filtra produtos com um nome exato e um status específico.
- **Exemplos**: 
    - Se você buscar "Notebook" e "Disponível", retornará **Notebook** com status **Disponível**.
    - Se você buscar "Impressora" e "Indisponível", retornará **Impressora** com status **Indisponível**.

## 4. Busca por Nome começando com

- **Descrição**: Retorna produtos que começam com o prefixo informado.
- **Exemplos**: 
    - Se você buscar "Fone", retornará **Fone de Ouvido** e **Fone gamer**.
    - Se você buscar "Caixa", retornará **Caixa de Som** e **Caixa organizadora**.

## 5. Busca por Nome terminado com

- **Descrição**: Retorna produtos cujo nome terminam com o sufixo informado.
- **Exemplos**: 
    - Se você buscar "Portátil", retornará **Notebook Portátil** e **Carregador**.
    - Se você buscar "Gamer", retornará **Mouse Gamer** e **Teclado Gamer**.


## Repository

```java
    // Imports
    import java.util.List;

    // Busca Por nome
    List<Produto> findByNome(String nome);
    List<Produto> findByNomeContaining(String nome);
    List<Produto> findByNomeAndStatus(String nome, String status);
    List<Produto> findByNomeStartingWith(String prefix);
    List<Produto> findByNomeEndingWith(String suffix);
```

## Service

```java
    // Métodos de busca por nome
    public List<Produto> findByNome(String nome) {
        return produtoRepository.findByNome(nome);
    }
    public List<Produto> findByNomeContaining(String nome) {
        return produtoRepository.findByNomeContaining(nome);
    }
    public List<Produto> findByNomeAndStatus(String nome, String status) {
        return produtoRepository.findByNomeAndStatus(nome, status);
    }
    public List<Produto> findByNomeStartingWith(String prefix) {
        return produtoRepository.findByNomeStartingWith(prefix);
    }
    public List<Produto> findByNomeEndingWith(String suffix) {
        return produtoRepository.findByNomeEndingWith(suffix);
    }
```

## Controller

**Endpoints**

```java
    // Endpoints de busca por nome
    @GetMapping("/buscarPorNome")
    public List<Produto> buscarPorNome(@RequestParam String valor) {
        return produtoService.findByNome(valor);
    }
    @GetMapping("/buscarPorNomeContendo")
    public List<Produto> buscarPorNomeContendo(@RequestParam String valor) {
        return produtoService.findByNomeContaining(valor);
    }
    @GetMapping("/buscarPorNomeEStatus")
    public List<Produto> buscarPorNomeEStatus(@RequestParam String nome, @RequestParam String
    status) {
        return produtoService.findByNomeAndStatus(nome, status);
    }
    @GetMapping("/buscarPorNomeComecandoCom")
    public List<Produto> buscarPorNomeComecandoCom(@RequestParam String valor) {
        return produtoService.findByNomeStartingWith(valor);
    }
    @GetMapping("/buscarPorNomeTerminandoCom")
    public List<Produto> buscarPorNomeTerminandoCom(@RequestParam String valor) {
        return produtoService.findByNomeEndingWith(valor);
    }
```

# Processo de Testes

## 1. Inclusão de Massa de Dados

### **Postman**:
1. No Postman, selecione o método `POST`.
2. Insira o URL completo do endpoint: `http://localhost:8080/produtos/salvarLista`
3. No corpo da requisição, escolha o formato `raw` e defina como `JSON`.
4. Cole o JSON abaixo no corpo da requisição e envie.

```json
[
    {
     "nome": "Cadeira",
     "quantidade": 10,
     "preco": 200.0,
     "status": "Disponível"
    },
    {
     "nome": "Cabo USB",
     "quantidade": 50,
     "preco": 25.0,
     "status": "Disponível"
    },
    {
     "nome": "Adaptador USB-C",
     "quantidade": 30,
     "preco": 40.0,
     "status": "Disponível"
    },
    {
     "nome": "Notebook",
     "quantidade": 12,
     "preco": 3500.0,
     "status": "Disponível"
    },
    {
     "nome": "Impressora",
     "quantidade": 3,
     "preco": 600.0,
     "status": "Indisponível"
    },
    {
     "nome": "Fone de Ouvido",
     "quantidade": 20,
     "preco": 100.0,
     "status": "Disponível"
    },
    {
     "nome": "Fone Gamer",
     "quantidade": 15,
     "preco": 250.0,
     "status": "Disponível"
    },
    {
     "nome": "Caixa de Som",
     "quantidade": 10,
     "preco": 500.0,
     "status": "Disponível"
    },
    {
     "nome": "Caixa Organizadora",
     "quantidade": 25,
     "preco": 75.0,
     "status": "Disponível"
    },
    {
     "nome": "Notebook Portátil",
     "quantidade": 7,
     "preco": 4000.0,
     "status": "Disponível"
    },
    {
     "nome": "Carregador Portátil",
     "quantidade": 18,
     "preco": 150.0,
     "status": "Indisponível"
    },
    {
     "nome": "Mouse Gamer",
     "quantidade": 22,
     "preco": 180.0,
     "status": "Disponível"
    },
    {
     "nome": "Teclado Gamer",
     "quantidade": 15,
     "preco": 300.0,
     "status": "Disponível"
    }
]
```

# Testagem
## 1. Busca por Nome Exato
- Localiza produtos cujo nome seja exatamente igual ao informado.
- **Exemplo**:
    - **Busca**: "Cadeira"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorNome?valor=Cadeira
        - **Exemplo de Resultado Esperado**: Retorna apenas **Cadeira**.
## 2. Busca por Nome Contendo
- Localiza produtos que contenham um trecho específico no nome.
- **Exemplo**:
    - **Busca**: "Caixa"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorNomeContendo?
        valor=Caixa
        - **Exemplo de Resultado Esperado**: Retorna **Caixa de Som** e **Caixa Organizadora**.
## 3. Busca por Nome e Status
- Filtra produtos com um nome e status exatos.
- **Exemplo**:
    - **Busca**: "Notebook" com status "Disponível"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorNomeEStatus?
        nome=Notebook&status=Disponível
        - **Exemplo de Resultado Esperado**: Retorna **Notebook** com status **Disponível**.
## 4. Busca por Nome Começando com
- Retorna produtos cujo nome começa com o prefixo informado.
- **Exemplo**:
    - **Busca**: "Fone"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorNomeComecandoCom?
        valor=Fone
        - **Exemplo de Resultado Esperado**: Retorna **Fone de Ouvido Bluetooth**, **Fone de Ouvido** e **Fone Gamer**.
## 5. Busca por Nome Terminando com
- Retorna produtos cujo nome termina com o sufixo informado.
- **Exemplo**:
    - **Busca**: "Gamer"
        - **Endpoint**: GET http://localhost:8080/produtos/buscarPorNomeTerminandoCom?
        valor=Gamer
        - **Exemplo de Resultado Esperado**: Retorna **Notebook Gamer**, **Fone Gamer**, **Mouse Gamer** e **Teclado Gamer**.