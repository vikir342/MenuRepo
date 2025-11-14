package local;

import java.util.Scanner;

public class ClassePrincipal {
	
	public static void limparTela() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    }catch (Exception e) {
            System.out.println("Erro ao limpar tela.");
        }
    }

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do{
			limparTela();
			System.out.println("menu de opção");
			System.out.println("[1] adiconar um aluno");
			System.out.println("[2] Excluir um aluno");
			System.out.println("[3] ver alunos");
			System.out.println("[4] Sair");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			limparTela();
		
			switch(opcao){
			
			case 1:
				System.out.println("selecionado opção 1");
				System.out.println("selecionado opção 1");
			}
		} while(opcao != 4);
	}

}
