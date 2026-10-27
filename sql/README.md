# Introdução ao SQL

## O que é SQL?

SQL (Structured Query Language).

## Principais Comandos SQL: 

- **SELECT**: Usado para selecionar dados de um banco de dados.

- **INSERT**: Usado para inserir novos dados em uma tabela.

- **UPDATE**: Usado para atualziar dados exigentes em uma tabela.

- **DELETE**: Usado para deletar dados em uma tabela.

- **CREATE TABLE**: Usado para criar uma nova tabela.

- **ALTER TABLE**: Usado para modificar uma tabela já existente.

- **DROP TABLE**: Usado para deletar uma tabela.

### Exemplos de Comandos SQL (CRUD)

1. SELECT 

```sql
	SELECT nome, idade FROM usuarios;
```

Este comando seleciona as colunas `nome` e `idade` da tabela `usuarios`

2. INSERT

```sql
	INSERT INTO usuarios (nome, idade) VALUES ('João', 30);
```

Este comando insere um novo registro na tabela `usuarios` com o nome 'João' e idade 30.

3. UPDATE

```sql
	UPDATE usuarios SET idade = 31 WHERE nome = 'João';
```

Este comando atualiza a idade de 'João' para 31 na tabela `usuarios`.

4. DELETE

```sql
	DELETE FROM usuarios WHERE nome = 'João';
```

Este comando deleta o registro de 'João' da tabela `usuarios`.