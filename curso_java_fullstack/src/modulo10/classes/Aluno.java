package modulo10.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import curso_java.classes.Disciplina;
import modulo10.constantes.StatusAluno;

public class Aluno extends Pessoa{
	
	private Date dataMatricula;
	private String serieMatriculado;
	private String instituicaoEnsino;
	private int matricula;
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	//------------------------------------------------------------------------------------//
	// Getters e Setters 
	
	public Date getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


	public String getSerieMatriculado() {
		return serieMatriculado;
	}


	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}


	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	// ---------------------------- Superclasse ----------------------------//
	
	public String getNome() {
		return super.nome;
	}
	
	public void setNome(String nome) {
		this.nome = super.nome;
	}
	
	public String getRg() {
		return super.rg;
	}
	
	public void setRg(String rg) {
		this.rg = super.rg;
	}
	
	public String getCpf() {
		return super.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = super.cpf;
	}
	
	public String getNomePai() {
		return super.nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = super.nomePai;
	}
	
	public String getNomeMae() {
		return super.nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = super.nomeMae;
	}
	
	public int getIdade() {
		return super.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = super.idade;
	}
	
	public Date getDataNascimento() {
		return super.dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = super.dataNascimento;
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
	
	
	public String getAlunoStatusRecuperacao() {
		
		double media = this.getMediaNota();
		
		if (media >= 5.0) {
			if (media >= 6.0) {
				return StatusAluno.APROVADO;
				
			} else {
				return StatusAluno.RECUPERACAO;
				
			}
			
		} else {
			return StatusAluno.REPROVADO;
			
		}
		
	}

	//------------------------------------------------------------------------------------//	
	
	@Override
	public String toString() {
		return "Aluno [" + (dataMatricula != null ? "dataMatricula=" + dataMatricula + ", " : "")
				+ (serieMatriculado != null ? "serieMatriculado=" + serieMatriculado + ", " : "")
				+ (instituicaoEnsino != null ? "instituicaoEnsino=" + instituicaoEnsino + ", " : "") + "matricula="
				+ matricula + ", " + (disciplinas != null ? "disciplinas=" + disciplinas + ", " : "")
				+ (nome != null ? "nome=" + nome + ", " : "") + (rg != null ? "rg=" + rg + ", " : "")
				+ (cpf != null ? "cpf=" + cpf + ", " : "") + (nomePai != null ? "nomePai=" + nomePai + ", " : "")
				+ (nomeMae != null ? "nomeMae=" + nomeMae + ", " : "") + "idade=" + idade + ", "
				+ (dataNascimento != null ? "dataNascimento=" + dataNascimento : "") + "]";
	}
	
	// Identifica método sobreescrito
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Você é maior de idade." : "Ops! Você não é maior de idade.";
	}
	
}
