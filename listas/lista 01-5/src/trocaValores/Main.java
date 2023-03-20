package trocaValores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadorDeValores[] vet1 = new CalculadorDeValores[3];
        CalculadorDeValores[] vet2 = new CalculadorDeValores[3];
        CalculadorDeValores[] vet3 = new CalculadorDeValores[3];

        System.out.println("Preencha o primeiro vetor:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(i+1 + "º valor:");
            int valor = sc.nextInt();
            sc.nextLine();
            vet1[i] = new CalculadorDeValores(valor);
        }

        System.out.println("Preencha o segundo vetor:");
        for (int i = 0; i < vet2.length; i++) {
            System.out.println(i+1 + "º valor:");
            int valor = sc.nextInt();
            sc.nextLine();
            vet2[i] = new CalculadorDeValores(valor);
        }

        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = new CalculadorDeValores(vet1[i].getValor() * vet2[vet2.length - i - 1].getValor());
        }

        for (int i = (vet3.length - 1); i >= 0; i--) {
            System.out.println(vet3[i].getValor());
        }
        sc.close();
    }
}