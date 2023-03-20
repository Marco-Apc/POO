package concessionaria;

/**
 *
 * @author Edwar Saliba Júnior
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private String chassi;
    private String cor;
    private int anoModelo;
    private int anoFabricacao;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String chassi, String cor, 
            int anoModelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
