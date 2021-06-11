package app;

import java.time.LocalDate;

public abstract class PassSazonal extends Epass{
   
    
    public PassSazonal(double saldo, LocalDate dataCarrega) {
        super(saldo, dataCarrega);
        this.chaveValida = this.getEmissao()+""+this.getCodigo();
        this.setChaveValida(chaveValida);
    }

    private String chaveValida;

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }
    
}
