package ExerciciosDeRepeti��o;

public class Quest�o2Repeti��o {

	public static void main(String[] args) {

		int n, par = 0, impar = 0;

		for (n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				par++;

			} else {
				impar++;

			}

		}
		System.out.println("N�meros pares: " + par);
		System.out.println("N�meros impar: " + impar);

	}

}
