package modulo10.classes;

import java.util.Date;

// Superclasse

public abstract class Pessoa {

	protected String nome, rg, cpf, nomePai, nomeMae;
	protected int idade;
	protected Date dataNascimento;
	
	// Método abstrato da superclasse — é obrigatória para todas as subclasses
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
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
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

	//------------------------ Método toString() ------------------------//
	
	
	//------------------------ Métodos equals() e hashCode() ------------------------//
	
}
