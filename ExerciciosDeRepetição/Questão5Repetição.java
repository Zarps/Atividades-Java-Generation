package ExerciciosDeRepeti��o;

import java.util.Scanner;

public class Quest�o5Repeti��o {

	// Crie um programa que leia um n�mero do teclado at� que encontre um
	// n�mero igual a zero. No final, mostre a soma dos n�meros
	// digitados.(DO...WHILE)

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = 0, soma = 0;

		while (n >= 0) {
			System.out.println("Digite o n�mero: ");
			n = leia.nextInt();

			soma = n + soma;

			if (n == 0) {
				break;

			}

		}
		System.out.println("A soma dos n�meros �: " + soma);
		leia.close();

	}

}
