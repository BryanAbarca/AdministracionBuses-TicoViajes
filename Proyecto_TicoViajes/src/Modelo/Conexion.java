/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * Conexion a las bases de datos de MySql
 * @author 
 */
public class Conexion {
    //variable para conexión se importa la biblioteca JDBC Driver
    Connection conectar = null;
    static ResultSet resultado;
    static Statement sentencia;
    
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticoviajes","root","");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ticoviajes","root","");
            sentencia = conectar.createStatement();
            System.out.println("String de Conexion es Correcto...");
        }catch(Exception e){
            System.out.println("Error::"+e);
        }
        
        return conectar;
    }
    
    //-----------------------------------------------------------------------------------------------------
    
    public  ArrayList<String> llenar_combo_Bus(){
       ArrayList<String> lista = new ArrayList<String>();
       String slq ="SELECT * FROM `flotilla`";
       try{
         resultado = sentencia.executeQuery(slq);
           System.out.println(" Se ha ejecutado Correctamente Combo box bus");
       }catch(Exception e){
           System.out.println("Error::"+e); 
       }
       
       try{
          while(resultado.next()){
           lista.add(resultado.getString("Id_flotilla"));
       } 
       }catch(Exception e){
           
       }
       return lista;
    }
  
  //--------------------------------------------------------------------------------------------------------------  
    
     public  ArrayList<String> llenar_combo_Precios(){
       ArrayList<String> lista = new ArrayList<String>();
       String slq ="SELECT * FROM `precios`";
       try{
         resultado = sentencia.executeQuery(slq);
           System.out.println(" Se ha ejecutado Correctamente Combo box Precios");
       }catch(Exception e){
           System.out.println("Error::"+e); 
       }
       
       try{
          while(resultado.next()){
           lista.add(resultado.getString("Precio"));
       } 
       }catch(Exception e){
           
       }
       return lista;
    }
    
     
   //----------------------------------------------------------------------------------------------------------  
     public  ArrayList<String> llenar_combo_Viajes(){
       ArrayList<String> lista = new ArrayList<String>();
       String slq ="SELECT * FROM `viajes`";
       try{
         resultado = sentencia.executeQuery(slq);
           System.out.println(" Se ha ejecutado Correctamente Combo box Viajes");
       }catch(Exception e){
           System.out.println("Error::"+e); 
       }
       
       try{
          while(resultado.next()){
           lista.add(resultado.getString("Punto_salida")+"-"+resultado.getString("Punto_destino"));
       } 
       }catch(Exception e){
           
       }
       return lista;
    }
     
    // Método para buscar el cantida de ID en la base de datos y con este reflejarlo en el Numero de Tiquete de Venta
      public int buscarId() {
       //para ingresar a la base de datos
       Conexion msql = new Conexion();
       Connection conexion = msql.conectar();   
        int uno=1,id=0;  
       String nSql="SELECT MAX(Id_Clientes) FROM `clientes`";
        try{
            PreparedStatement pst = (PreparedStatement) conexion.clientPrepareStatement(nSql);
            ResultSet n = pst.executeQuery(nSql);
            if(n.next()){
                System.out.println("Id existe es mayor"); 
                uno= n.getInt(1);
                id=uno;
                System.out.println("ID es #: "+id);

            }else{
                id=1;
            }
            
        }catch(SQLException e){
            System.out.println("Error::BuscarID..."+e);
        }
        
        return id;
    }
      
      public  ArrayList<String> ViajeEncomienda(){
       ArrayList<String> lista = new ArrayList<String>();
       String slq ="SELECT DISTINCT Viajes FROM `encomienda` ";
       try{
         resultado = sentencia.executeQuery(slq);
           System.out.println(" Se ha ejecutado Correctamente Combo box Viajes");
       }catch(Exception e){
           System.out.println("Error::"+e); 
       }
       
       try{
          while(resultado.next()){
           lista.add(resultado.getString("Viajes"));
       } 
       }catch(Exception e){
         System.out.println("Erro::"+e);  
       }
       return lista;
    }
   
      
      public static ResultSet getTabla(String consulta){
        //para ingresar a la base de datos
       Conexion msql = new Conexion();
       Connection conexion = msql.conectar();  
       try{
            sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery(consulta);
       }catch(Exception e){
           System.out.println("Erro::"+e);
       }
        return resultado;
      }
 
}//Final de la Clase Conexion
