import java.nio.file.*;
import java.io.IOException;

class ManipulacaoArquivos {
    
    public void escreverNoArquivo(String nomeArquivo, String conteudo) {
        Path path = Paths.get(nomeArquivo);

        try {
            Files.write(path, conteudo.getBytes());

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void lerDoArquivo(String nomeArquivo) {
        Path path = Paths.get(nomeArquivo);

        try {
            byte[] bytes = Files.readAllBytes(path);

            String content = new String(bytes);

            System.out.println("Conteúdo lido do arquivo: " + content);


        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}

public class Exec2 {
    public static void main(String[] args) {
        ManipulacaoArquivos arq = new ManipulacaoArquivos();

        arq.escreverNoArquivo("meuArquivo.txt", "Olá, mundo!");

        arq.lerDoArquivo("meuArquivo.txt");
    }
}