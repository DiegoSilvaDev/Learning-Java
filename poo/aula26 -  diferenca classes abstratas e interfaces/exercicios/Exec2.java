abstract class Loja {
    int cnpj;
    String razaoSocial;
    boolean aberta = true;

    void abrir() {
        if(aberta){
            System.out.println("A loja está abrindo...");
        }
    }

    void fechar(){
        if(!aberta){
            System.out.println("A loja está fechando...");
        } 
    }
}

class LojaComercial extends Loja {
    LojaComercial(int cnpj, String razaoSocial, boolean aberta){
        super.cnpj = cnpj;
        super.razaoSocial = razaoSocial;
        super.aberta = aberta;
    }
}

public class Exec2 {
    public static void main(String[] args) {
        LojaComercial lc = new LojaComercial(111111111, "Solteiro", true);

        lc.abrir();

        lc.aberta = false;
        lc.fechar();
    }
}
