class Veiculo {

	void acelerar() {
		System.out.println("Veiculo está acelerando...");
	}
}

class Carro extends Veiculo {
	void acelerar() {
		super.acelerar();
		System.out.println("Carro está acelerando...");
	}
}

public class Exec1 {
	public static void main(String[] args) {
		Carro car = new Carro();
		car.acelerar();
	}
}