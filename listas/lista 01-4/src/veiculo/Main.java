package veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TAM = 2;
        Scanner sc = new Scanner(System.in);

        Veiculo[][] veiculos = new Veiculo[TAM][TAM];

        System.out.println("CADASTRO DE VEICULOS");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.println("Digite a marca do veiculo:");
                String marca = sc.nextLine();
                System.out.println("Digite o modelo do veiculo:");
                String modelo = sc.nextLine();
                System.out.println("Digite o ano de fabricacao do veiculo:");
                int anoFabricacao = sc.nextInt();
                sc.skip("\n");
                veiculos[i][j] = new Veiculo(marca, modelo, anoFabricacao);
            }
        }

        System.out.println("\nVeiculos em ordem inversa:");
        for (int i = TAM - 1; i >= 0; i--) {
            for (int j = TAM - 1; j >= 0; j--) {
                System.out.println(veiculos[i][j].getMarca() + "\n" + veiculos[i][j].getModelo() + "\n" + veiculos[i][j].getAnoFabricacao());
            }
        }
        sc.close();
    }
}