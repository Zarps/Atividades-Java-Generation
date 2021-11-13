package ExerciciosOrientacaoAobjetos;

//Crie uma classe cliente e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

public class Cliente {

	// Atributos - variaveis
	private String nome;
	private int idade;
	private String sexo;

	// m�todos -> verbo

	void comprando() {
		System.out.println("Cliente Comprou, Gra�as a Deus");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	void olhando() {
		System.out.println("Cliente s� dando uma olhadinha");
	}
}
