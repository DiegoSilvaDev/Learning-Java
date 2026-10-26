# Projeto Sistema de Informações Climáticas em Tempo Real

## Objetivo do Projeto

Desenvolver um sistema que utiliza uma API climática
(`WeatherAPI`) para obter e, exibir dados meteorológicos
atuais para uma cidade específica.

Wireframe (rascunho)

```text
Digite o nome da cidade: Itu
Informações Meteorológicas para Itu, Brazil
Data e Hora: 2024-06-14 22:00
Temperatura Atual: 15.7°C
Sensação Térmica: 15.7°C
Condição do Tempo: Clear
Umidade: 62%
Velocidade do Vento: 7.2 km/h
Pressão Atmosférica: 1020.0 mb
```

### Funcionalidades Principais

1. **Entrada do usuário**
2. **Comunicação com a API**
3. **Exibição de dados**



## Detalhes Técnicos do Projeto

- **Principais Classes Java**
	- `java.net.URI`: Representa um endereço da web.
	- `java.net.URLEncoder`: Codifica strings para uso na web.
	- `java.net.http.HttpClient`: Envia e recebe dados via HTTP.
	- `java.net.http.HttpRequest`: Representa uma solicitação HTTP.
	- `java.net.http.HttpResponse`: Representa uma resposta HTTP.
	- `java.nio.charset.StandardCharsets`: Define padrões de codificação de caracteres.

- **Real-time Weather API**: Fornecimento de dados Climáticos Real-Time
- U**tilização da biblioteca `org.json.JSONObject`**: Formato de dados leve para a troca de informações.

### Possíveis Razões para Dados Não Atualizados

1. Atraso na atualização dos dados
2. Problemas com a estação meteorológica
3. Problemas com a chave da API


### Sobre a `WeatherAPI`

- A `WeatherAPI` é uma API que fornece dados meteorológicos de alta qualidade.
- API key do `WeatherAPI` para acessar dados meteorológicos.

### Vantagens de usar WeatherAPI para Aprendizagem

1. **Prática com APIs**
2. **Manipulação de Dados**
3. **Integração de Dados em Tempo Real**
4. **Facilidade de Uso**
5. **Gratuidade**


## O `JSON` no Projeto

`JSON`, que significa JavaScript Object Notation, é um formato
de dados leve para a troca de informações.

### Como o `JSON` é usado no seu código

1. Envio de solicitação.
2. Retorno dos dados meteorológicos (`JSON`).
3. Conversão do `JSON` em um objeto Java
(org.json.JSONObject).
4. Leitura dos dados (temperatura, umidade, etc.).


## O módulo `JSON`

A biblioteca `org.json.JSONObject` não vem no JDK.

## Como baixar a biblioteca `JSON`

1. https://mvnrepository.com/artifact/org.json/json
2. Você terá um arquivo .jar, este é o arquivo da biblioteca
JSON.
3. Adicione este arquivo .jar ao projeto.

### Compilação
```bash
javac --module-path "caminho" --add-modules org.json ProjetoSistemaDeInformacoesClimaticasEmTempoReal.java
```

### Execução 

```bash
java --module-path "Caminho" --add-modules org.json ProjetoSistemaDeInformacoesClimaticasEmTempoReal
```