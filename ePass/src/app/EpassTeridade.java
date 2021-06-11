package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EpassTeridade extends PassStandard implements TituloTransporte {

    private LocalDateTime horaIni;

    public LocalDateTime getHoraIni() {
        return horaIni;
    }

  
    public EpassTeridade(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            DocumentID docID, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(saldo, precoViagem, dataCarrega, dataValida, docID, nome, ddn, morada, email, telemovel);
    }


    public void setHoraIni(LocalDateTime horaIni) {
        this.horaIni = horaIni;
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
