# Modificadores de acesso

1. **Public**
2. **Private**
3. **Protected**
4. **default** (sem modificador)

### Exemplo: 

```java
	package com.empresa; 

	public class Funcionarios {

		private String nome; // Só pode ser acessado dentro da classe Funcionarios

		// Seu código

	}
```

## Explicação

Os **modificadores de acesso** em Java são palavras-chave que determinam a visibilidade e o nível de segurança de classes, atributos e métodos. Eles são fundamentais para o **encapsulamento** na Programação Orientada a Objetos (POO).

Java possui **4 níveis de visibilidade** definidos por três palavras-chave explícitas e um nível padrão (quando nenhum modificador é escrito):

1. **`private`** **(O mais restritivo)**

- **Onde é acessível**: Apenas dentro da **própria classe** onde foi declarado.
- **Uso comum**: Atributos de uma classe (geralmente combinados com métodos *Getters* e *Setters* para manter o controle de alteração dos dados).

2. **`default` (Sem palavra-chave / package-private)**

- **Onde é acessível**: Apenas pelas classes que estão no **mesmo pacote**.
- **Como declarar**: Você simplesmente não digita nada (ex: `int idade`; em vez de `public int idade;`).

3. **`protected`**

- **Onde é acessível**: No **mesmo pacote** e também por **subclasses** (classes filhas), mesmo que estejam em pacotes diferentes (via herança).
- **Uso comum**: Atributos ou métodos que você quer compartilhar com classes que herdam da sua classe principal.

4. **`public` (O mais permissivo)**

- **Onde é acessível**: Por **qualquer classe** em qualquer pacote de toda a aplicação.
- **Uso comum**: Métodos principais ou interfaces que precisam ser chamados livremente pelo restante do sistema