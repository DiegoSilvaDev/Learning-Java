@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class Exec1 {
    public static void main(String[] args) {
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
        System.out.println("Potência: " + potencia.executar(2, 3));

        OperacaoMatematica raiz = (a, b) -> Math.sqrt(a + b);
        System.out.println("Raiz Quadrada: " + raiz.executar(10, 5));
    }
    
}