abstract class Carro {
    int codigo = 10; // Estado de objeto
    abstract void acelerar();

    Carro (int cod) {
        this.codigo = cod;
    }
    void frear() {
        System.out.println("Freando...");
    }
}

class Caminhao extends Carro {
    Caminhao(int codigo){
        super(codigo);
    }
    void acelerar(){
        System.out.println("O caminhão esta acelerando lentamente...");
    }

    int mostrarCodigo(){
        return this.codigo;
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        // Carro car = new Carro(); // Não pode ser instanciada

        Caminhao tru = new Caminhao(1000);
        System.out.println(tru.mostrarCodigo());

    }
}
