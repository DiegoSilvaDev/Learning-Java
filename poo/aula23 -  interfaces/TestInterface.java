interface SerVivo {
    void respirar(); // método abstrato
}


interface Animal extends SerVivo {
// Compilador deixa explícito:
    public static final String DESCRICAO = "Animal é um ser vivo importante!";
    public abstract void fazerSom(); // método abstrato
}


// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {

    public void fazerSom() {
        System.out.println("O cachorro late");    
    }

    public void respirar() {
        System.out.println("Cachorro está "+ "Respirando...");
    }    

}   

// Classe Gato que implementa a interface Animal
class Gato implements Animal {
    
    public void fazerSom(){
        System.out.println("O gato mia");
    }

    public void respirar() {
        System.out.println("Gato está " + " Respirando...");
    }

}

public class TestInterface {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Animal é abstract, não pode ser instanciado

        System.out.println(Animal.DESCRICAO);

        Gato cat = new Gato();
        Cachorro dog = new Cachorro();

        dog.fazerSom(); // Deve imprimir "O cachorro late"
        dog.respirar(); // Deve imprimir "Respirando..."

        cat.fazerSom(); // Deve imprimir "O gato mia"
        cat.respirar(); // Deve imprimir "Respirando..."




    }
}