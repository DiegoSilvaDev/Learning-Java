interface Veiculo {
    void iniciar();
    void parar();
    default void buzinar() {
        System.out.println("Buzinando");
    }
}

class Caminhao implements Veiculo {
    public void iniciar(){
        System.out.println("Ligando...");
    }

    public void parar(){
        System.out.println("Parando...");
    }

}

class Carro implements Veiculo {
     public void iniciar(){
        System.out.println("Ligando...");
    }

    public void parar(){
        System.out.println("Parando...");
    }

    public void buzinar(){
        System.out.println("Buzinando");
    }
}

class Exec1 {
    public static void main(String[] args) {
        Caminhao tr = new Caminhao();
        Carro car = new Carro();

        tr.iniciar();
        tr.parar();

        car.iniciar();
        car.parar();
    }
}