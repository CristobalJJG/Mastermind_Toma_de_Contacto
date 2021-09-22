package mastermind;

import java.util.ArrayList;

public class Player {
    ArrayList<String[][]> pistas;
    ArrayList<String> codigos;
    
    public Player(int nivel){
        pistas = new ArrayList<>();
        codigos = new ArrayList<>();
    }
    

    public boolean add(String[][] pista, ArrayList<String> codigo){
        this.codigos.clear();
        for(String cod: codigo){codigos.add(cod);}
        return (pistas.add(pista));
    }
    
    @Override
    public String toString(){
        String res = "";
        String p1="", p2="", p3="", p4="";
        for(int i = 0; i < pistas.size(); i++){
            p1 = pistas.get(i)[0][0] + " -> " + pistas.get(i)[0][1] + "\t";
            p2 = codigos + "\n";
            p3 = pistas.get(i)[1][0] + " -> " + pistas.get(i)[1][1];
            p4 = "\n\n";
        }
        return p1 + p2 + p3 + p4;
    }
    
    public void reinicia_IA(){
        this.codigos.clear();
        this.pistas.clear();
    }
}
