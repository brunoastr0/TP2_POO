package app;

import java.time.LocalDate;

public class EpassJovem extends PassStandard implements TituloTransporte{

 

    public EpassJovem(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, DocumentID docID,
            String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(saldo, precoViagem, dataCarrega, dataValida, docID, nome, ddn, morada, email, telemovel);
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
