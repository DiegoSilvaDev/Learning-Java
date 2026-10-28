# `CommandLineRunner`

O CommandLineRunner é uma interface funcional do Spring Boot utilizada para executar um bloco de código imediatamente após o carregamento completo do contexto da aplicação.
Ela é ideal para tarefas de inicialização, como povoar um banco de dados de testes (seed), validar variáveis de ambiente ou aquecer caches.

🔗 Interface ``CommandLineRunner``

📜 Regras Interfaces Java

🔄 Inicialização de Tarefas com `CommandLineRunner`

🌟 Anotação `@Component`

🌐 RestTemplate


## Como Implementar (Duas Abordagens)

Você pode registrar um `CommandLineRunner` definindo-o como um componente gerenciado pelo Spring ou declarando-o diretamente como um `@Bean`.

### Opção 1: Usando `@Component` (Classe Separada)

Essa abordagem mantém o código organizado e modularizado.

```java
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.stereotype.Component;

    @Component
    public class DatabaseSeeder implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println("🚀 Executando tarefas após a inicialização...");
            // Seu código de inicialização aqui (ex: salvar dados no banco)
            
            if (args.length > 0) {
                System.out.println("Argumento recebido: " + args[0]);
            }
        }
    }
```


### Opção 2: Usando `@Bean` (Na classe principal ou de configuração)

Mais prático para lógicas simples e diretas, utilizando expressões lambda.

```java
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;

    @SpringBootApplication
    public class MinhaAplicacao {

        public static void main(String[] args) {
            SpringApplication.run(MinhaAplicacao.class, args);
        }

        @Bean
        public CommandLineRunner executarNoInicio() {
            return args -> {
                System.out.println("Sistema pronto! Iniciando rotinas secundárias...");
            };
        }
    }
```


### Controle de Ordem

Se você tiver múltiplos beans `CommandLineRunner`, o Spring Boot os executará sem uma sequência garantida por padrão. Para definir quem executa primeiro, utilize a anotação `@Order`:

```java
    @Component
    @Order(1) // Executa primeiro
    public class PrimeiroRunner implements CommandLineRunner { /* ... */ }

    @Component
    @Order(2) // Executa depois
    public class SegundoRunner implements CommandLineRunner { /* ... */ }
```
## Exemplo Prático: StartupRestClientRunner

Este exemplo ilustra um cliente **REST** que é executado automaticamente ao
iniciar a aplicação Spring Boot, realizando uma chamada a uma API para
listar produtos.

```java
    package com.produtoapi.runner;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.stereotype.Component;
    import org.springframework.web.client.RestTemplate;
    import com.produtoapi.model.Produto;
    import java.util.Arrays;
    import java.util.List;
    
    @Component
    public class StartupRestClientRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {

        System.out.println("RestClient sendo executado");

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/produtos"; // URL da sua API
        Produto[] produtosArray = restTemplate.getForObject(url, Produto[].class);
        List<Produto> produtos = Arrays.asList(produtosArray);
        produtos.forEach(produto -> System.out.println("ID:" + produto.getId() + " " + produto.getNome() + ": " + produto.getPreco()));
        }
    }
```


## CommandLineRunner vs ApplicationRunner

Ambos realizam exatamente o mesmo papel e rodam no mesmo momento do ciclo de vida. A única diferença está em **como tratam os argumentos passados** via linha de comando (`java -jar app.jar --porta=8080`):

|**Característica**	|**`CommandLineRunner`**|	**`ApplicationRunner`**|
|---|---|---|
|**Formato dos argumentos**	|Array bruto de Strings (`String... args`)	|Objeto estruturado (`ApplicationArguments`)|
|**Complexidade**|	Simples, exige parse manual de flags.|	Avançado, possui métodos nativos para ler chaves/valores.|

Se precisar analisar parâmetros complexos por linha de comando (ex: `--env=prod -debug`), o `ApplicationRunner` é mais recomendado. Para tarefas comuns de inicialização interna, o `CommandLineRunner` resolve com menos código.