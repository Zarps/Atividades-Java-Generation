package ExerciciosDeRepetição;

import java.util.Scanner;

public class Questão5Repetição {

	// Crie um programa que leia um número do teclado até que encontre um
	// número igual a zero. No final, mostre a soma dos números
	// digitados.(DO...WHILE)

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = 0, soma = 0;

		while (n >= 0) {
			System.out.println("Digite o número: ");
			n = leia.nextInt();

			soma = n + soma;

			if (n == 0) {
				break;

			}

		}
		System.out.println("A soma dos números é: " + soma);
		leia.close();

	}

}
