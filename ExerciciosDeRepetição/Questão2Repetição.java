package ExerciciosDeRepetição;

public class Questão2Repetição {

	public static void main(String[] args) {

		int n, par = 0, impar = 0;

		for (n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				par++;

			} else {
				impar++;

			}

		}
		System.out.println("Números pares: " + par);
		System.out.println("Números impar: " + impar);

	}

}
