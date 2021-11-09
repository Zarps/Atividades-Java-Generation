package aulasGeneration;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idade;
		
		System.out.println("Quantos anos você tem?: ");
		anos = leia.nextInt();
			
		System.out.println("há quantos meses você completou " + anos + " anos? ");
		meses = leia.nextInt();
		
		System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();
		
		idade = (365 * anos) + (30 * meses) + dias;
		
		System.out.println("Você nasceu há " + idade + " dias. ");
		
		leia.close();
		

	}

}


//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias