package aulasGeneration;

import java.util.Scanner;

public class Quest�o3 {

	public static void main(String[] args) {
		// Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		Scanner leia = new Scanner(System.in);

		int segundos, horas, minutos;

		System.out.println("Quantos segundos durar� o evento? ");
		segundos = leia.nextInt();

		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);
		
		System.out.println("O evento ter� dura��o de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		leia.close();
		
		

	}

}
