package app;

import java.time.LocalDate;
import java.util.ArrayList;

public class EpassStudent extends PassStandard implements TituloTransporte {
    private int ano;
    private String escola;
    private ArrayList<Zona> zonas;
    private int viagensfree;
   


    public int getViagensfree() {
        return viagensfree;
    }

    public void setViagensfree(int viagensfree) {
        this.viagensfree = viagensfree;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void addZona(Zona zonasViagem) {
        zonas.add(zonasViagem);
    }

    public void addZona(String nome) {
        Zona zona = new Zona(nome);
        zonas.add(zona);
    }

    /**
     * 
     * @param saldo
     * @param precoViagem
     * @param dataCarrega
     * @param dataValida
     * @param titular
     * @param ano
     * @param escola
     */

    public EpassStudent(double saldo, LocalDate dataCarrega, String codigoDoc, DocumentID docID, String nome,
            LocalDate ddn, String email, int ano, String escola) {
        super(saldo, dataCarrega, codigoDoc, docID, nome, ddn, email);
        this.ano = ano;
        this.escola = escola;
        this.setPrecoViagem(20);
        this.setViagensfree(4);
    }

    public EpassStudent(double saldo, LocalDate dataCarrega, String codigoDoc, DocumentID docID, String nome,
            LocalDate ddn, String email, EpassStudent outro) {
        super(saldo, dataCarrega, codigoDoc, docID, nome, ddn, email);
        this.setViagensfree(4);

    }

    @Override
    public void carregar(double saldo) {
        this.setSaldo(this.getSaldo() + saldo);
        this.setDataCarrega(LocalDate.now());
        this.setDataValida(LocalDate.now().plusDays(30));
        this.setViagensfree(4);

    }

    @Override
    public void pagarViagem() {
        try {

           
            int valor = 20;
            if(this.checkValidade()){
            if (this.getSaldo() < valor) {
                if (this.getPontos() < 100) {
                    if(this.getViagensfree() == 0)
                    throw new Exception("Sem saldo, sem pontos, sem viagens free");
                    this.setViagensfree(this.getViagensfree()-1);
                    return;
                }
                this.pagarViagemComPontos(40);
            }
            this.setSaldo(this.getSaldo() - valor);
            this.setNumeroViagens(this.getNumeroViagens() + 1);
            if (this.getNumeroViagens() % 10 == 0) {
                this.setPontos(this.getPontos() + 1);
            }

        }throw new Exception("Sem validade");
    } catch (Exception error) {
            System.err.println(error);
        }

        return;

    }

    @Override
    public boolean checkValidade() {
        LocalDate dateHJ = LocalDate.now();
        if (this.getDataValida().isAfter(dateHJ))
            return true;
        return false;
    }

    @Override
    public <PassStandard> boolean passarSaldo(PassStandard epass, double saldo) {
        if (this.getSaldo() >= saldo) {
            ((Epass) epass).setSaldo(saldo);
            this.setSaldo(this.getSaldo() - saldo);
            return true;
        }

        return false;
    }

}
