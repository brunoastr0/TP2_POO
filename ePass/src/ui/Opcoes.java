package ui;

public class Opcoes {
    private String nome;
    private String descri;
    private boolean obrigatorio;

    public Opcoes (String nome, String descri){
        this.nome = nome;
        this.descri = descri;
        this.obrigatorio = false;
    }

    public Opcoes (String nome, String descri, Boolean obrigatorio){
        this.nome = nome;
        this.descri = descri;
        this.obrigatorio =  obrigatorio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Opcoes{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", descri='").append(descri).append('\'');
        sb.append(", obrigatorio=").append(obrigatorio);
        sb.append('}');
        return sb.toString();
    }
}
