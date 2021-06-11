package app.Test;

import java.time.LocalDate;

import app.DocumentID;
import app.EpassFuncionario;
import app.TipoDocumento;

public class test_EpassFuncionario {
    public static void main(String[] args){


        LocalDate hj = LocalDate.now();
        LocalDate ter = LocalDate.parse("2021-07-01");

        TipoDocumento tipo =  TipoDocumento.BI;
        DocumentID DocumentID = new DocumentID("123",tipo); 

        EpassFuncionario dora = new EpassFuncionario(10, hj, "100", DocumentID, "Doralina Jesus", ter, "@");
        dora.pagarViagem();

    }
    
}
