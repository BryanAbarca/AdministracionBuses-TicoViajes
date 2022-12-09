/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import Controlador.flotilla;
import Modelo.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Flotillas extends javax.swing.JFrame {
    
    ArrayList<flotilla> listaFlotilla = new ArrayList();

    /**
     * Creates new form Flotillas
     */
    public Flotillas() {
        initComponents();
    }
    
    public void cargarDatos(ArrayList<flotilla> listaFlotilla){
        this.listaFlotilla = listaFlotilla;
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        placatxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        capacidadtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estadoCbx = new javax.swing.JComboBox<>();
        AgregarBtn = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar Flotillas");
        setMaximumSize(new java.awt.Dimension(545, 366));
        setMinimumSize(new java.awt.Dimension(545, 366));
        setPreferredSize(new java.awt.Dimension(545, 366));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Ingrese Número de Placa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 150, 30));
        getContentPane().add(placatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Ingrese Capacidad de Pasajeros:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        capacidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capacidadtxtKeyTyped(evt);
            }
        });
        getContentPane().add(capacidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, 30));

        estadoCbx.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        estadoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Bueno", "Mantenimiento", " " }));
        getContentPane().add(estadoCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 200, 30));

        AgregarBtn.setBackground(new java.awt.Color(0, 0, 51));
        AgregarBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AgregarBtn.setForeground(new java.awt.Color(0, 0, 255));
        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, 30));

        RegresarBtn.setBackground(new java.awt.Color(0, 51, 51));
        RegresarBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RegresarBtn.setForeground(new java.awt.Color(0, 255, 255));
        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flotilla.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 560, 290));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Ingresar Flotilla de Buses");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capacidadtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacidadtxtKeyTyped
         //validar para que solo se pueda ingresar numeros
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingresar Solo Números");
        }
    }//GEN-LAST:event_capacidadtxtKeyTyped

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
         this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
     
        Conexion msql = new Conexion();
        Connection conexion = msql.conectar();
        String sSql="";
        String placa,capacidad,estado;
        placa = placatxt.getText();
        capacidad = capacidadtxt.getText();
        estado = (String) estadoCbx.getSelectedItem();
        
        sSql ="INSERT INTO `flotilla`(`Id_flotilla`, `Placa`, `Capacidad_Pasajeros`, `Estado`) VALUES(?,?,?,?)";
        
        try{
           PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
           pst.setString(1, null);
           pst.setString(2, placa);
           pst.setString(3, capacidad);
           pst.setString(4, estado);
           
           int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null,"El registro se ha Ingresado","Base de Datos MySql",JOptionPane.INFORMATION_MESSAGE);
            }
                
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
        }
        flotilla flo = new flotilla(placa,capacidad,estado);
        listaFlotilla.add(flo);
        placatxt.setText("");
        capacidadtxt.setText("");
        placatxt.requestFocus();
        JOptionPane.showMessageDialog(null, "Registrado con exito!", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AgregarBtnActionPerformed

    
    public ArrayList<flotilla> nuevo() {
         return listaFlotilla;
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
            java.util.logging.Logger.getLogger(Flotillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flotillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flotillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flotillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flotillas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JTextField capacidadtxt;
    private javax.swing.JComboBox<String> estadoCbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField placatxt;
    // End of variables declaration//GEN-END:variables
}
