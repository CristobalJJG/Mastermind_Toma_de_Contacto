package mastermind;

import java.util.Random;
import java.util.ArrayList;

public class IA {
    private ArrayList codigo;
    private static String[] colores = {"Rojo", "Lila", "Azul", "Verde", "Negro", "Blanco", "Marrón"};
    
    public IA(int n, int nivel){
        this.codigo = new ArrayList<String>();
        if(nivel == 0 || nivel == 1){
            set_IA_easy(codigo, n);
        }else{
            set_IA_hard(codigo, n);
        }
        
    }
    
    private static void set_IA_easy(ArrayList<String> codigo, int n){
        int random;
        String color;   
        while(codigo.size() < n){
            random = new Random().nextInt(colores.length);
            color = colores[random];
            if(!codigo.contains(color) || codigo.isEmpty()){
                codigo.add(color);
            }
        }  
        
        System.out.println(codigo.toString());
    }
    
    private static void set_IA_hard(ArrayList<String> codigo, int n){
        while(codigo.size() < n){
            int random = new Random().nextInt(colores.length);
            codigo.add(colores[random]);
            
        }  
        
        System.out.println(codigo.toString());
    }
    
    
    public String[][] Code_Assert(ArrayList<String> cifra){
        String[][] res = new String[2][2];
        
        int blanco = 0; 
        for(int i = 0; i < codigo.size(); i++){
            if(codigo.get(i).equals(cifra.get(i))){
                blanco++;
            }
        }
        System.out.println("Blanco: " + blanco);
        
        int negro = 0;
        for(int i = 0; i < codigo.size(); i++){
            for(int j = 0; j < codigo.size(); j++){
                if(i == j){skip();}
                else if(codigo.get(i).equals(cifra.get(j))){
                    negro++;
                }
            }
        }
        System.out.println("Negro: " + negro);
        
        res [0][1] = "Negro" ; res [1][1] = "Blanco";
        res [0][0] = negro+""; res [1][0] = blanco+"";
        return res;
    }
    
    public void reinicia_IA(){
        this.codigo.clear();
    }
    
    private void skip(){}
}


