interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

// Interface3 estende Interface1 e Interface2
interface Interface3 extends Interface1, Interface2 {
    void metodo3();
}

// Pode implementar na classe mais de uma interface 
public class TestInterface implements Interface3{
    public void metodo1(){
        System.out.println("Método 1");
    }

    public void metodo2(){
        System.out.println("Método 2");
    }

    public void metodo3() {
        System.out.println("Método 3");
    }

    public static void main(String[] args) {
        TestInterface test = new TestInterface();

        test.metodo1();
        test.metodo2();
        test.metodo3();

    }
}
