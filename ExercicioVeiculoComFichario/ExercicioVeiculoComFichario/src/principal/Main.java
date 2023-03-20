package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Veiculo[] veics = new Veiculo[3];
		FicharioVeiculo fv = new FicharioVeiculo(veics);
		
		int opcao;
		
		do {
			System.out.println("--==[Cadastro de Veículos]==--");
			System.out.println("1 - cadastrar");
			System.out.println("2 - apagar");
			System.out.println("3 - alterar");
			System.out.println("4 - consultar");
			System.out.println("5 - relatório");
			System.out.println("6 - sair");
			System.out.println("Opção: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					fv.inserir();
					break;
				case 2:
					fv.excluir();
					break;
				case 3:
					fv.alterar();
					break;
				case 4:
					fv.consultar();
					break;
				case 5:
					fv.relatorio();
					break;
				case 6:
					System.out.println("Saindo do sistema...");
					break;
				default:
					System.out.println("Opção incorreta!");
			}
		}while(opcao != 6);
		
		sc.close();
	}
}
