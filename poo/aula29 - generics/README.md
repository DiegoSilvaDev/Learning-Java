# Generics  

**Generics** (Tipos Genéricos) em Java permitem parametrizar tipos (como classes, interfaces e métodos), permitindo criar códigos reutilizáveis, seguros e legíveis. Introduzidos no Java 5, eles evitam a necessidade de conversões explícitas de tipos (*cast*) e transferem a detecção de erros de tipo da execução para a **compilação**.

Generics em java é como se você tivesse uma caixa onde você pode colocar coisas dentro, mas você decide que tipo de coisas você quer coloacar nela.

Existem dois tipos principais de polimorfismo em Java:

## Por que usar? (O problema anterior)

Antes dos Generics, as coleções armazenavam objetos do tipo `Object`. Isso exigia um `cast` manual ao recuperar os dados, o que podia gerar erros graves (como `ClassCastException`) apenas quando o programa já estava rodando:
```java
			
	// Sem Generics (antigamente)
	List lista = new ArrayList();
	lista.get(0); // Retorna Object, exigia (String) lista.get(0)


```

Com os Generics, o tipo é definido na declaração:

```java
	// Com Generics
	List<String> lista = new ArrayList<>();
	lista.add("Java");
	String texto = lista.get(0); // Sem necessidade de cast

```


## Vantagens Principais

- **Segurança de tipo (*Type Safety*)**: O compilador impede que você insira um tipo de dado incorreto na estrutura.
- **Eliminação de *Casts***: Você não precisa converter os objetos recuperados manualmente.
- **Reutilização de código**: Uma única classe ou método pode funcionar com diferentes tipos de dados

## Convenções de Nomenclatura para Parâmetros

É uma convenção do Java usar letras maiúsculas (geralmente uma única letra) para representar os parâmetros de tipo:

- `T` – *Type* (Tipo geral)
- `E` – *Element* (Usado bastante pelo *Collections Framework*)
- `K` – *Key* (Chave em mapas)
- `V` – *Value* (Valor em mapas)
- `N` – *Number* (Número)

	- **Exemplo prático: Classe Genérica**:

		```java
			
			// Criando uma caixa que pode guardar qualquer tipo de objeto
			public class Caixa<T> {
			    private T conteudo;

			    public void guardar(T conteudo) {
			        this.conteudo = conteudo;
			    }

			    public T obter() {
			        return conteudo;
			    }
			}

			// Utilizando a classe
			Caixa<String> caixaDeTexto = new Caixa<>();
			caixaDeTexto.guardar("Olá, Mundo!");
			String valor = caixaDeTexto.obter();



		```

## Wildcards (Curingas com `?`)

Quando você precisa lidar com desconhecidos ou hierarquias de classes, usa-se o ponto de interrogação `?`:

- **Curinga não limitado (`?`)**: Aceita qualquer tipo.
- **Upper Bounded Wildcard (`? extends T`)**: Aceita o tipo `T` ou qualquer subtipo dele.
- **Lower Bounded Wildcard (`? super T`)**: Aceita o tipo `T` ou qualquer supertipo dele.

```java
	// Aceita List de Integer, Double, Float, etc. (qualquer coisa que estenda Number)
	public void somar(List<? extends Number> lista) {
	    // ...
	}

```


## Type Erasure (Apagamento de Tipo)

Por baixo dos panos, o Java utiliza um mecanismo chamado **Type Erasure**. Isso significa que as informações de tipo genérico **não existem em tempo de execução** elas servem apenas para o compilador verificar as regras. Um `List<String>` vira apenas um `List` comum na JVM.
- **Limitação**: Você não pode instanciar tipos primitivos diretamente em Generics (ex: `List<int>` não existe; deve-se usar a classe *Wrapper* correspondente, como `List<Integer>`).