import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LambdaComCorpo {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3 , 4 , 5, 100);

        List<Integer> numerosPares = new ArrayList<>();

        int i = 10;
        // i++;
        i = 20;

    // Feito a inferência e não obrigatório o uso do ( )
        // listaDeNumeros.forEach( /*(numero)*/ numero -> { 
    // Ao declarar explícitamente o tipo, volta a ser obrigatório o uso dos ( )        
        listaDeNumeros.forEach((Integer numero) -> {
            int y = 200;
            y++;
            System.out.println("Valor de Y: " + y);
            // System.out.println("Valor de i: " + i); // Só consegue acessar se ela for final ou efetivamente final

            // Chaves opcionais 
            if(numero % 2 == 0) numerosPares.add(numero);

        });
        
        System.out.println("Numeros pares: " + numerosPares);
    }
}