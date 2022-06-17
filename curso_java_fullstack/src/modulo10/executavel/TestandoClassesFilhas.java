package modulo10.executavel;

import modulo10.classes.Aluno;
import modulo10.classes.Diretor;
import modulo10.classes.Secretario;
import modulo10.classes.Disciplina;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Felipe");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Alex");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcos");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Matemática");

	}

}
