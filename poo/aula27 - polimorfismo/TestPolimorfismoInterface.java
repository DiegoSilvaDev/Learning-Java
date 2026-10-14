// Interface
interface Veiculo {
    void acelerar();
}

class Carro implements Veiculo {
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }
}

class Moto implements Veiculo {
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }

}

public class TestPolimorfismoInterface {
    public static void main(String[] args) {

        // Criando objetos polimórficos
        Veiculo car = new Carro();
        Veiculo moto = new Moto();

        car.acelerar(); // Saída: "O carro está acelerando"
        moto.acelerar(); // Saída: "A moto está acelerando"
    }
}