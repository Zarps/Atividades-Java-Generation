package aulasGeneration;

import java.util.Scanner;

public class Quest�o8 {
	//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int custoF, totalC;
		
		System.out.println("Qual o custo de f�brica do veiculo? ");
		custoF = leia.nextInt();
		
		totalC = ((custoF / 100) * 28) + ((custoF / 100) * 45) + custoF;
		
		System.out.println(" O valor total para o consumidor ser�: " + totalC + " Dolares.");
		custoF = leia.nextInt();

	}

}
