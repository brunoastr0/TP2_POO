package ui;


public class Comando {
    private final String nome;
    private String descricao;
    private Opcoes[] option;
    private int numOp;

    public Comando(String nome, int numOp){
        this.nome = nome;
        this.numOp = numOp;
        option = new Opcoes[numOp];
    }

    public Comando(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public Comando(String nome, String descricao, int numOp){
        this.nome = nome;
        this.descricao = descricao;
        option = new Opcoes[numOp];
    }

    public Comando(String nome, String descricao, String tituloOp, String descOp, boolean obrigatorio){
        option = new Opcoes[1];
        this.nome = nome;
        this.descricao = descricao;
        this.option[0] = new Opcoes(tituloOp,descOp,obrigatorio);
        this.numOp = 1;

    }

    public Opcoes[] getOption() {
        return option;
    }

    public void setOption(Opcoes[] option) {
        this.option = option;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumOp() {
        return numOp;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumOp(int numOp) {
        this.numOp = numOp;
    }

    public void ShowHelp(){

    }
}
