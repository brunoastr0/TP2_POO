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
    public void carregar(double saldo) {
        this.setSaldo(this.getSaldo() + saldo);
        this.setDataCarrega(LocalDate.now());
        this.setDataValida(LocalDate.now().plusDays(30));

    }

   
    @Override
    public void pagarViagem() {
        try {

           
            int valor = 40;
            if(this.checkValidade()){
            if (this.getSaldo() < valor) {
                if (!this.pagarViagemComPontos(40)) {
                    throw new Exception("Sem saldo, sem pontos");
                    
                }
            }
            this.setSaldo(this.getSaldo() - valor);
            this.setNumeroViagens(this.getNumeroViagens() + 1);
            if (this.getNumeroViagens() % 10 == 0) {
                this.setPontos(this.getPontos() + 1);
            }

        }throw new Exception("Sem validade");
    } catch (Exception error) {
            System.err.println(error);
        }

        return;

    }


    @Override
    public boolean checkValidade() {
        LocalDate dateHJ = LocalDate.now();
        if (this.getDataValida().isAfter(dateHJ))
            return true;
        return false;
    }

    @Override
    public boolean passarSaldo(PassStandard epass, double saldo) {
        if (this.getSaldo() >= saldo) {
            ((Epass) epass).setSaldo(((Epass) epass).getSaldo()+saldo);
            this.setSaldo(this.getSaldo() - saldo);
            return true;
        }

        return false;
    }
    
}
