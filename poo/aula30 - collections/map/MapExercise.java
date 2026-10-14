import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Caneta", 50);
        estoque.put("Lápis", 21);
        estoque.put("Borracha", 80);

        String nomeProduto = "Caneta";
        int quantidadeProduto = estoque.get(nomeProduto);

        System.out.println("Quantidade de " + nomeProduto + " : " + quantidadeProduto);

        int quantidadeRemovida = 10;
        if(quantidadeProduto >= quantidadeRemovida) {
            estoque.put(nomeProduto, quantidadeProduto - quantidadeRemovida);
            System.out.println("Quantidade de " + nomeProduto + " após remoção : " + (quantidadeProduto - quantidadeRemovida));
        } else {
            System.out.println("Quantidade insuficiente para remover.");
        }
    }
}
