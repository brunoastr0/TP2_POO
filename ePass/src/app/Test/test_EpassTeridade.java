package app.Test;

import java.time.LocalDate;

import app.DocumentID;
import app.EpassTeridade;
import app.TipoDocumento;

public class test_EpassTeridade {

    public static void main(String args[]){

        LocalDate hj =  LocalDate.parse("2021-03-21");
        LocalDate ter = LocalDate.parse("2021-07-01");
        TipoDocumento tipo =  TipoDocumento.BI;
        DocumentID DocumentID = new DocumentID("123",tipo); 
        LocalDate ddn = LocalDate.now();

        EpassTeridade bh = new EpassTeridade(0,ddn,"123",DocumentID,"Norberto Silva",ter,"@");
        

       System.out.println(bh.getChaveValida());
    }
    
}
