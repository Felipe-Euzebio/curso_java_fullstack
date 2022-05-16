package curso_java.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;
import curso_java.constantes.StatusAluno;

public class DisciplinaAlunoFinal {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		if (!login.equalsIgnoreCase("admin") && !senha.equalsIgnoreCase("admin")) {
			
			String msg = "Acesso negado! Tente novamente.";
			JOptionPane.showMessageDialog(null, msg);
			main(args);
			
		}
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoStatusRecuperacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				maps.get(StatusAluno.APROVADO).add(aluno);
				
			} else if (aluno.getAlunoStatusRecuperacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				
			} else {
				
				maps.get(StatusAluno.REPROVADO).add(aluno);
				
			}
			
		}
		
		System.out.println("-------------------- Lista dos Aprovados -------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("-------------------- Lista dos Recuperação -------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("-------------------- Lista dos Reprovados -------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			
			System.out.println("Resultado: " + aluno.getAlunoStatusRecuperacao() + "com média de: " + aluno.getMediaNota());
			
		}
		
	}

}
