# IO, NIO e Serialização em java

Em Java, **IO**, **NIO** e **Serialização** são conceitos fundamentais para lidar com entrada e saída de dados (arquivos, redes e persistência de objetos).

## Java IO (`java.io`) Input/OutPut

- **Modelo**: Baseado em **fluxos (Streams)** e operação *bloqueante* (blocking I/O).
- **Como funciona**: Lê ou grava dados byte a byte ou caractere a caractere. Enquanto a operação não é concluída, a thread fica travada (bloqueada) esperando o recurso responder.
- **Principais classes**:
	- `InputStream` / `OutputStream` (para dados em bytes).
	- `Reader` / `Writer` (para dados de texto/caracteres).
	- `File`, `FileInputStream`, `FileOutputStream`.
- **Quando usar**: Aplicações simples, leitura/escrita sequencial de arquivos pequenos ou quando a complexidade baixa importa mais do que o desempenho extremo.


## Java NIO (`java.nio` e NIO.2) New I/O

- **Modelo**: Baseado em C**anais (Channels)** e **Buffers**, com suporte a operações **não bloqueantes** (non-blocking I/O).

- **Como funciona**: Os dados são lidos para um `Buffer` através de um `Channel`. Permite que uma única thread gerencie várias conexões de rede simultaneamente (muito usado em servidores de alta concorrência).
- **Principais conceitos**:
	- **Buffer**: Bloco de memória onde os dados são armazenados temporariamente.
	- **Channel**: Via bidirecional que conecta a entidade (arquivo, socket) ao Buffer.
	- **Selectors**: Permitem monitorar múltiplos canais para saber quais estão prontos para leitura ou escrita.
- **Vantagens vs. Desvantagens**: Menor *overhead* e maior desempenho em E/S intensiva, mas com uma API **significativamente mais complexa** de implementar e manter do que o IO tradicional.

## Serialização em Java (`java.io.Serializable`)

- **O que é**: É o processo de converter o **estado de um objeto** em uma sequência de bytes para salvá-lo em disco, enviá-lo pela rede ou guardá-lo em um banco de dados.
- **Desserialização**: É o caminho inverso, ou seja, reconstruir o objeto em memória a partir dos bytes salvos.
- **Regras principais**:
	- A classe do objeto **deve implementar** a interface de marcação `java.io.Serializable` (que não possui métodos).
	- Atributos marcados com a palavra-chave `transient` **não são serializados**.
	- Atributos `static` (estáticos) **não são serializados**, pois pertencem à classe e não à instância.
	- É comum utilizar as classes `ObjectOutputStream` (para serializar/gravar) e `ObjectInputStream` (para desserializar/ler).
	- Guias e documentações detalhadas podem ser consultadas em artigos técnicos como o da [IBM sobre Serialização](https://www.ibm.com/docs/pt-br/wxs/8.6.0?topic=overview-serialization-using-java). 