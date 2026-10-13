public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma total é: " + soma); // Saída: 150
    }
}
