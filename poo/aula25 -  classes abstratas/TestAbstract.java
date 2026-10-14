abstract class Carro {
    int codigo = 10;
    abstract void acelerar();

    void frear() {
        System.out.println("Freando...");
    }
}

class CarroF1 extends Carro {
    void acelerar() {
        System.out.println("O carro de formula 1 está acelerando muito rapidamente...");
    }
}

class Caminhao extends Carro {
    void acelerar(){
        System.out.println("O caminhão esta acelerando lentamente...");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        // Carro car = new Carro(); // Não pode ser instanciada

        CarroF1 f1 = new CarroF1();
        Caminhao tru = new Caminhao();

        f1.acelerar();
        f1.frear();

        tru.acelerar();
        tru.frear();

        System.out.println();// Espaçamento
        System.out.println("Código: "  + tru.codigo);
        tru.codigo = 888;

        System.out.println("Novo Código: " + tru.codigo);
    }
}
