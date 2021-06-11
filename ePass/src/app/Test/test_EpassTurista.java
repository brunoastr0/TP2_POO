package app.Test;

import java.time.LocalDate;

import app.DocumentID;
import app.Duracao;
import app.EpassTurista;
import app.TipoDocumento;

public class test_EpassTurista {

    public static void main(String[] args){
        LocalDate hj =  LocalDate.parse("2021-03-21");
        LocalDate ter = LocalDate.parse("2021-07-01");
        TipoDocumento tipo =  TipoDocumento.BI;
        DocumentID DocumentID = new DocumentID("123",tipo); 
        LocalDate ddn = LocalDate.now();
        Duracao duracao =  Duracao.UM;

        EpassTurista bruno = new EpassTurista(150,hj,duracao);

       System.out.println(bruno.getSaldo());
       

        
    }
    
}
