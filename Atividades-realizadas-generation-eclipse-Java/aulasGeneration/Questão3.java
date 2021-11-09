package aulasGeneration;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		Scanner leia = new Scanner(System.in);

		int segundos, horas, minutos;

		System.out.println("Quantos segundos durará o evento? ");
		segundos = leia.nextInt();

		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);
		
		System.out.println("O evento terá duração de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		leia.close();
		
		

	}

}
