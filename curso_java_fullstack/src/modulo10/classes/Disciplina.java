package modulo10.classes;

import java.util.Objects;

// Esta classe Disciplina servirá para todos os objetos e instâncias de notas e disciplinas.

public class Disciplina {

	String disciplina;
	double nota;

	//------------------------------------------------------------------------------------//
	
	// Getters e Setters
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	//------------------------------------------------------------------------------------//
	
	// Método toString()
	
	@Override
	public String toString() {
		return "Disciplina [" + (disciplina != null ? "disciplina=" + disciplina + ", " : "") + "nota=" + nota + "]";
	}

	//------------------------------------------------------------------------------------//
	
	// equals() e hashCode()

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
}
