package aulasGeneration;

import java.util.Scanner;

// Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:

public class Questão4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double numeroA, numeroB, numeroC, ab, r, bc, s, d;

		System.out.println("Digite o valor de número A: ");
		numeroA = leia.nextDouble();

		System.out.println("Digite o valor de número B: ");
		numeroB = leia.nextDouble();

		System.out.println("Digite o valor de número C: ");
		numeroC = leia.nextDouble();

		ab = (numeroA + numeroB);
		r = Math.pow(ab, 2.0);
		bc = (numeroB + numeroC);
		s = Math.pow(bc, 2.0);

		d = ((r + s) / 2);
		
		System.out.println("D = R+S/2 resulta em = " + d);	
		
		leia.close();
		
		
	}

}
