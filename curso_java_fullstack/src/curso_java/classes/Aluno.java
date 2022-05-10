package curso_java.classes;

import java.util.Date;

public class Aluno {
	
	String nome;
	int idade;
	Date dataNascimento;
	String rg;
	String cpf;
	String nomeResponsavel;
	int matricula;
	String instituicaoEnsino;
	String serie;
	
	public Aluno(String nome, int idade, String nomeResponsavel, int matricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nomeResponsavel = nomeResponsavel;
		this.matricula = matricula;
	}
		
}


