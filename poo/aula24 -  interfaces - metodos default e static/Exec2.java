interface PedidoRestaurante {
    void adicionarItem(String item, double preco);
    double calcularTotal();
}

class Pedido implements PedidoRestaurante {
    private double total = 0;

    public void adicionarItem(String item, double preco){
        System.out.println("Adicionando " + item + " (R$" + preco + ") ao pedido.");
        total += preco;
    }

    public double calcularTotal() {
        return total;
    }

}

public class Exec2 {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.adicionarItem("Hamburguer", 15.0);
        p.adicionarItem("Batata Frita", 8.0);
        p.adicionarItem("Refrigerante", 4.0);

        System.out.println("Valor Total do pedido: R$" + p.calcularTotal());

    }
}