public class Exec1 {
	public static void main(String[] args) {
		double nota[] =  new double[5];

		nota[0] = 8.0;
		nota[1] = 10.0;
		nota[2] = 7.5;
		nota[3] = 5.8;
		nota[4] = 10.0;


		for(double i : nota) {
			System.out.println("As notas são: " + i);
		}
	}
}