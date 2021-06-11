package app.Test;

import java.time.LocalDate;

import app.DocumentID;
import app.EpassJovem;
import app.TipoDocumento;

public class test_EpassJovem {

    public static void main(String[] args){
        LocalDate hj =  LocalDate.parse("2021-03-21");
        LocalDate ter = LocalDate.parse("2021-07-01");
        TipoDocumento tipo =  TipoDocumento.BI;
        DocumentID DocumentID = new DocumentID("123",tipo); 
        LocalDate ddn = LocalDate.now();

      
        EpassJovem bruno = new EpassJovem(0, ddn, "123", DocumentID, "Bruno Angelo", ter, "@");
        

       /*for(int i = 0; i<6000;i++){
        bruno.pagarViagem(20);

       }
               bruno.pagarViagem(20);

        System.out.println(bruno.getPontos());   */
       // bruno.pagarViagem();
      System.out.println();
      bruno.pagarViagem();
       
    
    }
    
}
