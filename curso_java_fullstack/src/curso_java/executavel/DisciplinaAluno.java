package curso_java.executavel;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;

public class DisciplinaAluno {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		
		String disciplinaA = JOptionPane.showInputDialog("Disciplina 1 do aluno: ");
		String notaA = JOptionPane.showInputDialog("Nota 1 do aluno: ");
		
		String disciplinaB = JOptionPane.showInputDialog("Disciplina 2 do aluno: ");
		String notaB = JOptionPane.showInputDialog("Nota 2 do aluno: ");
		
		String disciplinaC = JOptionPane.showInputDialog("Disciplina 3 do aluno: ");
		String notaC = JOptionPane.showInputDialog("Nota 3 do aluno: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		
		//----------------------------------//
		Disciplina disciplina1 = new Disciplina();
		//----------------------------------//
		
		disciplina1.setDisciplina(disciplinaA);
		disciplina1.setNota(Double.parseDouble(notaA));
		
		// Adicionando o objeto disciplina na lista de disciplinas da classe Aluno
		aluno1.getDisciplinas().add(disciplina1);
		
		//----------------------------------//
		Disciplina disciplina2 = new Disciplina();
		//----------------------------------//
		
		disciplina2.setDisciplina(disciplinaB);
		disciplina2.setNota(Double.parseDouble(notaB));
		
		aluno1.getDisciplinas().add(disciplina2);
		
		//----------------------------------//
		Disciplina disciplina3 = new Disciplina();
		//----------------------------------//
		
		disciplina3.setDisciplina(disciplinaC);
		disciplina3.setNota(Double.parseDouble(notaC));
		
		aluno1.getDisciplinas().add(disciplina3);
		
		/* ------------------------------------------------------------------- */
				
		System.out.println(aluno1);
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));
		
	}

}
