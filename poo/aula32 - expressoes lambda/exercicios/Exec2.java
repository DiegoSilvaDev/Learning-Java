import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Exec2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Banana");
        lista.add("Maçã");
        lista.add("Carambola");
        lista.add("Mexerica");
        lista.add("Melancia");

        System.out.println("Lista antes da remoção: " + lista);

        lista.removeIf(e -> e.length() > 6);

        System.out.println("Lista depois da remoção: " + lista);

        lista.add(0, "Uva");

        lista.forEach(System.out::println);    
    }
}