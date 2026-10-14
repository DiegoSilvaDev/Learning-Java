# Diferença entre classes abstratas e interfaces em Java

A principal diferença é que uma classe abstrata define uma estrutura compartilhada e código reutilizável (relação "é um"), enquanto uma interface define um contrato de comportamento que classes não relacionadas podem cumprir (relação "pode fazer" e suporte a múltiplas heranças).

## Principais Diferenças em Java

| **Característica** | **Classe Abstrata (`abstract class`)** | **Interface (`interface`)** |
| --- | --- | --- |
| **Herança** | Permite herança simples (`extends` de apenas uma classe). | Permite herança múltipla (`implements` de várias interfaces). |
| **Métodos** | Pode ter métodos abstratos (sem corpo) e concretos (com código pronto). | Tradicionalmente só tem assinaturas (métodos abstratos), embora aceite métodos `default` ou `static` desde o Java 8. |
| **Atributos (Variáveis)** | Pode declarar variáveis de instância de qualquer tipo e com estado mutável. | Todos os atributos são implicitamente `public static final` (constantes). |
| **Construtor** | Possui construtor (chamado pelas subclasses). | Não possui construtor. |
| **Instanciação** | Não pode ser instanciada diretamente. | Não pode ser instanciada diretamente. |



## Quando usar cada uma

- **Use Classe Abstrata quando**:
	- Você tem um grupo de classes intimamente relacionadas que compartilham código base, lógica ou variáveis de estado em comum.
	- Precisa definir campos de instância ou construtores para inicializar dados comuns.

- **Use Interface quando**:
	- Precisa que classes totalmente diferentes implementem o mesmo conjunto de comportamentos ou regras de contrato.
	- Precisa simular herança múltipla de tipos no seu projeto.
