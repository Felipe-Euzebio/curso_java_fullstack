package modulo10.excecoes;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Erro no processamento do arquivo -> " + erro);
	}
	
}
