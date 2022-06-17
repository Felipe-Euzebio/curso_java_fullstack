package modulo10.classes;

public class Secretario extends Pessoa{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public String getNivelCargo() {
		return nivelCargo;
	}
	
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [" + (registro != null ? "registro=" + registro + ", " : "")
				+ (nivelCargo != null ? "nivelCargo=" + nivelCargo + ", " : "")
				+ (experiencia != null ? "experiencia=" + experiencia + ", " : "")
				+ (nome != null ? "nome=" + nome + ", " : "") + (rg != null ? "rg=" + rg + ", " : "")
				+ (cpf != null ? "cpf=" + cpf + ", " : "") + (nomePai != null ? "nomePai=" + nomePai + ", " : "")
				+ (nomeMae != null ? "nomeMae=" + nomeMae + ", " : "") + "idade=" + idade + ", "
				+ (dataNascimento != null ? "dataNascimento=" + dataNascimento : "") + "]";
	}

}
