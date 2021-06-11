package app;

public class DocumentID{
    private String codigoID;
    private TipoDocumento tipo;


    
    public DocumentID(String codigoID, TipoDocumento tipo) {
        this.codigoID = codigoID;
        this.tipo = tipo;
    }

    public String getCodigoID() {
        return codigoID;
    }
   
    public TipoDocumento getTipo() {
        return tipo;
    }

}