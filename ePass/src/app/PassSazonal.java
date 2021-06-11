package app;

import java.time.LocalDate;

public abstract class PassSazonal extends Epass{
    public PassSazonal(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        //TODO Auto-generated constructor stub
    }

    private String chaveValida;

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }
    
}
