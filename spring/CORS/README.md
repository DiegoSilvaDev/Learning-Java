# Segurança Web: CORS e CSRF

_Cross-Site Request Forgery_ (**CSRF**) - Falsificação de Requisição entre Sites

_Cross-Origin Resource Sharing_ (**CORS**) - Compartilhamento de Recursos entre Origens Diferentes

## Como o CORS afeta a aplicação Spring Boot?

### Exemplos de URLs: 

- Frontend (Cliente): `https://www.exemplo.com`
- Backend (Servidor): `https://api.exemplo.com`

## A anotação @CrossOrigin no Spring Boot:

### Exemplo 1: 

- #### @CrossOrigin (origins = "*")

    ```java
        @RestController
        @RequestMapping("/produtos")
        @CrossOrigin(origins = "*")
        public class ProdutoController {
            
            // Conteúdo de Controller
            
        }
    ```
  
### Exemplo 2: 

#### @CrossOrigin(origins = "https://www.exemplo.com")

- Aplicação frontend hospedada em `https://www.exemplo.com`
- Backend hospedado em `http://api.exemplo.com`
