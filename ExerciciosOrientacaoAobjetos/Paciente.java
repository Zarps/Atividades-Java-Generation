package ExerciciosOrientacaoAobjetos;

public class Paciente {

	// Crie uma classe paciente e apresente os atributos e métodos referentes
	// esta classe, em seguida crie um objeto paciente, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.

	// Atributos - variaveis

	private String nome;
	private String sexo;
	private int idade;
	
	void doenca1 () {
		System.out.println("Causa do paciente: Acidente de Moto!");
	}
	void doenca2() {
		System.out.println("Causa do paciente: Covid 19");
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
