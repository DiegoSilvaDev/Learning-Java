public class CalculadoraTradicional {
    
    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraTradicional calc = new CalculadoraTradicional();

        double resultadoSoma = calc.somar(10, 5);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = calc.subtrair(10, 5);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calc.multiplicar(10, 5);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calc.dividir(10, 5);
        System.out.println("Divisão: " + calc.dividir(10, 5));

    }
}