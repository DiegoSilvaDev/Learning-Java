class FinalVariables {
    final int numeroMaximo = 100;
    final String mensagem = "Bem vindo ao mundo da programação";

    void imprimirValores(){
        System.out.println(numeroMaximo, mensagem);
    }
}

public class Exec1 {
    public static void main(String[] args) {
        FinalVariables fv = new FinalVariables();
        fv.numeroMaximo = 200;
        fv.mensagem = "teste";


        fv.imprimirValores();
    }
}