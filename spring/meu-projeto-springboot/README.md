## Configuração do Banco de Dados

O arquivo de propriedades que deve editar é o `application.properties` localizo na pasta `src/main/resources` o seu projeto Spring Boot.

```properties
    spring.application.name=my-project-spring
    spring.datasource.url=jdbc:sqlite:meu_banco_de_dados.db
    spring.datasource.driver-class-name=org.sqlite.JDBC
    spring.jpa.database-plataform=org.hibernate.community.dialect.SQLiteDialect
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    # Propriedade depreciada no Spring 4.0
    ! spring.web.error.whitelabel.enabled=false
    server.servlet.context-path=/
```

# Estrutura de Packages
```text
    src/main/java
    
    com.produtoapi
        └── MeuProjetoSpringbootApplication.java
    com.produtoapi.controller
    │   └── ProdutoController.java
    com.produtoapi.model
    │   └── Produto.java
    com.produtoapi.repository
    │   └── ProdutoRepository.java
    com.produtoapi.service
    │   └── ProdutoService.java
```

# Model

```java
    package com.produtoapi.model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.validation.constraints.NotEmpty;
    
    @Entity
    public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
    
        @NotEmpty(message = "Informe um nome")
        private String nome;
        private int quantidade;
        private double preco;
        private String status;
    
        public Produto(String nome, int quantidade, double preco, String status) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
            this.status = status;
        }
    
        public Produto() {
    
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    }
```

# Repository

```java
    package com.produtoapi.repository;
    
    import com.produtoapi.model.Produto;
    import org.springframework.data.jpa.repository.JpaRepository;
    
    public interface ProdutoRepository extends JpaRepository<Produto,
    Long> {
        
    }
```

# Service
```java
    package com.produtoapi.service;
    import com.produtoapi.model.Produto;
    import com.produtoapi.repository.ProdutoRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.List;
    import java.util.Optional;
    
    @Service
    public class ProdutoService {
        @Autowired
        private ProdutoRepository produtoRepository;
        public List<Produto> listarTodos() {
            return produtoRepository.findAll();
        }
        public Produto salvar(Produto produto) {
            return produtoRepository.save(produto);
        }
        public void deletar(Long id) {
            produtoRepository.deleteById(id);
        }
        public Produto atualizar(Long id, Produto produto) {
            if (produtoRepository.existsById(id)) {
                produto.setId(id);
                return produtoRepository.save(produto);
            } else {
                throw new RuntimeException("Produto não encontrado");
             }
        }
        
        public Optional<Produto> findById(Long id) {
            return produtoRepository.findById(id);
        }
    }
```

# Controller

```java
    package com.produtoapi.controller;

import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.inserir(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody
    Produto produto) {
        return produtoService.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable Long id) {
        return produtoService.findById(id);
    }
}
```

# Testando a Aplicação Spring Boot (ENDPOINTS)

## 1. Listar todos os Produtos

- **Descrição**: Recupera a lista e todos os produtos disponíveis no banco ee dados.
- **Método HTTP**: `GET`
- **URL**: `http://localhost:8080/produtos`

## 2. Salvar um Novo Produto

- **Descrição**: Adiciona um novo produto ao banco de dados.
- **Método HTTP**: `POST`
- **URL**: `http://localhost:8080/produtos`
- **JSON de Exemplo**:
    ```json 
      {
        "nome": "Notebook",
        "quantidade": 10,
        "preco": 3000.00,
        "status": "disponível"
      }  
    ```
## 3. Atualizar um Produto Existente

- **Descrição**: Atualiza as informações de um produto existente identificado pelo ID.
- **Método HTTP**: `PUT`
- **URL**: `http://localhost:8080/produtos/{id}`
- **JSON de Exemplo**:

    ```json
        { 
          "nome": "Notebook Gamer",
          "quantidade": 5,
          "preco": 4500.00,
          "status": "disponível"
        }
    ```
## 4. Deletar um Produto Existente

- **Descrição**: Remove um produto do banco de dados identificado pelo ID.
- **Método HTTP**: `DELETE`
- **URL**: `http://localhost:8080/produtos/id`

## 5. Buscar um Produto por ID

- **Descrição**: Recupera os detalhes de um produto específico pelo ID.
- **Método HTTP**: `GET`
- **URL**: `http://localhost:8080/produtos/{id}`