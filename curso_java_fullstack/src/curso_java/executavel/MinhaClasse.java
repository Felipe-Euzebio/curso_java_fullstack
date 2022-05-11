package curso_java.executavel;

import curso_java.classes.Aluno;

public class MinhaClasse {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("João");
		aluno1.setAv1(8.6);
		aluno1.setAv2(6.0);
		aluno1.setAvd(10.0);
		
		System.out.println("Aluno 1: " + aluno1.getNome());
		
		System.out.println("AV1: " + aluno1.getAv1());
		System.out.println("AV2: " + aluno1.getAv2());
		System.out.println("AVD: " + aluno1.getAvd());
		
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));

	}

}
