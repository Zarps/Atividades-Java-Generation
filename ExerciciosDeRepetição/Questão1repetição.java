package ExerciciosDeRepeti��o;

public class Quest�o1repeti��o {

	// Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	// obtemos resto = 5.
	public static void main(String[] args) {

		int n1;
		for (n1 = 1000; n1 <= 2000; n1++) {

			if (n1 % 11 == 5) {

				System.out.println(n1);
			}
		}

	}

}
