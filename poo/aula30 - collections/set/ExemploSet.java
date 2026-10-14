import java.util.Set;
import java.util.HashSet;
// import java.util.*; // Importa todas as classes do pacote java.util

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos 
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        // Verificando se o  conjunto contém um elemento
        System.out.println("Contém 'Java'? " + conjunto.contains("Java"));  // true
        

        // Adicionando mais elementos
        conjunto.add("JavaScript");
        conjunto.add("Ruby");

        // Imprime --> [Java, Python, C++, JavaScript, Ruby]
        System.out.println("Conjunto completo: " + conjunto);

        // Removendo um elemento
        conjunto.remove("Python");

        // Imprime --> [Java, C++, JavaScript, Ruby]
        System.out.println("Conjunto após remoção: " + conjunto);

        // Tentando adicionar um elemento duplicado
        boolean foiAdicionado = conjunto.add("Java");
        System.out.println("Java foi adicionado novamenete? " + foiAdicionado); // false

        // Limpando o conjunto
        conjunto.clear();
        System.out.println("Conjunto após limpar: " + conjunto); // []


    }
}


