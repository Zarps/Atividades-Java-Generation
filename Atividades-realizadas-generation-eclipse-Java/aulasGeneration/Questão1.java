package aulasGeneration;

import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idade;
		
		System.out.println("Quantos anos voc� tem?: ");
		anos = leia.nextInt();
			
		System.out.println("h� quantos meses voc� completou " + anos + " anos? ");
		meses = leia.nextInt();
		
		System.out.println("H� quantos dias voc� completou " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();
		
		idade = (365 * anos) + (30 * meses) + dias;
		
		System.out.println("Voc� nasceu h� " + idade + " dias. ");
		
		leia.close();
		

	}

}


//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias