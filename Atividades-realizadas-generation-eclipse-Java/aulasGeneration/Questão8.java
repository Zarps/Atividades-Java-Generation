package aulasGeneration;

import java.util.Scanner;

public class Questão8 {
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int custoF, totalC;
		
		System.out.println("Qual o custo de fábrica do veiculo? ");
		custoF = leia.nextInt();
		
		totalC = ((custoF / 100) * 28) + ((custoF / 100) * 45) + custoF;
		
		System.out.println(" O valor total para o consumidor será: " + totalC + " Dolares.");
		custoF = leia.nextInt();

	}

}
