// Superclasse
abstract class Animal {
    public abstract void fazerSom();

    public void tipoObejto(){
        System.out.println("Obejto do tipo Animal");
    }
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

public class TestPolimorfismo {
    public static void main(String[] args) {

        // Criando objetos polimórficos
        Animal dog = new Cachorro();
        Animal cat = new Gato();


        dog.fazerSom(); // Saída: "Cachorro late..."
        cat.fazerSom(); // Saída: "O gato mia..."

        dog.tipoObejto();
        cat.tipoObejto();
    }
}