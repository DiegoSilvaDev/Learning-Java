import java.util.*;

class ListExercise {
    static String temOFilme(boolean contem) {
        if(contem){
            return "Sim";
        }
        return "Não";
    }
        public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();

        

      

        filmes.add("Quebrando Regras");
        filmes.add("A Era do Gelo");
        filmes.add("A Lista de Schindler");
        filmes.add("Um Sonho de Liberdade");
        
        System.out.println("Catálogo: " + filmes);
        
        // boolean contem = 

        System.out.println("Contém o filme 'Quebrando Regras' ? " + temOFilme(filmes.contains("Quebrando Regras")));

        
        

    }
}