/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static Controlador.Globales.comprando;
import static Controlador.Globales.NumeroAsiento;
import static Controlador.Globales.EstadoAsiento;
import static Controlador.Globales.sumar;
import Controlador.Tiempo;
import Modelo.Conexion;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author 
 */
public class Ticket extends javax.swing.JFrame {
    
    //conexion a la base de datos
    Conexion msql = new Conexion();
    String viajes;
    Tiempo time = new Tiempo();

     //para ingresar a la base de datos
            Connection conexion = msql.conectar();
            String sSql="";
            String nSql="";
     
    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();
        MostrarTiempo();
        ObtenerId();
        msql.conectar();
        //Se crea una lista para llenar el combo box de Viajes
         ArrayList<String> lista1 = new ArrayList<String>();
         //llenar la lista ejecutando lo que hay en la base de datos
         lista1 = msql.llenar_combo_Viajes();
         //llenado de lista mediante un for 
         for (int i = 0; i < lista1.size(); i++) {
            viaje.addItem(lista1.get(i));
        }
         
         AsientosOcupados(viajes);
         precios(viajes);
         Horas(viajes);
         
         
    }//fin del método ejecutor de ticket
    
    
    public void MostrarTiempo(){
        fecha.setText(time.fechacomp);
        hora.setText(time.horacomp);
    }
    
    public void ObtenerId(){
        int id=msql.buscarId();
         sumar = id+1;
        tiquete.setText(""+sumar);
    }
    
    //verifica que Asientos estan ocupados segun la elección del Viaje
    public void AsientosOcupados(String viajes){
       //variable para capturar y cambiar lo que se recorre segun el id
        int asiento = 0;
        String estado="Ocupado"; 
      
        System.out.println(""+viajes);
       //Consulta a la base de datos
       String Sql="SELECT Numero_Asiento FROM `clientes` WHERE Viajes ='"+viajes+"'AND `Estado_Asiento`='"+estado+"'";
       try{
            PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(Sql);
            ResultSet n = pst.executeQuery(Sql);
            
            while(n.next()){
              asiento= n.getInt(1);
                System.out.println(""+asiento);
                
                     switch(asiento){
                  case 1: 
                      uno.setBackground(java.awt.Color.red);
                      uno.setEnabled(false);
                  break;
                  case 2:
                      dos.setBackground(java.awt.Color.red);
                      dos.setEnabled(false);
                  break;
                  case 3:
                      tres.setBackground(java.awt.Color.red);
                      tres.setEnabled(false);
                  break;
                  case 4:
                      cuatro.setBackground(java.awt.Color.red);
                      cuatro.setEnabled(false);
                  break;
                  case 5:
                      cinco.setBackground(java.awt.Color.red);
                      cinco.setEnabled(false);
                  break;
                  case 6:
                      seis.setBackground(java.awt.Color.red);
                      seis.setEnabled(false);
                  break;
                  case 7:
                      siete.setBackground(java.awt.Color.red);
                      siete.setEnabled(false);
                  break;
                  case 8:
                      ocho.setBackground(java.awt.Color.red);
                      ocho.setEnabled(false);
                  break;
                  case 9:
                      nueve.setBackground(java.awt.Color.red);
                      nueve.setEnabled(false);
                  break;
                  case 10:
                      diez.setBackground(java.awt.Color.red);
                      diez.setEnabled(false);
                  break;
                  case 11:
                      once.setBackground(java.awt.Color.red);
                      once.setEnabled(false);
                  break;
                  case 12:
                      doce.setBackground(java.awt.Color.red);
                      doce.setEnabled(false);
                  break;
                  case 13:
                      trece.setBackground(java.awt.Color.red);
                      trece.setEnabled(false);
                  break;
                  case 14:
                      catorce.setBackground(java.awt.Color.red);
                      catorce.setEnabled(false);
                  break;
                  case 15:
                      quince.setBackground(java.awt.Color.red);
                      quince.setEnabled(false);
                  break;
                  case 16:
                      dieciseis.setBackground(java.awt.Color.red);
                      dieciseis.setEnabled(false);
                  break;
                  case 17:
                      diecisiete.setBackground(java.awt.Color.red);
                      diecisiete.setEnabled(false);
                  break;
                  case 18:
                      dieciocho.setBackground(java.awt.Color.red);
                      dieciocho.setEnabled(false);
                  break;
                  case 19:
                      diecinueve.setBackground(java.awt.Color.red);
                      diecinueve.setEnabled(false);
                  break;
                  case 20:
                      veinte.setBackground(java.awt.Color.red);
                      veinte.setEnabled(false);
                  break;
                  case 21:
                      veintiuno.setBackground(java.awt.Color.red);
                      veintiuno.setEnabled(false);
                  break;
                  case 22:
                      veintidos.setBackground(java.awt.Color.red);
                      veintidos.setEnabled(false);
                  break;
                  case 23:
                      veintitres.setBackground(java.awt.Color.red);
                      veintitres.setEnabled(false);
                  break;
                  case 24:
                      veinticuatro.setBackground(java.awt.Color.red);
                      veinticuatro.setEnabled(false);
                  break;
                  case 25:
                      veinticinco.setBackground(java.awt.Color.red);
                      veinticinco.setEnabled(false);
                  break;
                  case 26:
                      veintiseis.setBackground(java.awt.Color.red);
                      veintiseis.setEnabled(false);
                  break;
                  case 27:
                      veintisiete.setBackground(java.awt.Color.red);
                      veintisiete.setEnabled(false);
                  break;
                  case 28:
                      veintiocho.setBackground(java.awt.Color.red);
                      veintiocho.setEnabled(false);
                  break;
                  case 29:
                      veintinueve.setBackground(java.awt.Color.red);
                      veintinueve.setEnabled(false);
                  break;
                  case 30:
                      treinta.setBackground(java.awt.Color.red);
                      treinta.setEnabled(false);
                  break;
                  case 31:
                      treintauno.setBackground(java.awt.Color.red);
                      treintauno.setEnabled(false);
                  break;
                  case 32:
                      treintados.setBackground(java.awt.Color.red);
                      treintados.setEnabled(false);
                  break;
                  case 33:
                      treintatres.setBackground(java.awt.Color.red);
                      treintatres.setEnabled(false);
                  break;
                  case 34:
                      treintacuatro.setBackground(java.awt.Color.red);
                      treintacuatro.setEnabled(false);
                  break;
                  case 35:
                      treintacinco.setBackground(java.awt.Color.red);
                      treintacinco.setEnabled(false);
                  break;
                  case 36:
                      treintaseis.setBackground(java.awt.Color.red);
                      treintaseis.setEnabled(false);
                  break;
                  case 37:
                      treintasiete.setBackground(java.awt.Color.red);
                      treintasiete.setEnabled(false);
                  break;
                  case 38:
                      treintaocho.setBackground(java.awt.Color.red);
                      treintaocho.setEnabled(false);
                  break;
                  case 39:
                      treintanueve.setBackground(java.awt.Color.red);
                      treintanueve.setEnabled(false);
                  break;
                  case 40:
                      cuarenta.setBackground(java.awt.Color.red);
                      cuarenta.setEnabled(false);
                  break;
                  case 41:
                      cuarentauno.setBackground(java.awt.Color.red);
                      cuarentauno.setEnabled(false);
                  break;
                  case 42:
                      cuarentados.setBackground(java.awt.Color.red);
                      cuarentados.setEnabled(false);
                  break;
                  case 43:
                      cuarentatres.setBackground(java.awt.Color.red);
                      cuarentatres.setEnabled(false);
                  break;
                  case 44:
                      cuarentacuatro.setBackground(java.awt.Color.red);
                      cuarentacuatro.setEnabled(false);
                  break;
                  
                  default:
                    JOptionPane.showMessageDialog(null, "Todos los Asientos Disponibles", "Respuesta Bus", JOptionPane.INFORMATION_MESSAGE);  
                  break;
                         
              }//final del switch
                
           }//final while
            
            

        }catch(SQLException e){
            System.out.println(""+asiento);
            System.out.println("Error::Actualizar Disponibilidad..."+e);
        }
           
    }
    
    public void precios(String viajes){
        String precio;
        String nSql="SELECT Precio from viajes WHERE viaje ='"+viajes+"'";
       try{
            PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(nSql);
            ResultSet n = pst.executeQuery(nSql);
            if(n.next()){
                precio= n.getString(1);
                System.out.println("Ver precio: "+precio);
                prec.setText(precio);
            }
       }catch(SQLException e){
           System.out.println("Consulta de Precio...realizada"); 
       } 
    }
    
    public void Horas(String viajes){
        String hora;
        String nSql="SELECT Hora_salida from viajes WHERE viaje ='"+viajes+"'";
       try{
            PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(nSql);
            ResultSet n = pst.executeQuery(nSql);
            if(n.next()){
                hora= n.getString(1);
                System.out.println("Ver hora: "+hora);
                horas.setText(hora);
            }
       }catch(SQLException e){
           System.out.println("Consulta de Hora...realizada"); 
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

        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        tiquete = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        once = new javax.swing.JButton();
        doce = new javax.swing.JButton();
        trece = new javax.swing.JButton();
        catorce = new javax.swing.JButton();
        quince = new javax.swing.JButton();
        dieciseis = new javax.swing.JButton();
        diecisiete = new javax.swing.JButton();
        dieciocho = new javax.swing.JButton();
        diecinueve = new javax.swing.JButton();
        veinte = new javax.swing.JButton();
        veintiuno = new javax.swing.JButton();
        veintidos = new javax.swing.JButton();
        veintitres = new javax.swing.JButton();
        veinticuatro = new javax.swing.JButton();
        veinticinco = new javax.swing.JButton();
        veintiseis = new javax.swing.JButton();
        veintisiete = new javax.swing.JButton();
        veintiocho = new javax.swing.JButton();
        veintinueve = new javax.swing.JButton();
        treinta = new javax.swing.JButton();
        treintauno = new javax.swing.JButton();
        treintados = new javax.swing.JButton();
        treintatres = new javax.swing.JButton();
        treintacuatro = new javax.swing.JButton();
        treintacinco = new javax.swing.JButton();
        treintaseis = new javax.swing.JButton();
        treintasiete = new javax.swing.JButton();
        treintaocho = new javax.swing.JButton();
        treintanueve = new javax.swing.JButton();
        cuarenta = new javax.swing.JButton();
        cuarentauno = new javax.swing.JButton();
        cuarentados = new javax.swing.JButton();
        cuarentatres = new javax.swing.JButton();
        cuarentacuatro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viaje = new javax.swing.JComboBox<>();
        BtnBuscarViaje = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        BtnRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        prec = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        horas = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra de Tiquetes TicoViajes");
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Compra de Tiquetes Tico Viajes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 280, 30));

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 100, 20));

        tiquete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tiquete.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 80, 20));

        hora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 195, 100, 20));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Nota: Antes de Seleccionar el asiento a comprar Digite sus Datos.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 400, 20));

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 70, 20));

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 70, 20));

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 70, 20));

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 70, 20));

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 60, 20));

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 60, 20));

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 60, 20));

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 60, 20));

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 60, 20));

        diez.setText("10");
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });
        getContentPane().add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 60, 20));

        once.setText("11");
        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });
        getContentPane().add(once, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 60, 20));

        doce.setText("12");
        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });
        getContentPane().add(doce, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 60, 20));

        trece.setText("13");
        trece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treceActionPerformed(evt);
            }
        });
        getContentPane().add(trece, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 60, 20));

        catorce.setText("14");
        catorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catorceActionPerformed(evt);
            }
        });
        getContentPane().add(catorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 60, 20));

        quince.setText("15");
        quince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinceActionPerformed(evt);
            }
        });
        getContentPane().add(quince, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, 20));

        dieciseis.setText("16");
        dieciseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieciseisActionPerformed(evt);
            }
        });
        getContentPane().add(dieciseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 20));

        diecisiete.setText("17");
        diecisiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diecisieteActionPerformed(evt);
            }
        });
        getContentPane().add(diecisiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 60, 20));

        dieciocho.setText("18");
        dieciocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieciochoActionPerformed(evt);
            }
        });
        getContentPane().add(dieciocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 60, 20));

        diecinueve.setText("19");
        diecinueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diecinueveActionPerformed(evt);
            }
        });
        getContentPane().add(diecinueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 60, 20));

        veinte.setText("20");
        veinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinteActionPerformed(evt);
            }
        });
        getContentPane().add(veinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 60, 20));

        veintiuno.setText("21");
        veintiuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintiunoActionPerformed(evt);
            }
        });
        getContentPane().add(veintiuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 60, 20));

        veintidos.setText("22");
        veintidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintidosActionPerformed(evt);
            }
        });
        getContentPane().add(veintidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 60, 20));

        veintitres.setText("23");
        veintitres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintitresActionPerformed(evt);
            }
        });
        getContentPane().add(veintitres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 60, 20));

        veinticuatro.setText("24");
        veinticuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinticuatroActionPerformed(evt);
            }
        });
        getContentPane().add(veinticuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 60, 20));

        veinticinco.setText("25");
        veinticinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinticincoActionPerformed(evt);
            }
        });
        getContentPane().add(veinticinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 60, 20));

        veintiseis.setText("26");
        veintiseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintiseisActionPerformed(evt);
            }
        });
        getContentPane().add(veintiseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 60, 20));

        veintisiete.setText("27");
        veintisiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintisieteActionPerformed(evt);
            }
        });
        getContentPane().add(veintisiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 20));

        veintiocho.setText("28");
        veintiocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintiochoActionPerformed(evt);
            }
        });
        getContentPane().add(veintiocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 60, 20));

        veintinueve.setText("29");
        veintinueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintinueveActionPerformed(evt);
            }
        });
        getContentPane().add(veintinueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 60, 20));

        treinta.setText("30");
        treinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaActionPerformed(evt);
            }
        });
        getContentPane().add(treinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 60, 20));

        treintauno.setText("31");
        treintauno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaunoActionPerformed(evt);
            }
        });
        getContentPane().add(treintauno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 60, 20));

        treintados.setText("32");
        treintados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintadosActionPerformed(evt);
            }
        });
        getContentPane().add(treintados, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 60, 20));

        treintatres.setText("33");
        treintatres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintatresActionPerformed(evt);
            }
        });
        getContentPane().add(treintatres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 60, 20));

        treintacuatro.setText("34");
        treintacuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintacuatroActionPerformed(evt);
            }
        });
        getContentPane().add(treintacuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 60, 20));

        treintacinco.setText("35");
        treintacinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintacincoActionPerformed(evt);
            }
        });
        getContentPane().add(treintacinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, 20));

        treintaseis.setText("36");
        treintaseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaseisActionPerformed(evt);
            }
        });
        getContentPane().add(treintaseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, 20));

        treintasiete.setText("37");
        treintasiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintasieteActionPerformed(evt);
            }
        });
        getContentPane().add(treintasiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 325, 60, 20));

        treintaocho.setText("38");
        treintaocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaochoActionPerformed(evt);
            }
        });
        getContentPane().add(treintaocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 345, 60, 20));

        treintanueve.setText("39");
        treintanueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintanueveActionPerformed(evt);
            }
        });
        getContentPane().add(treintanueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, 20));

        cuarenta.setText("40");
        cuarenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuarentaActionPerformed(evt);
            }
        });
        getContentPane().add(cuarenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 60, 20));

        cuarentauno.setText("41");
        cuarentauno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuarentaunoActionPerformed(evt);
            }
        });
        getContentPane().add(cuarentauno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, 60, 20));

        cuarentados.setText("42");
        cuarentados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuarentadosActionPerformed(evt);
            }
        });
        getContentPane().add(cuarentados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 345, 60, 20));

        cuarentatres.setText("43");
        cuarentatres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuarentatresActionPerformed(evt);
            }
        });
        getContentPane().add(cuarentatres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 20));

        cuarentacuatro.setText("44");
        cuarentacuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuarentacuatroActionPerformed(evt);
            }
        });
        getContentPane().add(cuarentacuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BusGrafi.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 630, 530));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TC.JPG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 590, 200));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione Viaje:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 110, 30));

        getContentPane().add(viaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 220, 30));

        BtnBuscarViaje.setText("Buscar");
        BtnBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarViajeActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 290, 80, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Digite el Nombre del Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 170, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 220, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Digite Apellido del Cliente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 170, 30));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 220, 30));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 340, 90, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 50, 30));

        prec.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prec, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 220, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Vendido");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 20, 78, 25));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 20, 76, 25));

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Disponible");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 63, 62, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 600, 120));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora Salida:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 80, 30));

        horas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        horas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 220, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/viajeee.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed

             //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=1;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                uno.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                uno.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                   System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               uno.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            uno.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
              //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=2;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                dos.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                dos.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               dos.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            dos.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else
        
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
          //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=3;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                tres.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                tres.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               tres.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            tres.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
          //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=5;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                cinco.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cinco.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cinco.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cinco.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else
    }//GEN-LAST:event_cincoActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=4;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                cuatro.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuatro.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuatro.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuatro.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else
    }//GEN-LAST:event_cuatroActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=6;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                seis.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                seis.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               seis.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            seis.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=7;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                siete.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                siete.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               siete.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            siete.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=8;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                ocho.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                ocho.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               ocho.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            ocho.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=9;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                nueve.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                nueve.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                 System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               nueve.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            nueve.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_nueveActionPerformed

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=10;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                diez.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                diez.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               diez.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            diez.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_diezActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=11;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                once.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                once.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               once.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            once.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_onceActionPerformed

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doceActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=12;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                doce.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                doce.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               doce.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            doce.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_doceActionPerformed

    private void treceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treceActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=13;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
                trece.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                trece.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               trece.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            trece.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treceActionPerformed

    private void catorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catorceActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=14;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               catorce.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                catorce.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               catorce.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            catorce.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_catorceActionPerformed

    private void BtnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarViajeActionPerformed
       //agarar texto de Combo box y convertir a String 
       viajes = (String) viaje.getSelectedItem();
        AsientosOcupados(viajes);
        precios(viajes);
        Horas(viajes);
    }//GEN-LAST:event_BtnBuscarViajeActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void quinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quinceActionPerformed
  //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=15;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               quince.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                quince.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               quince.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            quince.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_quinceActionPerformed

    private void dieciseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieciseisActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=16;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               dieciseis.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                dieciseis.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               dieciseis.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            dieciseis.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_dieciseisActionPerformed

    private void diecisieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diecisieteActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=17;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               diecisiete.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                diecisiete.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               diecisiete.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            diecisiete.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_diecisieteActionPerformed

    private void dieciochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieciochoActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=18;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               dieciocho.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                dieciocho.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               dieciocho.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            dieciocho.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_dieciochoActionPerformed

    private void diecinueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diecinueveActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=19;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               diecinueve.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                diecinueve.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               diecinueve.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            diecinueve.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_diecinueveActionPerformed

    private void veinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinteActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=20;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veinte.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veinte.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veinte.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veinte.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veinteActionPerformed

    private void veintiunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintiunoActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=21;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
              veintiuno.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintiuno.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintiuno.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintiuno.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintiunoActionPerformed

    private void veintidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintidosActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=22;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintidos.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintidos.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintidos.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintidos.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintidosActionPerformed

    private void veintitresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintitresActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=23;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintitres.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintitres.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintitres.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintitres.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintitresActionPerformed

    private void veinticuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinticuatroActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=24;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veinticuatro.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veinticuatro.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veinticuatro.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veinticuatro.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veinticuatroActionPerformed

    private void veinticincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinticincoActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=25;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veinticinco.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veinticinco.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veinticinco.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veinticinco.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veinticincoActionPerformed

    private void veintiseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintiseisActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=26;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintiseis.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintiseis.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintiseis.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintiseis.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintiseisActionPerformed

    private void veintisieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintisieteActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=27;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintisiete.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintisiete.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintisiete.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintisiete.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintisieteActionPerformed

    private void veintiochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintiochoActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=28;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintiocho.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                veintiocho.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintiocho.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintiocho.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintiochoActionPerformed

    private void veintinueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintinueveActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=29;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               veintinueve.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
               veintinueve.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               veintinueve.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            veintinueve.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_veintinueveActionPerformed

    private void treintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=30;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treinta.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treinta.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treinta.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treinta.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintaActionPerformed

    private void treintaunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaunoActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=31;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintauno.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintauno.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintauno.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintauno.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintaunoActionPerformed

    private void treintadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintadosActionPerformed
          //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=32;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintados.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintados.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintados.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintados.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintadosActionPerformed

    private void treintatresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintatresActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=33;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintatres.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintatres.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintatres.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintatres.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintatresActionPerformed

    private void treintacuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintacuatroActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=34;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintacuatro.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintacuatro.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintacuatro.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintacuatro.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintacuatroActionPerformed

    private void treintacincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintacincoActionPerformed
          //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=35;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintacinco.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintacinco.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintacinco.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintacinco.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintacincoActionPerformed

    private void treintaseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaseisActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=36;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintaseis.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintaseis.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintaseis.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintaseis.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintaseisActionPerformed

    private void treintasieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintasieteActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=37;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintasiete.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintasiete.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintasiete.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintasiete.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintasieteActionPerformed

    private void treintaochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaochoActionPerformed
       //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=38;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintaocho.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintaocho.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintaocho.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintaocho.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintaochoActionPerformed

    private void treintanueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintanueveActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=39;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               treintanueve.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                treintanueve.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               treintanueve.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            treintanueve.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_treintanueveActionPerformed

    private void cuarentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuarentaActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=40;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               cuarenta.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuarenta.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuarenta.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuarenta.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_cuarentaActionPerformed

    private void cuarentaunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuarentaunoActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=41;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               cuarentauno.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuarentauno.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuarentauno.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuarentauno.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_cuarentaunoActionPerformed

    private void cuarentadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuarentadosActionPerformed
         //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=42;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               cuarentados.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuarentados.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuarentados.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuarentados.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_cuarentadosActionPerformed

    private void cuarentatresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuarentatresActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=43;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               cuarentatres.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuarentatres.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuarentatres.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuarentatres.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_cuarentatresActionPerformed

    private void cuarentacuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuarentacuatroActionPerformed
        //variables String
             String viajes,nombre,apellidos,num;
             
            nombre = name.getText();
            apellidos= apellido.getText();
            NumeroAsiento=44;
            num = String.valueOf(NumeroAsiento);
            EstadoAsiento = "Ocupado";
             //agarar texto de Combo box y convertir a String 
            viajes = (String) viaje.getSelectedItem();

        //Inica con una pregunta si desea comprar el color del asiento se vuelve rojo sino se pone en verde para mostrar disponible
        int entrar=JOptionPane.showConfirmDialog(null,"Desea Comprar este Asiento (Si)\n Desea cambiar precione (No)para cancelar");
        if(entrar==JOptionPane.YES_OPTION){
           
             int valido=JOptionPane.showConfirmDialog(null,"Si Digita Si una vez más \n Ya no se podra quitar la Opción");
              if (valido==JOptionPane.YES_OPTION) {
                sumar = sumar +1;
                tiquete.setText(""+sumar);
               cuarentacuatro.setBackground(java.awt.Color.red);
                JOptionPane.showMessageDialog(null, "Asiento Vendido", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                comprando =comprando+1;
                cuarentacuatro.setEnabled(false);
            
            //Consulta de Insert a la base de datos
              sSql ="INSERT INTO `clientes`(`Id_Clientes`, `Nombre_cliente`, `Apellidos_cliente`, `Viajes`, `Numero_Asiento`, `Estado_Asiento`) "
                + "VALUES (?,?,?,?,?,?)";
            
           try{
              PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(sSql);
               pst.setString(1, null);
               pst.setString(2, nombre);
               pst.setString(3, apellidos);
               pst.setString(4, viajes);
               pst.setString(5, num);
               pst.setString(6, EstadoAsiento);

              int n = pst.executeUpdate();
               if(n > 0){
                  System.out.println("Guardado en la base de datos");
                }
                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Error::"+e,"Ingreso MySql",JOptionPane.ERROR);
           
            }//final del catch   
           }else{
               cuarentacuatro.setBackground(java.awt.Color.green);
               JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        }else{
            cuarentacuatro.setBackground(java.awt.Color.green);
            JOptionPane.showMessageDialog(null, "Asiento esta Disponible", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            comprando = comprando - 1;

        } //fin del else 
    }//GEN-LAST:event_cuarentacuatroActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarViaje;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton catorce;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuarenta;
    private javax.swing.JButton cuarentacuatro;
    private javax.swing.JButton cuarentados;
    private javax.swing.JButton cuarentatres;
    private javax.swing.JButton cuarentauno;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton diecinueve;
    private javax.swing.JButton dieciocho;
    private javax.swing.JButton dieciseis;
    private javax.swing.JButton diecisiete;
    private javax.swing.JButton diez;
    private javax.swing.JButton doce;
    private javax.swing.JButton dos;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField name;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton once;
    private javax.swing.JLabel prec;
    private javax.swing.JButton quince;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JLabel tiquete;
    private javax.swing.JButton trece;
    private javax.swing.JButton treinta;
    private javax.swing.JButton treintacinco;
    private javax.swing.JButton treintacuatro;
    private javax.swing.JButton treintados;
    private javax.swing.JButton treintanueve;
    private javax.swing.JButton treintaocho;
    private javax.swing.JButton treintaseis;
    private javax.swing.JButton treintasiete;
    private javax.swing.JButton treintatres;
    private javax.swing.JButton treintauno;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private javax.swing.JButton veinte;
    private javax.swing.JButton veinticinco;
    private javax.swing.JButton veinticuatro;
    private javax.swing.JButton veintidos;
    private javax.swing.JButton veintinueve;
    private javax.swing.JButton veintiocho;
    private javax.swing.JButton veintiseis;
    private javax.swing.JButton veintisiete;
    private javax.swing.JButton veintitres;
    private javax.swing.JButton veintiuno;
    private javax.swing.JComboBox<String> viaje;
    // End of variables declaration//GEN-END:variables
}
