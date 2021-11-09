package Exercicios09denovembro;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se
		// este
		// número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se
		// for
		// ímpar exiba o número elevado ao quadrado.

		Scanner leia = new Scanner(System.in);

		int n, r, p;

		System.out.println("Digite o número: ");
		n = leia.nextInt();

		if (n % 2 == 0) {
			r = (int) Math.sqrt(n);
			System.out.println("Este número é par e sua raiz quadrada é : " + r);

		} else {
			p = (int) Math.pow(n, 2.0);
			System.out.println("Este número é impar e sua potência é: " + p);

		}
		leia.close();

	}

}
