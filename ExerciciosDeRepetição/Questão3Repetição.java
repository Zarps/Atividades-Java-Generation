package ExerciciosDeRepeti��o;

import java.util.Scanner;

public class Quest�o3Repeti��o {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, cont21 = 0, cont50 = 0;

		while (idade >= -98) {

			System.out.println("Digite a idade");
			idade = leia.nextInt();

			if (idade <= 21) {
				cont21++;

			}
			if (idade > 50) {
				cont50++;

			}

		}

		System.out.println("Quantidade de pessoas com menos de 21 anos: " + cont21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + cont50);
			leia.close();
	}

}
