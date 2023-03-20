package principal;

public class Veiculo {
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	
	public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
	}

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
}
