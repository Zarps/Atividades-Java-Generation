package ExerciciosOrientacaoAobjetos;

public class Funcionario {
	
	//Crie uma classe funcion�rio e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	//instancias deste objeto e apresente as informa��es deste objeto no
	//console.
	
	// Atributos - variaveis

	
	private String nome;
	private int senha;
	private int codigo;
	
	
	void trabalhar1 () {
		System.out.println(" Ve s� Trabalha Hoje eim! ");
		
	}
	void trabalho2 () {
		System.out.println(" Trabalha direito se n�o te mando embora! ");
		
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
