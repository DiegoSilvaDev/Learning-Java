abstract class FiguraGeometrica  {
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public void calcularArea(){
        double area = base * altura;
        System.out.println("A área é: " + (area));
    }

    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("O perímetro é: " + (perimetro));
    }
}

public class Exec1 {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(2, 10);
        ret.calcularArea();
        ret.calcularPerimetro();
    }   
}
