package lista01;

public class Cliente {
    private int codigo;
    private String nome;
    private boolean eClienteEspecial;
    private double limiteCredito;

    public Cliente(int c, String n) {
        codigo = c;
        nome = n;
        limiteCredito = 0;
        eClienteEspecial = false;
    }

    public String obterNome() {
        return nome;
    }

    public boolean atualizaLimites(double valor) {
        boolean atualizou = false;
        
        if (eClienteEspecial) {
        	limiteCredito = valor;
        	atualizou = true;
        }
        return atualizou;
    }

    public void atualizaSituacao(boolean situacao) {
    	eClienteEspecial = situacao;
    	
    	if (!eClienteEspecial) {
    		limiteCredito = 0;
    	}
    }
}
