package Questao1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String dtaCriacao, nomeUser, dtaNasc, senha, dtaPubli, txtPubli, linkMidia; 
		
		System.out.println("Insira a data de criação");
		dtaCriacao = ler.next();
		System.out.println("Insira o nome de usuário");
		nomeUser = ler.next();
		System.out.println("Insira a data de nascimento");
		dtaNasc = ler.next();
		System.out.println("Insira sua senha");
		senha = ler.next();
		
		RedeSocial social = new RedeSocial(dtaCriacao, nomeUser, dtaNasc, senha);
		
		
		System.out.println("Insira a data da publicação");
		dtaPubli = ler.next();
		System.out.println("Insira o texto da publicação");
		txtPubli = ler.next();
		System.out.println("Insira o link de midia");
		linkMidia = ler.next();
		
		Publicacao publi1 = new Publicacao(dtaPubli, txtPubli, linkMidia);
		social.inserePubli(publi1);
		
		System.out.println("");
		System.out.println("Insira a data de uma nova publicação");
		dtaPubli = ler.next();
		System.out.println("Insira o texto de uma nova publicação");
		txtPubli = ler.next();
		System.out.println("Insira um novo link de midia");
		linkMidia = ler.next();
		
		Publicacao publi2 = new Publicacao(dtaPubli, txtPubli, linkMidia);
		social.inserePubli(publi2);
		
		social.imprimePublicacoes();
		
	}

}
