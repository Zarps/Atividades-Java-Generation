package ExerciciosDeRepeti��o;

import java.util.Scanner;

public class Quest�o6Repeti��o {

	// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	// final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	// 0(zero).(DO...WHILE)

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, multi = 0, mediaC = 0;
		double media = 0.0;
		do {
			System.out.println("Digite um n�mero inteiro: ");
			n = leia.nextInt();

			if (n % 3 == 0 && n != 0) {
				multi++;
				mediaC = mediaC + n;
			}
		}

		while (n != 0);

		media = mediaC / multi;

		System.out.println("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 �: " + media);
	}

}
