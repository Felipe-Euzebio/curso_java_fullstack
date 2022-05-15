package curso_java.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;

public class DisciplinaAluno5 {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 2; qtd++) {
		
			Aluno aluno = new Aluno();
			
			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + ":");
			
			aluno.setNome(nome);
			
			/* ------------------------------------------------------------------- */
			
			for (int pos = 1; pos <= 4; pos++) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + ":");
				Disciplina disciplina = new Disciplina();
				
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno.getDisciplinas().add(disciplina);
				
			}
				
			/* ------------------------------------------------------------------- */
			
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if (opcao == 0) {	// Opção SIM -> 0
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					
					String disciplinaRemover = JOptionPane.showInputDialog("Qual o nº da disciplina? (1, 2, 3 ou 4)");
					
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					
				}
	
			}
			
			alunos.add(aluno);
		
		}
		
		/* ------------------------------------------------------------------- */
				
		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Media: " + aluno.getMediaNota());
			System.out.println("Resultado: " + (aluno.getAlunoStatusRecuperacao()));
			System.out.println("------------------------------------------------------------------------------");
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				
				Disciplina disciplina = aluno.getDisciplinas().get(posd);
				System.out.println("Matéria: " + disciplina.getDisciplina());
				System.out.println("Nota: " + disciplina.getNota());
				
			}
			
			/*
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				
				System.out.println("Matéria: " + disciplina.getDisciplina());
				System.out.println("Nota: " + disciplina.getNota());
				
			}
			*/
			
		}
		
	}

}
