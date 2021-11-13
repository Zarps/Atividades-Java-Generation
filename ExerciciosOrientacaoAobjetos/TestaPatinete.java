package ExerciciosOrientacaoAobjetos;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Scanner para ler as variaveis

		// instanciando(Criando) o objeto de cliente

		Patinete patinete = new Patinete();

		patinete.setMarca("DM Toys");
		patinete.setCor("azul");
		patinete.setPeso(40);
		patinete.setPreco(185.90);

		System.out.println("Marca do patinete: " + patinete.getMarca());
		System.out.println("Cor: " + patinete.getCor());
		System.out.println("Peso máximo suportado: " + patinete.getPeso() + "kg");
		System.out.println("Preço: R$" + patinete.getPreco());
		System.out.println();
		patinete.idade();

		scan.close();
	}

}
