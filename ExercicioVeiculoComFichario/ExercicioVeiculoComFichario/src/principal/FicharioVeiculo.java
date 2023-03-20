package principal;

import java.util.Scanner;

public class FicharioVeiculo {

    private Veiculo veiculos[];
    private Scanner sc;
    private int cont;
    private int pos;

    public FicharioVeiculo(Veiculo[] veiculos) {
        super();
        this.veiculos = veiculos;
        sc = new Scanner(System.in);
    }

    public void inserir() {
        int anoF, anoM;
        String marca, mod;

        cont = 0;
        // Percorre o vetor até achar uma posição vazia.
        while ((cont < veiculos.length) && (veiculos[cont] != null))
            cont++;

        if (cont < veiculos.length) {
            System.out.println("-=[Inserção]=-");
            System.out.println("-[Digite os dados]-");
            System.out.println("Marca: ");
            marca = sc.next();
            System.out.println("Modelo: ");
            mod = sc.next();
            System.out.println("Ano Fabricação: ");
            anoF = sc.nextInt();
            System.out.println("Ano Modelo: ");
            anoM = sc.nextInt();

            veiculos[cont] = new Veiculo(marca, mod, anoF, anoM);

            System.out.println("Veículo cadastrado com successo.");
        } else {
            System.out.println("Memória cheia!");
        }
    }

    public void alterar() {
        if (cont > 0) {
            System.out.println("-=[Alterção]=-");
            System.out.println("Qual posição deseja alterar?");
            pos = sc.nextInt();

            if (veiculos[pos] != null) {
                System.out.println("-[Dados do Veículo]-");
                mostrar(veiculos[pos]);

                System.out.println("-[Digite os novos dados]-");
                System.out.println("Marca: ");
                veiculos[pos].setMarca(sc.next());
                System.out.println("Modelo: ");
                veiculos[pos].setModelo(sc.next());
                System.out.println("Ano Fabricação: ");
                veiculos[pos].setAnoFabricacao(sc.nextInt());
                System.out.println("Ano Modelo: ");
                veiculos[pos].setAnoModelo(sc.nextInt());

                System.out.println("Veículo alterado com sucesso!");
            } else {
                System.out.println("Não existe veículo cadastrado nesta posição.");
            }
        } else {
            System.out.println("Memória vazia!");
        }
    }

    public void excluir() {
        int resp;

        if (cont > 0) {
            System.out.println("-=[Exclusão]=-");
            System.out.println("Qual posição deseja excluir?");
            pos = sc.nextInt();

            if (veiculos[pos] != null) {
                System.out.println("-[Dados do Veículo]-");
                mostrar(veiculos[pos]);
                System.out.println("Confirma exclusão? (1-sim/2-não)");
                resp = sc.nextInt();

                if (resp == 1) {
                    veiculos[pos] = null;
                    System.out.println("Veículo excluído com sucesso.");
                } else {
                    System.out.println("Veículo não excluído!");
                }
                ;
            } else {
                System.out.println("Não existe veículo cadastrado nesta posição.");
            }
        } else {
            System.out.println("Memória vazia!");
        }
    }

    public void consultar() {
        if (cont > 0) {
            System.out.println("-=[Consulta]=-");
            System.out.println("Qual posição deseja consultar?");
            pos = sc.nextInt();

            if (veiculos[pos] != null) {
                System.out.println("-[Dados do Veículo]-");
                mostrar(veiculos[pos]);
                ;
            } else {
                System.out.println("Não existe veículo cadastrado nesta posição.");
            }
        } else {
            System.out.println("Memória vazia!");
        }
    }

    public void relatorio() {
        if (cont > 0) {
            System.out.println("-=[Relatório]=-");

            for (int i = 0; i < veiculos.length; i++) {
                if (veiculos[i] != null) {
                    mostrar(veiculos[i]);
                    System.out.println("\n-x-x-x-x-\n");
                }
            }
        } else {
            System.out.println("Memória vazia!");
        }
    }

    private void mostrar(Veiculo v) {
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Ano Fabricação: " + v.getAnoFabricacao());
        System.out.println("Ano Modelo: " + v.getAnoModelo());
    }
}
