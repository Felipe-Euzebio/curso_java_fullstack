package modulo10.interfaces;

// Essa interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {

	//public boolean autenticar();
	public boolean autenticar(String login, String senha);// Declara��o do m�todo
	
}
