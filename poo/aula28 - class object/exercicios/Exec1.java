abstract class Veiculo{
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Placa: " + placa + "\nAno: " + ano);
    }

}

class Onibus extends Veiculo {
    private int assentos;
   

   public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
   }

   public void exibirInformacoes(){
        System.out.println("Placa: " + placa + "\nAno: " + ano + "\nAssentos: " + assentos);
   }
}

class Caminhao extends Veiculo {
    private int eixos;
   
   public Caminhao(String placa, int ano, int eixos){
    super(placa, ano);
    this.eixos = eixos;
   }

   public void exibirInformacoes(){
        System.out.println("Placa: " + placa + "\nAno: " + ano + "\nEixos: " + eixos);     
   }
}

public class Exec1 {
    public static void main(String[] args) {

       Veiculo busao = new Onibus("31ds2420", 2012, 32);
       Veiculo h113 = new Caminhao("212jjdsoip", 2026, 8);

       busao.exibirInformacoes();
       h113.exibirInformacoes();

    }
}