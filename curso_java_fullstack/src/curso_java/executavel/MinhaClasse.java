package curso_java.executavel;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;

public class MinhaClasse {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		String av1 = JOptionPane.showInputDialog("Nota AV1 do aluno: ");
		String av2 = JOptionPane.showInputDialog("Nota AV2 do aluno: ");
		String avd = JOptionPane.showInputDialog("Nota AVD do aluno: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		
		// Transformando o valor gravado como string em double
		aluno1.setAv1(Double.parseDouble(av1));
		aluno1.setAv2(Double.parseDouble(av2));
		aluno1.setAvd(Double.parseDouble(avd));
		
		/*
		System.out.println("Aluno 1: " + aluno1.getNome());
		
		System.out.println("AV1: " + aluno1.getAv1());
		System.out.println("AV2: " + aluno1.getAv2());
		System.out.println("AVD: " + aluno1.getAvd());
		
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));
		*/
		
		System.out.println(aluno1);
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));

	}

}
