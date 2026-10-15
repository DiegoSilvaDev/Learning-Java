import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LambdaComCollection {
    public static void main(String[] args) {
        // List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3 , 4 , 5);

        List<Integer> listaDeNumeros;
        listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);
        listaDeNumeros.add(5);

        // for(Integer elemento : listaDeNumeros) {
        //     System.out.println(elemento);
        // }
        
                            //  Inferência
        listaDeNumeros.forEach((/*Integer*/ numero) -> System.out.println(numero));
    }
}