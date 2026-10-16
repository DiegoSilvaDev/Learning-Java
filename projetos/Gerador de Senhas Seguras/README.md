# Projeto Gerador de Senhas Seguras

## Introdução:

- **Objetivo**: Criar senhas aleatórias e seguras
- **Tecnologia**: Utiliza `java.security.SecureRandom`

## Funcionalidades: 

- **Conjunto de Caracteres**: Inclui letras, números e símbolos
- **Geração de Senha**: Cria senha com comprimento definido
pelo usuário
- **Segurança**: Usa `java.security.SecureRandom`
(criptograficamente forte)

### Exemplo de Uso:

Comprimento da Senha: 12 caracteres

**Resultado**: Exibe a senha gerada no console:

- **Senha gerada**: `PrTFx(Gan=Rj`


## Projeto Frontend para o Gerador de
Senhas

### Objetivo: inserir uma Interface Gráfica de Usuário (GUI) para
Gerar Senhas

Wireframe (rascunho) Gerador de Senhas

+-----------------------------------+
| 		Gerador de Senhas 			|
+-----------------------------------+
| 			Tamanho da Senha 		|
| 		______________________		|
| 									|
| 									|
| 			[Gerar Senha] 			|
| 									|		
| 									|
| 			Senha Gerada 			|
| 			____________ 			|
| 									|
+-----------------------------------+


### Observações:

- Criar uma Classe em JavaFX:
- Usar o Método `gerarSenha`:
	- `ProjetoGeradorDeSenhas.gerarSenha(tamanhoSenha)`;
