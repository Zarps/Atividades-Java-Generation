package Exercicios09denovembro;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade;

		System.out.println("Entre com a idade : ");
		idade = leia.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println(" infantil ");

		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");

		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto");

		} else {
			System.out.println("Idade Inv�lida");

		}
	}

}
