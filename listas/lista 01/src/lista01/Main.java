package lista01;

public class Main {
    public static void main(String[] args) {
        Cliente cliA, cliB;

        cliA = new Cliente(1, "Luiza");
        cliA.atualizaSituacao(true);
        cliB = new Cliente(2, "Wesley");

        if(!cliA.atualizaLimites(500)){
            System.out.println("Este não é um cliente especial");
        }

        cliB = cliA;
        cliB.atualizaSituacao(false);
        System.out.println("Testando o cliente " + cliA.obterNome());

        if(!cliA.atualizaLimites(700)){
            System.out.println("Este não é um cliente especial");
        }
    }
}