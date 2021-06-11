package app;

public interface CartaoPagamento {
    public boolean pagar(double valor);
    public void creditar(double valor);
    
}
