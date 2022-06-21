package modulo10.interfaces;

// Essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {

	//public boolean autenticar();
	public boolean autenticar(String login, String senha);// Declaração do método
	
}
