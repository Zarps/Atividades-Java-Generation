package aulasGeneration;

import java.util.Scanner;

public class Quest�o5 {
	
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 

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
		
		System.out.println("A m�dia do aluno � " + media + ",");
		
		leia.close();
		
		
	}

}
