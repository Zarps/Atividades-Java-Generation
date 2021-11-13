package ExerciciosOrientacaoAobjetos;

public class Patinete {

	// Crie uma classe patinete e apresente os atributos e métodos referentes
	// esta classe, em seguida crie um objeto patinete, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.

	// Atributos - variaveis

	private String marca;
	private double peso;
	private String cor;
	private double preco;

	void idade() {
		System.out.println("IDADE RECOMENDADA:Acima de 05 (cinco) anos");

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
