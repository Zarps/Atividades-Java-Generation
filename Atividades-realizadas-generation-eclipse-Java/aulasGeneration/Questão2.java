package aulasGeneration;

import java.util.Scanner;

//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

public class Quest�o2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int anos, meses, dias, idade;

		System.out.println("Quantos dias voc� ta vivo?: ");
		dias = leia.nextInt();

		meses = ((dias % 365) / 30);
		anos = (dias / 365);
		dias = ((dias % 365) % 30);
		
		System.out.println("voc� nasceu h� " + anos + " anos e " + meses + " meses " + dias + " dias ");
		anos = leia.nextInt();
			
		leia.close();
	}
	

}
