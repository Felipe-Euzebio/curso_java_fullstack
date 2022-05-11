package curso_java.classes;

import java.util.Date;

public class Aluno {
	
	String nome, rg, cpf, nomeResponsavel, instituicaoEnsino, serie;
	int idade, matricula;
	Date dataNascimento;
	double av1, av2, avd;
	
	/*
	public Aluno(String nome, int idade, String nomeResponsavel, int matricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nomeResponsavel = nomeResponsavel;
		this.matricula = matricula;
	}
	*/
	
	public double getAv1() {
		return av1;
	}

	public void setAv1(double av1) {
		this.av1 = av1;
	}

	public double getAv2() {
		return av2;
	}

	public void setAv2(double av2) {
		this.av2 = av2;
	}

	public double getAvd() {
		return avd;
	}

	public void setAvd(double avd) {
		this.avd = avd;
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
		return (av1 + av2 + avd) / 3;
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

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", nomeResponsavel=" + nomeResponsavel
				+ ", instituicaoEnsino=" + instituicaoEnsino + ", serie=" + serie + ", idade=" + idade + ", matricula="
				+ matricula + ", dataNascimento=" + dataNascimento + ", av1=" + av1 + ", av2=" + av2 + ", avd=" + avd
				+ "]";
	}
	
	
}


