package Questao2;

public class AlunoEnem {
	int id_aluno;
	String nome, ano;
	public AlunoEnem(int id_aluno, String ano, String nome) {
		this.id_aluno = id_aluno;
		this.ano = ano;
		this.nome = nome;
	}
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
