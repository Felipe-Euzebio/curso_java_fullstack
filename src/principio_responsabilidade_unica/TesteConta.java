package principio_responsabilidade_unica;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		conta.setDescricao("Conta Bancária do Felipe");
		
		System.out.println(conta);
		
		conta.subtrair100reais();
		
		System.out.println(conta);
		
		conta.somar100reais();
		
		System.out.println(conta);
		
		conta.sacar(400);
		
		System.out.println(conta);
		
		conta.depositar(1000);
		
		System.out.println(conta);

	}

}
