@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class CalculadoraFuncional{
    public static void main(String[] args) {
        Calculadora somar = (a, b) -> a + b;
        System.out.println("Soma: " + somar.calcular(10, 5));

        Calculadora subtrair = (a, b) -> a - b;
        System.out.println("Subtração: " + subtrair.calcular(10, 5));

        Calculadora multiplicar = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicar.calcular(10, 5));

        Calculadora dividir = (a, b) -> a / b;
        System.out.println("Divisão: " + dividir.calcular(10, 5));
    }
}