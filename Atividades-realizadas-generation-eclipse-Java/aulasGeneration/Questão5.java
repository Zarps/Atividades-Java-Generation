package aulasGeneration;

import java.util.Scanner;

public class Questão5 {
	
	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int notaA, notaB, notaC, notaAtotal, notaBtotal, notaCtotal, media;
		
		System.out.println("Primeira nota: ");
		notaA = leia.nextInt();
		
		System.out.println("Segunda nota: ");
		notaB = leia.nextInt();
		
		System.out.println("Terceira nota: ");
		notaC = leia.nextInt();
		
		notaAtotal = (notaA * 2);
		notaBtotal = (notaB * 3);
		notaCtotal = (notaC * 5);
		
		media = (notaAtotal + notaBtotal + notaCtotal) / 10;
		
		System.out.println("A média do aluno é " + media + ",");
		
		leia.close();
		
		
	}

}
