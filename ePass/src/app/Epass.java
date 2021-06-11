package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Epass {
    private final long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDate dataCarrega;
    private LocalDate dataValida;
    private static long ultCodigo;
    private final LocalDateTime emissao;



    static{
        if(Long.valueOf(ultCodigo) == null){
            ultCodigo = 0;
        }
    }

   
   


    public Epass(double saldo, LocalDate dataCarrega) {
        this.saldo = saldo;
        this.dataCarrega = dataCarrega;
        this.codigo = ultCodigo +1;
        ultCodigo++;
        this.emissao = LocalDateTime.now();

    }
    public Epass(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataCarrega = dataCarrega;
        this.dataValida = dataValida;
        this.codigo = ultCodigo +1;
        ultCodigo++;
        this.emissao = LocalDateTime.now();
        }
    public Epass(double saldo, double precoViagem) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.codigo = ultCodigo +1;
        ultCodigo++;
        this.emissao = LocalDateTime.now();

        
    }

    

    
    public Epass(double precoViagem) {
        this.precoViagem = precoViagem;
        this.codigo = ultCodigo +1;
        ultCodigo++;
        this.emissao = LocalDateTime.now();

    }
    public LocalDateTime getEmissao() {
        return emissao;
    }
    public long getCodigo() {
        return codigo;
    }
   
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getPrecoViagem() {
        return this.precoViagem;
    }
    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }
    public LocalDate getDataCarrega() {
        return dataCarrega;
    }
    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }
    public LocalDate getDataValida() {
        return dataValida;
    }
    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Epass other = (Epass) obj;
        if (codigo != other.codigo)
            return false;
        if (dataCarrega == null) {
            if (other.dataCarrega != null)
                return false;
        } else if (!dataCarrega.equals(other.dataCarrega))
            return false;
        if (dataValida == null) {
            if (other.dataValida != null)
                return false;
        } else if (!dataValida.equals(other.dataValida))
            return false;
        if (Double.doubleToLongBits(precoViagem) != Double.doubleToLongBits(other.precoViagem))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Epass [codigo=" + codigo + ", dataCarrega=" + dataCarrega + ", dataValida=" + dataValida
                + ", precoViagem=" + precoViagem + ", saldo=" + saldo + "]";
    }

    
}
