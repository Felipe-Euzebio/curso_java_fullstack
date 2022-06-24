package curso_java.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;

public class DisciplinaAluno4 {

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
				
		for (Aluno aluno : alunos) {
			
			String procurarAluno = JOptionPane.showInputDialog("Digite o nome do aluno que deseja remover (opcional):");
			
			if (aluno.getNome().equalsIgnoreCase(procurarAluno)) {
				
				alunos.remove(aluno);
				break;
				
				
			} else {
				
				System.out.println(aluno);
				System.out.println("Media: " + aluno.getMediaNota());
				//System.out.println("Resultado: " + (aluno1.getAlunoStatus() ? "Aprovado!" : "Reprovado!"));
				System.out.println("Resultado: " + (aluno.getAlunoStatusRecuperacao()));
				System.out.println("------------------------------------------------------------------------------");
				
			}
					
		}
		
		for (Aluno aluno: alunos) {
			
			System.out.println("Alunos que sobraram na lista: ");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são: ");
			
			for (Disciplina disciplina: aluno.getDisciplinas()) {
				
				System.out.println(disciplina.getDisciplina());
				
			}
			
		}
		
	}

}
