package modulo10.executavel;

import modulo10.classes.Aluno;
import modulo10.classes.Diretor;
import modulo10.classes.Secretario;
import modulo10.classes.Disciplina;
import modulo10.classes.Pessoa;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Felipe");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Alex");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcos");
		
		System.out.println("Salario do diretor: " + diretor.salario());
		
		System.out.println("Salario do secretario: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	// Polimorfismo
	public static void teste (Pessoa pessoa) {
		System.out.println("Pessoa: " + pessoa.getNome() + "Salario: " + pessoa.salario());
	}

}
