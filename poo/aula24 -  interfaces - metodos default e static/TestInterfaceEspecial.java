interface ExemploInterfaceEspecial {
    // método abstrato
    void metodoAbstrato(); 

    // método default
    default void metodoDefault(){ 
        System.out.println("Este é um método default na interface.");
    }

    // método static
    static void metodoStatic(){ 
        System.out.println("Este é um método static na interface.");
    }
}


class TestInterfaceEspecial implements ExemploInterfaceEspecial {
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
    }

    public static void main(String[] args) {
        TestInterfaceEspecial ts = new TestInterfaceEspecial();

        ts.metodoAbstrato();
        ts.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic();
    }
}

