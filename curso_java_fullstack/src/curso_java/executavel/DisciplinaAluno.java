package curso_java.executavel;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;

public class DisciplinaAluno {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 do aluno: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1 do aluno: ");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 do aluno: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2 do aluno: ");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 do aluno: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3 do aluno: ");
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		
		aluno.getDisciplina().setDisciplina1(disciplina1);
		aluno.getDisciplina().setDisciplina2(disciplina2);
		aluno.getDisciplina().setDisciplina3(disciplina3);
		
		aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
		
		System.out.println(aluno);
		System.out.println("Media: " + aluno.getMediaNota());
		System.out.println("Resultado: " + (aluno.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));

	}

}
