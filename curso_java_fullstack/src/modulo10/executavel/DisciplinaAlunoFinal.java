package modulo10.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso_java.classes.Aluno;
import curso_java.classes.Disciplina;
import curso_java.constantes.StatusAluno;
import modulo10.classes.Diretor;
import modulo10.classes.Secretario;
import modulo10.classes_auxiliares.FuncaoAutenticacao;
import modulo10.excecoes.ExcecaoProcessarNota;
import modulo10.interfaces.PermitirAcesso;

public class DisciplinaAlunoFinal {

	public static void main(String[] args) {
		
		try {
			
			lerArquivoA();
			
			String login = JOptionPane.showInputDialog("Informe o login:");
			String senha = JOptionPane.showInputDialog("Informe a senha:");
			
			//PermitirAcesso secretario = new Secretario();
			
			PermitirAcesso acessoDiretor = new Diretor(login, senha); 
			//PermitirAcesso acessoSecretario = new Secretario(login, senha); 
			
			//if (!secretario.autenticar(login, senha)) {
			
			if (!new FuncaoAutenticacao(acessoDiretor).autenticar()) { 	// Vou travar o contrato para autorizar SOMENTE quem realmente tem o contrato 100% legítimo
				
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
			
		} catch (NumberFormatException e) {
			
			StringBuilder output = new StringBuilder();
			
			// Mensagem do erro ou causa
			System.out.println("Erro!");
			System.out.println("Mensagem: " + e.getMessage());
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++ ) {
				
				output.append("\nClasse do Erro: " + e.getStackTrace()[pos].getClassName());
				output.append("\nMétodo: " + e.getStackTrace()[pos].getMethodName());
				output.append("\nLinha: " + e.getStackTrace()[pos].getLineNumber());
				output.append("\nClasse: " + e.getClass().getName() + "\n");
			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas\n" + output.toString());
			
			// Imprime o erro no console Java
			e.printStackTrace();
			
		} catch (NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, "NullPointerException: \n" + e.getClass());
			
		} catch (ExcecaoProcessarNota e) { 	// Captura todas as exceções que não prevemos.
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: \n" + e.getClass().getName());
			
		} finally { 	// Sempre é executado, ocorrendo erros ou não. Usado quando se precisa executar um processo acontecendo um erro ou não
			
			JOptionPane.showMessageDialog(null, "Encerrando...");
			
		}
		
	}
	
	public static void lerArquivoA() throws ExcecaoProcessarNota {
		
		try {
			
			File file = new File("C:\\Users\\Felipe Euzébio\\git\\repository\\curso_java_fullstack\\src\\modulo11\\executavel\\arquivo.txt");
			Scanner scanner = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			
			throw new ExcecaoProcessarNota(e.getMessage());
			
		}
		
	}
	
	public static void lerArquivoB() throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Felipe Euzébio\\git\\repository\\curso_java_fullstack\\src\\modulo11\\executavel\\arquivo.txt");
		Scanner scanner = new Scanner(file);
		
	}

}
