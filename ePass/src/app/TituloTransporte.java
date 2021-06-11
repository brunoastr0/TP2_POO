package app;

public interface TituloTransporte {
    public void carregar(double epass);
    public void pagarViagem();
    public boolean checkValidade();
    public <PassStandard> boolean passarSaldo(PassStandard epass, double saldo);
    
}
