# Introdução ao Apache Maven

### O que é o Apache Maven?

Apache Maven é uma ferramenta de gerenciamento de projetos.

### Por que usar o Maven?

- Automação de Build
- Gerencimaneto de Dependências
- Faclidade de Configuração: pom.xml

## Estrutura Básica do Projeto Maven

```maven
	my-app
	|--src
	|	|-- main
	|	|	|-- java
	|	|	|-- resources
	|	|-- test
	|	|	|-- java
	|-- pom.xml
```

# POM - Project Object Model

### Funções Principais

- Gerenciamento de Dependências
- Configurações do Build
- Metadados do Projeto

## Estrutura Básica do `pom.xml`

```xml
	<project xmlns="http://maven.apache.org/POM/4.0.0"
			 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
			 					http://maven.apache.org/xsd/maven4.0.0.xsd">
		 <modelVersion>4.0.0</modelVersion>

		 <groupId>com.produtoapi</groupId>
		 <artifactId>my-app</artifactId>
		 <version>1.0-SNAPSHOT</version>

		 <dependencies>
			 <dependency>
				 <groupId>org.springframework.boot</groupId>
				 <artifactId>spring-boot-starter-validation</artifactId>
			 </dependency>
		 	<!-- Adicione mais dependências conforme necessário -->
		 </dependencies>

		 <build>
			 <plugins>
				 <!-- Configuração de plugins -->
			 </plugins>
		 </build>
	</project>
```