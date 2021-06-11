package app;

import java.time.LocalDate;

public class EpassJovem extends PassStandard implements TituloTransporte{

 


    public EpassJovem(double saldo, LocalDate dataCarrega, String codigoDoc, DocumentID docID, String nome,
            LocalDate ddn, String email) {
        super(saldo, dataCarrega, codigoDoc, docID, nome, ddn, email);
        
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
    public  boolean passarSaldo(PassStandard epass, double saldo) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
