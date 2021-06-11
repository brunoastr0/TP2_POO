package app;

import java.time.LocalDate;

public class Titular {
    private DocumentID docID;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private String email;
    private int telemovel;


    
    public Titular(String codigoDoc, DocumentID docID, String nome, LocalDate ddn, String email) {
        this.docID = docID;
        this.nome = nome;
        this.ddn = ddn;
        this.email = email;
    }

    

    public Titular(DocumentID docID, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        this.docID = docID;
        this.nome = nome;
        this.ddn = ddn;
        this.morada = morada;
        this.email = email;
        this.telemovel = telemovel;
    }



    public Titular(DocumentID docID, String nome, LocalDate ddn, String email) {
        this.docID = docID;
        this.nome = nome;
        this.ddn = ddn;
        this.email = email;
    }



    public DocumentID getDocID() {
        return docID;
    }
   
    public String getNome() {
        return nome;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelemovel() {
        return telemovel;
    }
    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    
}
