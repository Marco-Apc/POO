package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digigte o nome e a idade de 10 pessoas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = sc.nextLine();
            
            System.out.println("Digite a idade de " + nome + ":");
            int idade = sc.nextInt();
            sc.skip("\n");
            pessoas[i] = new Pessoa(nome, idade);
        }
        
        System.out.println("Pessoas cadastradas em ordem inversa:");
        for (int i = (pessoas.length - 1); i >= 0; i--) {
            System.out.println(pessoas[i].getNome() + " - " + pessoas[i].getIdade());
        }
        sc.close();
    }
}