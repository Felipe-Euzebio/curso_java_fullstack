package modulo10.classes;

public class Diretor extends Pessoa{

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [" + (registroEducacao != null ? "registroEducacao=" + registroEducacao + ", " : "")
				+ "tempoDirecao=" + tempoDirecao + ", " + (titulacao != null ? "titulacao=" + titulacao + ", " : "")
				+ (nome != null ? "nome=" + nome + ", " : "") + (rg != null ? "rg=" + rg + ", " : "")
				+ (cpf != null ? "cpf=" + cpf + ", " : "") + (nomePai != null ? "nomePai=" + nomePai + ", " : "")
				+ (nomeMae != null ? "nomeMae=" + nomeMae + ", " : "") + "idade=" + idade + ", "
				+ (dataNascimento != null ? "dataNascimento=" + dataNascimento : "") + "]";
	}	
	
}
