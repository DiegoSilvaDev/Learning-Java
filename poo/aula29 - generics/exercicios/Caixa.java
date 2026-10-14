public class Caixa<T> {
    private T[] elementos;

    public Caixa(int capacidade){
        elementos = (T[]) new Object[capacidade];
    }

    public void adicionar(T elemento, int indice){
        elementos[indice] = elemento;
    }

    public T obter(int indice){
        return elementos[indice];
    }

    public static void main(String[] args) {
       Caixa<Double> caixaD = new Caixa<>(3);
       caixaD.adicionar(10.05, 0);
       caixaD.adicionar(20.0, 1);

       System.out.println("Preço 1: " + caixaD.obter(0));
       System.out.println("Preço 2: " + caixaD.obter(1));


       Caixa<Character> caixaC = new Caixa<>(2);
       caixaC.adicionar('A', 0);
       caixaC.adicionar('B', 1);

       System.out.println("Letra 1: " + caixaC.obter(0));
       System.out.println("Letra 2: " + caixaC.obter(1));
     
    }
}
