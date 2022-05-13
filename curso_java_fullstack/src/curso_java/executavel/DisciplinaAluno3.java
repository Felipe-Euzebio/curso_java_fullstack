package curso_java.executavel;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;

public class DisciplinaAluno3 {

	public static void main(String[] args) {
		
		// Aluno alunoTeste = new Aluno("Felipe", 19, "Rômulo", 2021);
		
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		
		/* ------------------------------------------------------------------- */
		
		for (int pos = 1; pos <= 4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + ":");
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
			
		/* ------------------------------------------------------------------- */
		
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (opcao == 0) {	// Opção SIM -> 0
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
				
				String disciplinaRemover = JOptionPane.showInputDialog("Qual o nº da disciplina? (1, 2, 3 ou 4)");
				
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				
			}

		}
		
		/* ------------------------------------------------------------------- */
				
		System.out.println(aluno1);
		System.out.println("Media: " + aluno1.getMediaNota());
		//System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));
		System.out.println("Resultado: " + (aluno1.getAlunoStatusRecuperacao()));
		
	}

}
