package Questao1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RedeSocial {
	
	Scanner ler = new Scanner (System.in);
	String dtaCriacao, nomeUser, dtaNasc, senha;
	ArrayList<Publicacao> publicacoes = new ArrayList<> ();
	
	public RedeSocial(String dtaCriacao, String nomeUser, String dtaNasc, String senha) {
		this.dtaCriacao = dtaCriacao;
		this.nomeUser = nomeUser;
		this.dtaNasc = dtaNasc;
		this.senha = senha;
	}

	public String getDtaCriacao() {
		return dtaCriacao;
	}

	public void setDtaCriacao(String dtaCriacao) {
		this.dtaCriacao = dtaCriacao;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getDtaNasc() {
		return dtaNasc;
	}

	public void setDtaNasc(String dtaNasc) {
		this.dtaNasc = dtaNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void inserePubli(Publicacao publi) {
		publicacoes.add(publi);
	}
	
	public void imprimePublicacoes() {
		
		System.out.println("Total de publicações "+Publicacao.getContadorPubli());
		
		
	}
	
}
