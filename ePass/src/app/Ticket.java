package app;

import java.time.LocalDate;

public class Ticket {
    private String nome;
    private int numero;
    private LocalDate data;

    
    public Ticket(String nome, int numero, LocalDate data) {
        this.nome = nome;
        this.numero = numero;
        this.data = data;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
