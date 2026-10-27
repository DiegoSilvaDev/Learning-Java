# Introdução ao Spring

- Visão geral: Caixa de ferramentas gigante.
- Versatilidade: Diversas funcionalidades e módulos.

## Pilares do Spring

- **Inversão de controle (IoC)**: Gerencia dependências e interações entre componentes.
  - O Conceito Central: 
    - Em um programa Java tradicional, quando uma classe precisa de outra, você usa a palavra-chave new. No Spring, você não faz isso.
        O Spring possui um **Contêiner (IoC Container)** que gerencia o ciclo de vida dos objetos (chamados de **Beans**). Ele cria, guarda e entrega esses objetos quando o seu código precisa.
    - Imagine o Spring como um **garçom**. Você não vai até a cozinha preparar o prato (criar o objeto); você apenas pede o prato ao garçom, e ele o entrega pronto na sua mesa.
- **Injeção de dependência (DI)**: Mantém o código limpo e modular.
  - A Prática: 
    - É o mecanismo que o Spring usa para aplicar a IoC. Para pedir um objeto ao contêiner do Spring, você usa anotações.
    - A anotação principal para isso é a `@Autowired` (embora hoje em dia a boa prática seja injetar através do construtor da classe).
- **Programação Orientada a Aspectos (AOP)**: Organiza comportamnetos comuns, mantendo o código principal limpo.
  - As peças do Quebra-Cabeça: 
      - Para o Spring saber quais classes ele deve gerenciar, você "carimba" as suas classes com anotações específicas. As três principais são:
        - `@Repository`: Indica que a classe cuidará do acesso ao banco de dados.
        - `@Service`: Indica que a classe guardará as regras de negócio e a lógica principal do sistema.
        - `@Controller` ou `@RestController`: Indica que a classe receberá as requisições da web (as URLs que o usuário acessa).


## Componentes do Spring

- **Spring Boot**: Inicialização rápida de projetos.
- **Spring MVC**: Criação de aplicativos web.
- **Spring Data**: Acesso simplificado a bancos de dados.
- **Spring Security**: Funcionalidades robustas de segurança.
- **Spring Batch**: Processamento de grandes volumes de dados.
- **Spring Cloud**: Ferramnetas para sistemas distribuídos e microsserviços.
- **Spring Integration**: Soluções de integração empresarial.
- **Spring AMQP**: Suporta para mensageria assíncrona.
- **Spring WebFlux**: Programação reativa.
- **Spring AI**: Integração de inteligência artificial. 