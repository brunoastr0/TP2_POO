package app;

import java.time.LocalDate;

public class EpassJovem extends PassStandard implements TituloTransporte{

 


    public EpassJovem(double saldo, LocalDate dataCarrega, String codigoDoc, DocumentID docID, String nome,
            LocalDate ddn, String email) {
        super(saldo, dataCarrega, codigoDoc, docID, nome, ddn, email);
        this.setPrecoViagem(40);

        
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
