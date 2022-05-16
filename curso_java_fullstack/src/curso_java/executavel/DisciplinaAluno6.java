package curso_java.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;
import curso_java.constantes.StatusAluno;

public class DisciplinaAluno6 {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
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
			
			if (aluno.getAlunoStatusRecuperacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				alunosAprovados.add(aluno);
				
			} else if (aluno.getAlunoStatusRecuperacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				
				alunosRecuperacao.add(aluno);
				
			} else {
				
				alunosReprovados.add(aluno);
				
			}
			
		}
		
		System.out.println("-------------------- Lista dos Aprovados -------------------------");
		for (Aluno aluno : alunosAprovados) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("-------------------- Lista dos Recuperação -------------------------");
		for (Aluno aluno : alunosRecuperacao) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("-------------------- Lista dos Reprovados -------------------------");
		for (Aluno aluno : alunosReprovados) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
	}

}
