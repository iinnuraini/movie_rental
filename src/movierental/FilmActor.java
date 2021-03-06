/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class FilmActor extends javax.swing.JFrame {
    
    private KoneksiDB db = new KoneksiDB();

    /**
     * Creates new form FilmActor
     */
    public FilmActor() {
        initComponents();
        selectData();
        cbFilm();
        cbActor();
        setTanggal();
    }
    
    private void setTanggal() {
       java.util.Date skrg = new java.util.Date();
       java.text.SimpleDateFormat kal = new
       java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       last_update.setText(kal.format(skrg));
    }
    
    public void cbFilm(){
        String SQL = "SELECT * FROM film";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {            
            while (rs.next()) {                
                cb_film.addItem(rs.getString("ID"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }

    public void cbActor(){
        String SQL = "SELECT * FROM actor";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {            
            while (rs.next()) {                
                cb_actor.addItem(rs.getString("ID"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbFilmActor = new javax.swing.JTable();
        b_refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_film = new javax.swing.JComboBox<>();
        cb_actor = new javax.swing.JComboBox<>();
        last_update = new javax.swing.JTextField();
        b_input = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 500));
        getContentPane().setLayout(null);

        tbFilmActor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "filmID", "ActorID", "last_update"
            }
        ));
        jScrollPane1.setViewportView(tbFilmActor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 480, 130);

        b_refresh.setText("REFRESH");
        b_refresh.setToolTipText("");
        b_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_refreshMouseClicked(evt);
            }
        });
        getContentPane().add(b_refresh);
        b_refresh.setBounds(420, 140, 90, 30);

        jLabel1.setFont(new java.awt.Font("Clarendon BT", 0, 14)); // NOI18N
        jLabel1.setText("FILM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 40, 20);

        jLabel2.setFont(new java.awt.Font("Clarendon BT", 0, 14)); // NOI18N
        jLabel2.setText("LAST UPDATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 240, 106, 18);

        getContentPane().add(cb_film);
        cb_film.setBounds(180, 90, 210, 30);

        getContentPane().add(cb_actor);
        cb_actor.setBounds(180, 160, 210, 30);

        last_update.setEditable(false);
        getContentPane().add(last_update);
        last_update.setBounds(180, 230, 210, 30);

        b_input.setText("INPUT");
        b_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_inputMouseClicked(evt);
            }
        });
        getContentPane().add(b_input);
        b_input.setBounds(420, 90, 90, 30);

        jLabel4.setFont(new java.awt.Font("Clarendon Blk BT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("INPUT DATA FILM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 10, 250, 30);

        jLabel3.setFont(new java.awt.Font("Clarendon BT", 0, 14)); // NOI18N
        jLabel3.setText("ACTOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 170, 52, 18);

        jButton1.setText("DELETE");
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 190, 90, 30);

        jButton2.setText("EDIT");
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 240, 90, 30);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 30, 100, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\kuliah\\SEMESTER IV\\Business Application Development\\BG\\bg8.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 570, 60);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 580, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_refreshMouseClicked
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_b_refreshMouseClicked

    private void b_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_inputMouseClicked
        // TODO add your handling code here:
        if ("".equals(cb_film.getSelectedItem())||"".equals(cb_actor.getSelectedItem())||"".equals(last_update.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);    
        }else{
            
            String SQL = "INSERT INTO film_actor (filmID,ActorID,last_update) "
                    + "VALUES('"+cb_film.getSelectedItem()+"','"+cb_actor.getSelectedItem()+"','"+last_update.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_b_inputMouseClicked

    private void selectData() {
        String kolom[] = {"filmID","ActorID","last_update"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM film_actor";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while (rs.next()) {
                String filmID = rs.getString(1);                  
                String ActorID = rs.getString(2);
                String last_update = rs.getString(3);
                String data[] = {filmID,ActorID,last_update};
                dtm.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(Actor.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbFilmActor.setModel(dtm);
    }
    
    public JTable getTableData(){
        return tbFilmActor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilmActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmActor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_input;
    private javax.swing.JButton b_refresh;
    private javax.swing.JComboBox<String> cb_actor;
    private javax.swing.JComboBox<String> cb_film;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_update;
    private javax.swing.JTable tbFilmActor;
    // End of variables declaration//GEN-END:variables
}
