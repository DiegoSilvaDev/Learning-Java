public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas / quantidadeAlunos;

        } catch (ArithmeticException _) {
            System.out.println("Erro: Não é possível dividir por 0");
        } finally {
            System.out.println("O Programa terminou.");
        }


    }
}

