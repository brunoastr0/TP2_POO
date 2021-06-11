package app;

import java.time.LocalDate;

public abstract class PassStandard extends Epass{
    private Titular titular;
    private int pontos = 0;
    private int numeroViagens = 0;
    private String chaveValida;
    


    
   
    
  
    public PassStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,PassStandard pass ) {
        super(saldo, precoViagem, dataCarrega, dataValida);
         /**chavevalida */

         

        

    }
    public PassStandard(double saldo, LocalDate dataCarrega,String codigoDoc, DocumentID docID, String nome, LocalDate ddn, String email) {
        super(saldo, dataCarrega);

        /**chavevalida */

        this.titular = new Titular(codigoDoc,docID,nome,ddn,email);
        StringBuilder input = new StringBuilder();
        StringBuilder input2 = new StringBuilder();

        StringBuilder  fiveFirstLetters = input2.append(this.getTitular().getNome().substring(0,5)).reverse();
        String fiveLastLetters = input.append(this.getTitular().getNome()).reverse().substring(0,5);

        String date = (this.getTitular().getDdn()).toString();

        String chaveValida = fiveFirstLetters+""+fiveLastLetters+""+date+""+this.getCodigo();

        this.setChaveValida(chaveValida.toUpperCase());

        this.setDataValida(dataCarrega.plusDays(30));


        /**Viagens */
        



    }
    
    
   
  
    public PassStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, DocumentID docID, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.titular = new Titular(docID,nome,ddn,morada,email,telemovel);


         /**chavevalida */

         this.titular = new Titular(docID,nome,ddn,email);
         StringBuilder input = new StringBuilder();
         StringBuilder input2 = new StringBuilder();
 
         StringBuilder  fiveFirstLetters = input2.append(this.getTitular().getNome().substring(0,5)).reverse();
         String fiveLastLetters = input.append(this.getTitular().getNome()).reverse().substring(0,5);
 
         String date = (this.getTitular().getDdn()).toString();
 
         String chaveValida = fiveFirstLetters+""+fiveLastLetters+""+date+""+this.getCodigo();
 
         this.setChaveValida(chaveValida.toUpperCase());
 
         this.setDataValida(dataCarrega.plusDays(30));

    }
    public Titular getTitular() {
        return titular;
    }
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNumeroViagens() {
        return numeroViagens;
    }
    
    public void setNumeroViagens(int numeroViagens) {
        this.numeroViagens = numeroViagens;
    }

    public String getChaveValida() {
        return this.chaveValida;
    }
    public void setChaveValida(String chaveValida) {
        
        this.chaveValida = chaveValida;
    }

    public void pagarViagemComPontos(int pontos){
        this.setPontos(this.getPontos()-pontos);
       
    }


    
}