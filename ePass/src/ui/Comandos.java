package ui;
import java.util.ArrayList;

public class Comandos {
    private ArrayList<Comando> lista;

    public Comandos(){
        lista = new ArrayList<>();
    }

    public Comandos(Comando[] lis){
        lista = new ArrayList<>();
        for (int i = 0; i < lis.length; i++) {
            lista.add(lis[i]);
        }
    }

    public void adicionar(Comando e){
        this.lista.add(e);
    }

    public  ArrayList<Comando> getLista(){
        return lista;
    }

    public String showHelp(){
        StringBuilder ajuda = new StringBuilder();
        for (Comando cm : lista)
            ajuda.append(cm.getNome()+ ' ' +cm.getDescricao() + "\n");
        return ajuda.toString();
    }

    public String showHelp(String[] comando){
        StringBuilder ajuda = new StringBuilder();
        String[] auxOps = comando[1].split("=");
        for(Comando cm : lista){
            if(cm.getNome().equalsIgnoreCase(auxOps[1])){
                if(cm.getNumOp()>0)
                    ajuda.append(cm.getNome() + ' ' + cm.getDescricao() + cm.getOption().toString() + "\n");
                else
                    ajuda.append(cm.getNome() + ' ' + cm.getDescricao() + "\n");
                break;
            }
        }
        return ajuda.toString();
    }
}
