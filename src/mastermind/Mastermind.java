package mastermind;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mastermind extends javax.swing.JFrame implements ActionListener{
    private Player player;
    private IA ia;
    private int nivel, max_num;
    
    private String textoJ1 = "Pulsa los botones para elegir un código.";
    private String[][] pista = new String[2][2];
    private ArrayList<String> codigo = new ArrayList<>(); 
    private int num_colores;
    
    public Mastermind() {
        initComponents();
        
        initInstructions();
        
        this.initNivel();
        this.initPlayers();
                
        this.activateBtnListener();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPlayer = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIA = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        btnRojo = new javax.swing.JButton();
        btnLila = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnNegro = new javax.swing.JButton();
        btnBlanco = new javax.swing.JButton();
        btnMarron = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPistas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Jugador 1");

        txtPlayer.setEditable(false);
        jScrollPane2.setViewportView(txtPlayer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel1.setText("IA");

        txtIA.setEditable(false);
        jScrollPane1.setViewportView(txtIA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnRojo.setForeground(new java.awt.Color(213, 0, 0));
        btnRojo.setText("Rojo");

        btnLila.setForeground(new java.awt.Color(186, 104, 200));
        btnLila.setText("Lila");

        btnAzul.setForeground(new java.awt.Color(41, 182, 246));
        btnAzul.setText("Azul");

        btnVerde.setForeground(new java.awt.Color(102, 187, 106));
        btnVerde.setText("Verde");

        btnNegro.setForeground(new java.awt.Color(42, 42, 42));
        btnNegro.setText("Negro");

        btnBlanco.setForeground(new java.awt.Color(162, 162, 162));
        btnBlanco.setText("Blanco");

        btnMarron.setForeground(new java.awt.Color(121, 85, 72));
        btnMarron.setText("Marrón");

        btnEnviar.setBackground(new java.awt.Color(100, 181, 246));
        btnEnviar.setText("ENVIAR");

        btnLimpiar.setBackground(new java.awt.Color(229, 115, 115));
        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRojo)
                .addGap(18, 18, 18)
                .addComponent(btnLila)
                .addGap(18, 18, 18)
                .addComponent(btnAzul)
                .addGap(18, 18, 18)
                .addComponent(btnVerde)
                .addGap(18, 18, 18)
                .addComponent(btnNegro)
                .addGap(18, 18, 18)
                .addComponent(btnBlanco)
                .addGap(18, 18, 18)
                .addComponent(btnMarron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(12, 12, 12)
                .addComponent(btnLimpiar))
        );

        txtPistas.setEditable(false);
        txtPistas.setColumns(20);
        txtPistas.setRows(5);
        jScrollPane3.setViewportView(txtPistas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mastermind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnBlanco;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLila;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMarron;
    private javax.swing.JButton btnNegro;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane txtIA;
    private javax.swing.JTextArea txtPistas;
    private javax.swing.JTextPane txtPlayer;
    // End of variables declaration//GEN-END:variables
    
    private void initInstructions() {
        JOptionPane.showMessageDialog(this, """
            Este juego consiste en acertar un código de colores que se genera de forma automática.
            
            Los colores a elegir serán: 
                "Rojo", "Lila", "Azul", "Verde", "Negro", "Blanco", "Marrón"
            (Para seleccionar un color clica el botón correspondiente.)
                                            
            Al enviar un código de colores, aparecerán ciertos tokens blancos y negros:
                Negros: El color está dentro del código de colores, pero no está en el orden correcto.
                Blancos: El color está dentro del código de colores y está en el orden correcto.
            
            Para ganar hace falta tener un código de colores con 4 tokens blancos.""");
    }
    
    private void initNivel(){
        this.nivel = JOptionPane.showOptionDialog(this,"""
            Seleccione el nivel:
            Nivel 1: Código de 3 colores sin repetición.
            Nivel 2: Código de 4 colores sin repetición.
            Nivel 3: Código de 4 colores con posibilidad de repetición.
            """,
            "Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Nivel 1", "Nivel 2", "Nivel 3" },
            "Nivel 2");
        
        if (this.nivel == -1){
            JOptionPane.showMessageDialog(this, "Es necesario que seleccione un nivel.");
            return;
        }        
    }
    
    private void initPlayers() {
        if(this.nivel == 0){
            max_num = 3;
        }else{
            max_num = 4;
        }
        
        this.ia = new IA(max_num, this.nivel);
        String str = "";
        for(int i = 0; i<max_num; i++){str+="XXXXX - ";}
        txtIA.setText(str.substring(0,str.length()-3));
 
        this.player = new Player(max_num);
        txtPlayer.setText(textoJ1);
    }
  
    private void activateBtnListener() {
        btnRojo.addActionListener(this);
        btnLila.addActionListener(this);
        btnAzul.addActionListener(this);
        btnVerde.addActionListener(this);
        btnNegro.addActionListener(this);
        btnBlanco.addActionListener(this);
        btnMarron.addActionListener(this);
        
        btnEnviar.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }
        
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();
        String s = "";
        if (fuente == btnEnviar) {
            if(this.num_colores < max_num){
                JOptionPane.showMessageDialog(this, "Necesita tener como mínimo " + max_num + " colores.");
                return;
            }else{
                enviar();
                System.out.println(textoJ1);
            }
            System.out.println("Se pulsó enviar...");
        }
        else if(fuente == btnLimpiar){  s = "";}
        
        else if(fuente == btnRojo){     s = "Rojo";}
        else if(fuente == btnLila){     s = "Lila";}
        else if(fuente == btnAzul){     s = "Azul";}
        else if(fuente == btnVerde){    s = "Verde";}
        else if(fuente == btnBlanco){   s = "Blanco";}
        else if(fuente == btnNegro){    s = "Negro";}
        else if(fuente == btnMarron){   s = "Marrón";}
        
        if(!"".equals(s)){
            this.add_color(s);
            textoJ1 = "";
            for(int i = 0; i<codigo.size(); i++){
                textoJ1 += codigo.get(i) + " - ";
            }
            txtPlayer.setText(textoJ1.substring(0, textoJ1.length()-3));
        }else{
            limpiar_txtJugador();
        }
    }
    
    private void limpiar_txtJugador(){
        this.num_colores = 0;
        this.codigo.clear();
        txtPlayer.setText("");
    }

    private boolean add_color(String color){
        if(this.num_colores >= max_num){
            JOptionPane.showMessageDialog(this, """
                Ya tiene el número máximo de colores.
                Si quiere probar suerte pulse "ENVIAR". 
                Si quiere probar otra combinación pulse "Limpiar".""");
            return false;
        }else{
            this.codigo.add(color);
            this.num_colores++;
            return true;
        }
    }

    private void enviar() {
       this.pista = this.ia.Code_Assert(codigo);
       
       this.player.add(pista, codigo);
     
       txtPistas.append(player.toString());
       limpiar_txtJugador();
       
       if(this.pista[1][0].equals(max_num+"")){
            txtIA.setText(textoJ1.substring(0, textoJ1.length()-3));
            System.out.println("Ganó la partida...");
            int confirma = JOptionPane.showConfirmDialog(this, "¡¡¡GANASTE!!!\n¿Quieres jugar otra partida?");
            if(JOptionPane.OK_OPTION == confirma){
                restart();
            }else{
                JOptionPane.showMessageDialog(this, "¡¡¡Muchas gracias por jugar!!!\n\n:)");
                this.setVisible(false);
                this.dispose();
            }
        }
    }

    private void restart() {
        txtPistas.setText("");
        initNivel();
        initPlayers();
    }
}
