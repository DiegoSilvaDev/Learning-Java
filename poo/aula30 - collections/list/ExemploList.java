import java.util.List;
import java.util.Arrays; // Importação explícita da classe Arrays
import java.util.ArrayList;
// import java.util.*; // Importa todas as classes do pacote java.util

public class ExemploList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Verificando se a lista contém um elemento
        System.out.println("Contem 'Java'? " + list.contains("Java"));

        // Adicionando todos os elementos de outra coleção
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
        list.addAll(outraLista);

        // Imprimir --> [Java, Python, C++, JavaScript, Ruby]
        System.out.println("Lista completa: " + list);

        // Removendo um elemento
        list.remove("Python");

        // Imprimir --> [Java, C++, JavaScript, Ruby]
        System.out.println("Lista após remoção: " + list);

        // Obtendo um elemento pelo índice 
        String elemento = list.get(2); // Obtém o 3º elemento da lista
        System.out.println("Elemento no índice 2: " + elemento);

        // Limpando a lista
        list.clear();

        System.out.println("Lista após limpar: " + list); // []


    }
}


