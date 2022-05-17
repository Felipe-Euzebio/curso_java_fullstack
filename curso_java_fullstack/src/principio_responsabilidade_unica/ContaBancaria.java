package principio_responsabilidade_unica;

import java.util.Objects;

public class ContaBancaria {
	
	private String descricao;
	private double saldo = 8000;
	
	/* ----------------------------------------------------------- */
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void somar100reais() {
		saldo += 100;
	}
	
	public void subtrair100reais() {
		saldo -= 100;
	}
	
	public void sacar(double saque) {
		saldo -= saque;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}

	@Override
	public String toString() {
		return "ContaBancaria [" + (descricao != null ? "descricao=" + descricao + ", " : "") + "saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		return Objects.equals(descricao, other.descricao)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
}
