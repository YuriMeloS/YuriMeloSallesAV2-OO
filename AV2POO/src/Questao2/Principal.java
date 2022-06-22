package Questao2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, titulo, ano;
		int id_aluno, id_prova, nota;
		double notaFim = 0;
		
		System.out.println("Insira seu nome");
		nome = ler.nextLine();
		System.out.println("Insira o id do aluno");
		id_aluno = ler.nextInt();
		System.out.println("Insira o ano");
		ano = ler.next();
		
		
		AlunoEnem alunoenem = new AlunoEnem(id_aluno, ano, nome);
		ArrayList<ProvaEnem> provas = new ArrayList<> ();
		
		for(int i=0; i<5; i++) {
			System.out.println("Insira o titulo da prova");
			titulo = ler.next();
			System.out.println("Insira o id da prova");
			id_prova = ler.nextInt();
			System.out.print("Insira sua nota");
			nota = ler.nextInt();
			
			ProvaEnem provaenem = new ProvaEnem(nota, id_prova, titulo);
			provas.add(provaenem);
			
			notaFim = 0;
			for(ProvaEnem notas: provas) {
				notas.getNota();
				notaFim++;
			}
			
			
		}
		
		
		System.out.println("A nota final é "+notaFim);
		
		
	}

}
