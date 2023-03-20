package concessionaria;

import java.util.Scanner;

/**
 *
 * @author Edwar Saliba Júnior
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo carros[];
        carros = new Veiculo[100];
        
        Scanner ent = new Scanner(System.in);
        
        String marca, mod, chassi, cor;
        int anoMod, anoFab, cont = 0, pos, resp;
        
        int op;
        
        do{
            System.out.println("--==[Escolha uma Opção]==--");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Consultar");
            System.out.println("5 - Relatório");
            System.out.println("6 - Sair");
            System.out.println("Opção: ");
            op = ent.nextInt();
            ent.skip("\n");
            
            switch(op){
                case 1:
                    System.out.println("--==[Cadastrar]==--");
                    System.out.println("Digite os dados: ");
                    System.out.println("Marca: ");
                    marca = ent.next();
                    System.out.println("Modelo: ");
                    mod = ent.next();
                    System.out.println("Chassi: ");
                    chassi = ent.next();
                    System.out.println("Cor: ");
                    cor = ent.next();
                    System.out.println("Ano Modelo: ");
                    anoMod = ent.nextInt();
                    System.out.println("Ano Fabricação: ");
                    anoFab = ent.nextInt();
                    ent.skip("\n");
                    
                    Veiculo carro;
                    carro = new Veiculo(marca, mod, chassi, cor, anoMod, anoFab);
                
                    carros[cont] = carro;
                    cont++;
                    break;
                case 2:
                    System.out.println("--==[Alterar]==--");
                    System.out.println("Qual a posição do vetor você deseja alterar?");
                    pos = ent.nextInt();
                    
                    // Testa se existe um carro na posição escolhida pelo usuário.
                    if(carros[pos] != null){

                        System.out.println("Marca atual: " + carros[pos].getMarca());
                        System.out.println("Digite a nova marca: ");
                        marca = ent.next();
                        carros[pos].setMarca(marca);
                        
                        System.out.println("Modelo atual: " + carros[pos].getModelo());
                        System.out.println("Digite o novo modelo: ");
                        mod = ent.next();
                        carros[pos].setModelo(mod);
                        
                        System.out.println("Chassi atual: " + carros[pos].getChassi());
                        System.out.println("Digite o novo chassi: ");
                        chassi = ent.next();
                        carros[pos].setChassi(chassi);
                        
                        System.out.println("Cor atual: " + carros[pos].getCor());
                        System.out.println("Digite a nova cor: ");
                        cor = ent.next();
                        carros[pos].setCor(cor);
                        
                        System.out.println("Ano Modelo atual: " + carros[pos].getAnoModelo());
                        System.out.println("Digite o novo ano modelo: ");
                        anoMod = ent.nextInt();
                        carros[pos].setAnoModelo(anoMod);
                        
                        System.out.println("Ano Fabricação atual: " + carros[pos].getAnoFabricacao());
                        System.out.println("Digite o novo ano fabricação: ");
                        anoFab = ent.nextInt();
                        carros[pos].setAnoFabricacao(anoFab);
                    }
                    else{
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 3:
                    System.out.println("--==[Excluir]==--");
                    System.out.println("Qual a posição do vetor você deseja excluir?");
                    pos = ent.nextInt();
                    
                    // Testa se existe um carro na posição escolhida pelo usuário.
                    if(carros[pos] != null){
                        imprimir(carros[pos]);
                        System.out.println("Confirma exclusão? (1-sim/2-não)");
                        resp = ent.nextInt();
                        
                        if(resp == 1){
                            carros[pos] = null;
                            System.out.println("Exclusão efetuada com sucesso.");
                        }
                        else{
                            System.out.println("Exclusão não efetuada.");
                        }
                    }
                    else{
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 4:
                    System.out.println("--==[Consultar]==--");
                    System.out.println("Qual a posição do vetor você deseja consultar?");
                    pos = ent.nextInt();
                    
                    // Testa se existe um carro na posição escolhida pelo usuário.
                    if(carros[pos] != null){
                        imprimir(carros[pos]);
                    }
                    else{
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 5:
                    System.out.println("--==[Relatório]==--");
                    for(int j = 0; j < carros.length; j++){
                        if(carros[j] != null){
                            imprimir(carros[j]);
                            System.out.println("---------------------");
                        }
                    }
                    break;
                default:
                    if(op != 6){
                        System.out.println("Opção inválida.");
                    }
            }
        }while(op != 6);
    }
        
    public static void imprimir(Veiculo v){
        System.out.println("Marca         : " + v.getMarca());
        System.out.println("Modelo        : " + v.getModelo());
        System.out.println("Chassi        : " + v.getChassi());
        System.out.println("Cor           : " + v.getCor());
        System.out.println("Ano Modelo    : " + v.getAnoModelo());
        System.out.println("Ano Fabricação: " + v.getAnoFabricacao());
    }
}
