package app;

import java.time.LocalDate;

public class EpassTurista extends PassSazonal implements TituloTransporte{
    private Duracao duracao;

    public EpassTurista(double saldo, LocalDate dataCarrega,
            Duracao duracao) {
        super(saldo, dataCarrega);
        this.duracao = duracao; 
        
        switch (duracao){
            case SETE:
            this.setDataValida(this.getDataCarrega().plusDays(7));
            this.setSaldo(1500);
            break;

            case TRES:
            this.setDataValida(this.getDataCarrega().plusDays(3));
            this.setSaldo(700);
            break;

            case UM:
            this.setDataValida(this.getDataCarrega().plusDays(1));
            this.setSaldo(500);
            break;

            default:
            System.out.println("Nao foi definido");
            break;

        }
    }
    
    public EpassTurista(double saldo, LocalDate dataCarrega, EpassTurista outro) {
        super(saldo, dataCarrega);

        switch (duracao){
            case SETE:
            this.setDataValida(this.getDataCarrega().plusDays(7));
            this.setSaldo(1500);
            break;

            case TRES:
            this.setDataValida(this.getDataCarrega().plusDays(3));
            this.setSaldo(700);
            break;

            case UM:
            this.setDataValida(this.getDataCarrega().plusDays(1));
            this.setSaldo(500);
            break;

            default:
            System.out.println("Nao foi definido");
            break;

        }
    }

    public Duracao getDuracao() {
        return duracao;
    }

    @Override
    public void carregar(double epass) {
        System.err.println("Passe Turista nao carrega");
        
    }

    @Override
    public void pagarViagem() {
        try{
            int valor = 50;
            if(this.checkValidade()){
                if(this.getSaldo()<valor){
                    throw new Exception("Sem saldo");
                }
                this.setSaldo(this.getSaldo()-valor);
            }throw new Exception("Validade do cartao esgotou-se");
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
        // TODO Auto-generated method stub
        return false;
    }

   

    

  
    
}
