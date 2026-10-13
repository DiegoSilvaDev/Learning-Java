class Calculadora {
    final int somar(int a, int b){
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora {
    @Override
    public int somar(int a, int b, int c){
        return a + b + c;
    }
}

public class Exec2 {
    CalculadoraCientifica calc = new CalculadoraCientifica();

    calc.somar(10, 20, 30);
}