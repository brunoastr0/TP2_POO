package app.Test;

import java.time.LocalDate;

import app.DocumentID;
import app.EpassFuncionario;
import app.EpassJovem;
import app.EpassStudent;
import app.TipoDocumento;
import app.Titular;

public class test_passStudent {

    public static void main(String[] args){
        LocalDate hj =  LocalDate.parse("2021-03-21");
        LocalDate ter = LocalDate.parse("2021-07-01");
        TipoDocumento tipo =  TipoDocumento.BI;
        DocumentID DocumentID = new DocumentID("123",tipo); 
        LocalDate ddn = LocalDate.now();

      
        Titular bru = new Titular(DocumentID,"Kenny Afonso",ddn,"Cruz","@",9780342);
        EpassStudent bruno = new EpassStudent(0, hj, "123", DocumentID, "Bruno Angelo", ter, "@",2,"uta");
        Titular bru1 = new Titular(DocumentID,"Ruebn Ferreiro",ddn,"Cruz","@",9780342);
        EpassStudent ka = new EpassStudent(10, hj, "123", DocumentID, "Bruno Angelo", ter, "@",2,"uta");


       /*for(int i = 0; i<6000;i++){
        bruno.pagarViagem(20);

       }
               bruno.pagarViagem(20);

        System.out.println(bruno.getPontos());   */
       // bruno.pagarViagem();
      



        
        

        
       


       
    
    }
    
}
