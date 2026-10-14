// Superclasse
abstract class Animal extends Object{ // Compilador "infere" se não estiver explícito
    public abstract void fazerSom();

}

class Cachorro extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("Cachorro late...");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("O gato mia...");
    }
}

public class TestObject {
    public static void main(String[] args) {

        // Criando objetos polimórficos
        Object dog = new Cachorro();
        Object cat = new Gato();


        // dog.fazerSom(); // Saída: "Cachorro late..."
        Cachorro objConvertido = (Cachorro) dog; // Casting Object
        objConvertido.fazerSom();

        ((Cachorro) dog).fazerSom(); // Casting Object


        // cat.fazerSom(); // Saída: "O gato mia..."

    }
}