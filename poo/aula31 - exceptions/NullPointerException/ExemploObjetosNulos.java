public class ExemploObjetosNulos {
    // String test; // inicialização automática. Neste test receberá null
    // int testPrimitiva; // inicialização automática. Neste receberá 0
    
    public static void main(String[] args) {

        // String nome; // Variáveis locais devem ser inicializadas (obrigatório)
        // String nome = new String("Arnaldo");
        // String nome = "Arnaldo";
        String nome = null;

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo
            System.out.println("Tamanho do nome: " + tamanhoNome);
        
        } catch (NullPointerException e) {
            System.out.println("Erro: A variável 'nome' não tem valor, é nula");
        
        } finally {
            System.out.println("O Programa terminou.");
        }


    }
}

