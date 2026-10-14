import java.util.*;

class SetExercise {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(41);
        numeros.add(42);
        numeros.add(40);
        numeros.add(57);
        numeros.add(24);

        boolean contem = numeros.contains(41);


        numeros.remove(42);

        System.out.println("Tem o número 41? " + contem);
        System.out.println("Conjunto completo: " + numeros);

    }
}