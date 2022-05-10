package curso_java.executavel;

import curso_java.classes.Aluno;

public class MinhaClasse {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");

		System.out.println("Aluno 1: " + aluno1.getNome());

	}

}
