public class Exec2 {
    public static int acessarElemento(int[] array, int indice) {

        try {
            return array[indice];
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do Array - " + e.getMessage());
            return -1; // Valor padrão para indicar erro.
        } finally {
            System.out.println("O programa encerrou.");
        }
    }  


    public static void main(String[] args) {
        int[] meuArray = { 10, 20, 30, 40, 50 };

        System.out.println("Elemento 1: " + acessarElemento(meuArray, 2));
         
        System.out.println("Elemento 10: " + acessarElemento(meuArray, 10));
        
    }
}

