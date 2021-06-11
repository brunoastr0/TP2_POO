package app;

import java.time.LocalDate;

public class EpassFuncionario extends PassStandard implements TituloTransporte{



    

    public EpassFuncionario(double saldo, LocalDate dataCarrega, String codigoDoc, DocumentID docID, String nome,
            LocalDate ddn, String email) {
        super(saldo, dataCarrega, codigoDoc, docID, nome, ddn, email);

        this.setDataValida(this.getDataCarrega().plusDays(30));
    }

    @Override
    public void carregar(double saldo) {
        this.setDataCarrega(LocalDate.now());
        this.setDataValida(LocalDate.now().plusDays(30));
       
    }



    @Override
    public void pagarViagem() {
      try {
          if(!this.checkValidade()){
              throw new Exception("Validade excedida");
          }
      }catch(Exception error){
          System.err.println(error);
      }
        
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
            ((Epass) epass).setSaldo(saldo);
            this.setSaldo(this.getSaldo() - saldo);
            return true;
        }

        return false;
    }
    
}
