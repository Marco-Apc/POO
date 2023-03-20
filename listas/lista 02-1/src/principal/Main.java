package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro[] livro = new Livro[300];
        Fichario fichario = new Fichario(livro);

        int opcao;

        do {
            System.out.println("-=[Cadastro de Livros]=-");
            System.out.println("1 - cadastrar");
            System.out.println("2 - excluir");
            System.out.println("3 - alterar");
            System.out.println("4 - consultar");
            System.out.println("5 - relatório");
            System.out.println("0 - sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    fichario.cadastrar();
                    break;
                case 2:
                    fichario.excluir();
                    break;
                case 3:
                    fichario.alterar();
                    break;
                case 4:
                    fichario.consultar();
                    break;
                case 5:
                    fichario.relatorio();
                    break;
                case 0:
                    System.out.println("Bye bye...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}