import java.io.*;

class Exec1 {
    public void escreverNoArquivo(String nomeArquivo, String conteudo){
        

        try {

            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(conteudo);
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
       
    }

    public void lerDoArquivo(String nomeArquivo){
        

        try {
            FileReader reader = new FileReader(nomeArquivo);
            int data = reader.read();

            while (data != -1){
                System.out.print((char) data);

                data = reader.read();
            }

            reader.close();  
        } catch (IOException e ){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        Exec1 manipulacaoArquivos = new Exec1();

        manipulacaoArquivos.escreverNoArquivo("meuArquivo.txt", "Olá, mundo!");

        manipulacaoArquivos.lerDoArquivo("meuArquivo.txt");
    }
}