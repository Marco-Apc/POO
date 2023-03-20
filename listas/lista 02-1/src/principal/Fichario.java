package principal;

import java.util.Scanner;

public class Fichario {
    Scanner sc = new Scanner(System.in);

    Livro[] vetLivros;
    int contador;

    public Fichario(Livro[] vetLivros) {
        this.vetLivros = vetLivros;
    }

    public void cadastrar() {

        contador = 0;

        while ((contador < vetLivros.length) && (vetLivros[contador] != null)) {
            contador++;
        }

        if (contador < vetLivros.length) {
            System.out.println("-+=============================================+-");
            System.out.println("CADASTRO");
            System.out.println("Digite o título do Livro: ");
            String titulo = sc.nextLine();

            System.out.println("Digite o autor do Livro: ");
            String autor = sc.nextLine();

            System.out.println("Digite o editora do Livro: ");
            String editora = sc.nextLine();

            System.out.println("Digite o ano de publicação do Livro: ");
            int ano = sc.nextInt();

            System.out.println("Digite a edição do Livro: ");
            int edicao = sc.nextInt();
            sc.skip("\n");

            System.out.println("Digite o ISBN do Livro: ");
            String isbn = sc.nextLine();

            vetLivros[contador] = new Livro(titulo, autor, editora, ano, edicao, isbn);

            System.out.println("Livro cadastrado com sucesso!");
        } else {
            System.out.println("Memória cheia!");
        }
    }

    public void excluir() {
        int resposta;

        if (contador > 0 || vetLivros[contador] != null) {
            System.out.println("-+=============================================+-");
            System.out.println("EXCLUSÃO");
            System.out.println("Digite a posição desejada:");
            int posicao = sc.nextInt();

            if (vetLivros[posicao] != null) {
                System.out.println("-=[DADOS DO LIVRO]=-");
                dadosLivro(vetLivros[posicao]);
                System.out.println("Deseja excluir? (1 - SIM / 2 -  NÃO)");
                resposta = sc.nextInt();

                if (resposta == 1) {
                    vetLivros[posicao] = null;
                    System.out.println("Excluído com sucesso!");
                } else if (resposta == 2) {
                    System.out.println("Cancelado!");
                } else {
                    System.out.println("A exclusão deu erro!");
                }
            } else {
                System.out.println("Não há dados nessa posição!");
            }
        } else {
            System.out.println("ERRO!!");
            System.out.println("Memória vazia");
        }
    }

    public void alterar() {
        int resposta;

        if (contador > 0 || vetLivros[contador] != null) {
            System.out.println("-+=============================================+-");
            System.out.println("ALTERAÇÃO");
            System.out.println("Digite a posição desejada:");
            int posicao = sc.nextInt();

            if (vetLivros[posicao] != null) {
                System.out.println("-=[DADOS DO LIVRO]=-");
                dadosLivro(vetLivros[posicao]);
                System.out.println("Deseja alterar? (1 - SIM / 2 -  NÃO)");
                resposta = sc.nextInt();
                sc.skip("\n");

                if (resposta == 1) {
                    System.out.println("Digite os novos dados");
                    System.out.println("Digite o título do Livro: ");
                    vetLivros[posicao].setTitulo(sc.nextLine());

                    System.out.println("Digite o autor do Livro: ");
                    vetLivros[posicao].setAutor(sc.nextLine());

                    System.out.println("Digite o editora do Livro: ");
                    vetLivros[posicao].setEditora(sc.nextLine());

                    System.out.println("Digite o ano de publicação do Livro: ");
                    vetLivros[posicao].setAnoPublicacao(sc.nextInt());

                    System.out.println("Digite a edição do Livro: ");
                    vetLivros[posicao].setEdicao(sc.nextInt());
                    sc.skip("\n");

                    System.out.println("Digite o ISBN do Livro: ");
                    vetLivros[posicao].setIsbn(sc.nextLine());

                    System.out.println("Alterado com sucesso!");
                } else if (resposta == 2) {
                    System.out.println("Cancelado!");
                } else {
                    System.out.println("A alteração deu erro!");
                }
            } else {
                System.out.println("Não há dados nessa posição!");
            }
        } else {
            System.out.println("ERRO!!");
            System.out.println("Memória vazia");
        }
    }

    public void consultar() {

        if (contador > 0 || vetLivros[contador] != null) {
            System.out.println("-+=============================================+-");
            System.out.println("CONSULTA");
            System.out.println("Digite a posição desejada:");
            int posicao = sc.nextInt();

            if (vetLivros[posicao] != null) {
                System.out.println("-=[DADOS DO LIVRO]=-");
                dadosLivro(vetLivros[posicao]);
            } else {
                System.out.println("Não há dados nessa posição!");
            }
        } else {
            System.out.println("ERRO!!");
            System.out.println("Memória vazia");
        }
    }

    public void relatorio() {
        if (contador > 0 || vetLivros[contador] != null) {
            System.out.println("-+=============================================+-");
            System.out.println("RELATÓRIO");

            for (int i = 0; i < vetLivros.length; i++) {
                if (vetLivros[i] != null) {
                    dadosLivro(vetLivros[i]);
                    System.out.println("-+=================================+-");
                }
            }
        } else {
            System.out.println("ERRO!!");
            System.out.println("Memória vazia");
        }
    }

    public void dadosLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Ano Publicação: " + livro.getAnoPublicacao());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("ISBN: " + livro.getIsbn());
    }
}
