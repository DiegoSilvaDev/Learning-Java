public class ExcetionDivisaoPorZeroLancandoException {
    
    public static int calcularMedia(int totalNotas, int quantidadeAlunos) throws ArithmeticException {
            return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args) {
        int totalNotas = 10;

        int quantidadeAlunos = 0;

        try {
            int media = calcularMedia(totalNotas, quantidadeAlunos);
            System.out.println("Média das notas: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero! - " + e.getMessage());
        } finally {
            System.out.println("O programa encerrou.");
        }
        

        System.out.println("Passa se a exceção estiver sendo tratada");
    }
}

