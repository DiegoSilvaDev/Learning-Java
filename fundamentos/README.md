# Pilares Fundamentais do Java

- **Portabilidade (JVM)**: O código-fonte (`.json` ou `.java`) é compilado em **bytecode** (`.class`), que roda em qualquer sistema operacional que possua uma JVM instalada.
- **Orientação a Objetos (POO)**: Quase tudo no Java é estruturado em **classes** (moldes) e **objetos** (instâncias), utilizando pilares como abstração, encapsulamento, herança e polimorfismo.
- **Gerenciamento Automático de Memória**: O **Garbage Collector** limpa automaticamente da memória os objetos que não estão mais em uso, evitando vazamentos de memória.
- **Tipagem Forte**: Todas as variáveis, parâmetros e retornos de métodos precisam ter seus tipos explicitamente declarados, o que ajuda a encontrar erros ainda em tempo de compilação.

## Principais Conceitos da Linguagem

- **Variáveis e Tipos Primitivos**: Guardam dados na memória. Dividem-se em inteiros (`byte`, `short`, `int`, `long`), decimais (`float`, `double`), caracteres (`char`) e lógicos (`boolean`), além de tipos por referência como `String`.
- **Estruturas de Controle**: Controlam o fluxo de execução com condicionais (`if`, `else`, `switch`) e laços de repetição (`for`, `while`, do-`while`).
- **Métodos**: Blocos de código reutilizáveis que realizam tarefas específicas e ajudam a organizar a aplicação.
- **Estrutura Básica de um Programa**: Todo programa executável em console possui uma classe pública e o método de entrada principal (`public static void main(String[] args`).


## Ecossistema e Ferramentas Essenciais

- **JDK (Java Development Kit):** Pacote de desenvolvimento que inclui a JVM e ferramentas de compilação como o `javac`.

- **Principais Edições**:

    - **Java SE (Standard Edition)**: Para aplicações desktop e linha de comando.
    - **Java EE / Jakarta EE**: Para grandes aplicações corporativas e web.

- **Frameworks populares**: Spring Boot para criação ágil de APIs e microsserviços, e bibliotecas de teste como JUnit.