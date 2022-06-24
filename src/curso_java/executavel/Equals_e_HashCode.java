package curso_java.executavel;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;

public class Equals_e_HashCode {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		
		String nome1 = JOptionPane.showInputDialog("Nome do aluno 1: ");
		String cpf1 = JOptionPane.showInputDialog("CPF do aluno 1: ");
		
		String nome2 = JOptionPane.showInputDialog("Nome do aluno 2: ");
		String cpf2 = JOptionPane.showInputDialog("CPF do aluno 2: ");
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome(nome1);
		aluno2.setNome(nome2);
		
		aluno1.setNome(cpf1);
		aluno2.setNome(cpf2);
		
		// Equals e HashCode -> diferenciar e comparar objetos.
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Objetos iguais!");
			
		} else {
			System.out.println("Objetos diferentes!");
			
		}

	}

}