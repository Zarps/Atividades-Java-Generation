package ExerciciosOrientacaoAobjetos;

public class Funcionario {
	
	//Crie uma classe funcionário e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto funcionário, defina as
	//instancias deste objeto e apresente as informações deste objeto no
	//console.
	
	// Atributos - variaveis

	
	private String nome;
	private int senha;
	private int codigo;
	
	
	void trabalhar1 () {
		System.out.println(" Ve sê Trabalha Hoje eim! ");
		
	}
	void trabalho2 () {
		System.out.println(" Trabalha direito se não te mando embora! ");
		
	}
	void errou () {
		System.out.println("ERRROUU! ... Digite novamente ");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
