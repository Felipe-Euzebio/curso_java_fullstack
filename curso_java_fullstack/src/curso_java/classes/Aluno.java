package curso_java.classes;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
	
	String nome, rg, cpf, nomeResponsavel, instituicaoEnsino, serie;
	int idade, matricula;
	Date dataNascimento;
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();		// Criando uma lista para armazenar objetos da classe Disciplina.
	
	/*
	public Aluno(String nome, int idade, String nomeResponsavel, int matricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nomeResponsavel = nomeResponsavel;
		this.matricula = matricula;
	}
	*/
	
	//------------------------------------------------------------------------------------//
	// Getters e Setters
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	//------------------------------------------------------------------------------------//
	// Metódo de média de notas
	
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
			
		}
		
		return somaNotas / disciplinas.size();
		
	}
	
	
	// Método que retorna true para aprovado e false para reprovado
	
	public boolean getAlunoStatus() {
		
		double media = this.getMediaNota();
		
		if (media >= 6.0) {
			return true;
			
		} else {
			return false;
			
		}
		
	}

	//------------------------------------------------------------------------------------//
	
	// Método toString()
	
	@Override
	public String toString() {
		return "Aluno [" + (nome != null ? "nome=" + nome + ", " : "") + (rg != null ? "rg=" + rg + ", " : "")
				+ (cpf != null ? "cpf=" + cpf + ", " : "")
				+ (nomeResponsavel != null ? "nomeResponsavel=" + nomeResponsavel + ", " : "")
				+ (instituicaoEnsino != null ? "instituicaoEnsino=" + instituicaoEnsino + ", " : "")
				+ (serie != null ? "serie=" + serie + ", " : "") + "idade=" + idade + ", matricula=" + matricula + ", "
				+ (dataNascimento != null ? "dataNascimento=" + dataNascimento + ", " : "")
				+ (disciplinas != null ? "disciplinas=" + disciplinas : "") + "]";
	}
	
	//------------------------------------------------------------------------------------//

	// Métodos equals() e hashCode()
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
	
}


