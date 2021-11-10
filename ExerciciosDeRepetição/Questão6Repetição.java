package ExerciciosDeRepetição;

import java.util.Scanner;

public class Questão6Repetição {

	// Escrever um programa que receba vários números inteiros no teclado. E no
	// final imprimir a média dos números múltiplos de 3. Para sair digitar
	// 0(zero).(DO...WHILE)

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, multi = 0, mediaC = 0;
		double media = 0.0;
		do {
			System.out.println("Digite um número inteiro: ");
			n = leia.nextInt();

			if (n % 3 == 0 && n != 0) {
				multi++;
				mediaC = mediaC + n;
			}
		}

		while (n != 0);

		media = mediaC / multi;

		System.out.println("A média dos números digitados que são múltiplos de 3 é: " + media);
	}

}
