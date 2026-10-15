class Exec1 {
    static Integer numero = null; // Variavel nula

    public static void main(String[] args) {
        
        try {
            numero.toString();
        } catch (NullPointerException e) {
            System.out.println("Erro: não pode ser vázio. - " + e.getMessage());
        }
        
    }
}