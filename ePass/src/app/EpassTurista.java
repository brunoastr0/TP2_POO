package app;

import java.time.LocalDate;

public class EpassTurista extends PassSazonal implements TituloTransporte{
    private Duracao duracao;

    public EpassTurista(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            Duracao duracao) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.duracao = duracao;
    }

    public EpassTurista(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, EpassTurista outro) {
        super(saldo, precoViagem, dataCarrega, dataValida);
    }

    public Duracao getDuracao() {
        return duracao;
    }

    @Override
    public void carregar(double epass) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pagarViagem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean checkValidade() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <PassStandard> boolean passarSaldo(PassStandard epass, double saldo) {
        // TODO Auto-generated method stub
        return false;
    }

   

    

  
    
}
