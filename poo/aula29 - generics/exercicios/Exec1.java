class Tubarao {
    private String nome;
    private int tamanho;

    Tubarao(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String obterInformacoes() {
        return "Nome: " + nome + "\nTamanho: " + tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;

    Polvo(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String obterInformacoes(){
        return "Nome: " + nome + "\nTentaculos: " + tentaculos;
    }
}

public class Exec1<T> {
    private T conteudo;

    public T guardar(T animal) {
        return conteudo = animal;
    }

    public T pegar() {
        return conteudo;
    }

    public static void main(String[] args) {
        Exec1<Tubarao> tubarao = new Exec1<>();
        tubarao.guardar(new Tubarao("Chato", 50));

        Tubarao tutuba = tubarao.pegar();
        System.out.println(tutuba.obterInformacoes());

        Exec1<Polvo> polvo = new Exec1<>();
        polvo.guardar(new Polvo("Octopus", 8));

        Polvo polvin = polvo.pegar();
        System.out.println(polvin.obterInformacoes());
    }
}
