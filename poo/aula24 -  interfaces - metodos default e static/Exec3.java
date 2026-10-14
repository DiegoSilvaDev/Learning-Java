interface Produto {
    String getNome();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);

}

class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade = 0;

    ProdutoImpl(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }
    
    public void adicionarQuantidade(int quantidade) {
        if(quantidade != 0){
            this.quantidade += quantidade;
            System.out.println("Agora tem em estoque: " + this.quantidade);
            return;
        } 
        
        System.out.println("Não tem estoque do produto."); 
        
    }

    public void removerQuantidade(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Quantidade insuficiente em estoque");
            return;
        }
        this.quantidade -= quantidade;
        System.out.println("Agora tem em estoque: " + this.quantidade);
    }
}

public class Exec3 {
    public static void main(String[] args) {
        ProdutoImpl p = new ProdutoImpl("Caneta", 200);

        System.out.println(p.getNome());
        p.adicionarQuantidade(200);
        System.out.println(p.getQuantidade());// Saída: 400

        p.removerQuantidade(399);
        System.out.println(p.getQuantidade()); // Saída: 1

        p.removerQuantidade(2); // Saída: Quantidade insuficiente em estoque
        System.out.println(p.getQuantidade()); // Saída: 1

    }
}