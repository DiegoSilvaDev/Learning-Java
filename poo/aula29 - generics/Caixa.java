public class Caixa<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }
    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        // Criando uma caixa para guardar Strings
        Caixa<String> caixaDeTexto = new Caixa<>();

        caixaDeTexto.guardar("Olá, mundo!");

        String texto = caixaDeTexto.pegar();

        System.out.println(texto);
        

        // int  --> Integer
        // long --> Long
        // byte --> Byte

        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        // Integer numero = new Integer(41); Deprecated
        Integer numero = Integer.valueOf(41);
        caixaDeNumeros.guardar(numero);

        Integer valorResgatado = caixaDeNumeros.pegar();
        System.out.println(valorResgatado);

     
    }
}
