public class ExceptionThrow {
    
   public static void sacar(double valor) {
        if (valor <= 0) {
            // Lançando uma exceção manualmente com 'throw'
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }

    }

    public static void main(String[] args) {
        double valor = 0;

        try {
               
            sacar(valor);
            

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero! - " + e.getMessage());
        } finally {
            System.out.println("O programa encerrou.");
        }
        

        System.out.println("Passa se a exceção estiver sendo tratada.");
    }
}

