package modulo10.classes;

import modulo10.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario (String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario () {
		
	}
	
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

	/*
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	*/

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

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
	}

	/*
	// Método do contrato de autenticação
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");	// Retorna true caso o login e senha sejam igual à "admin"
	}
	*/

	@Override
	public boolean autenticar(String login, String senha) {
		//return login.equals("admin") && senha.equals("admin");
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}

}
