/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ticoviajes;

import javax.swing.JOptionPane;
import vista.MenuPrincipal;


/**
 *
 * @author 
 */
public class Proyecto_TicoViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        //Bienvenida al Sistema
         JOptionPane.showMessageDialog(null,"Bienvenido\n Ha Ingresado al Sistema Tico Viajes\n ");
        
        //Inicializamos para hacer el llamado al método Principal
         MenuPrincipal Inicio = new MenuPrincipal();    
       //Ubicación de nuestro Jframe
         Inicio.setLocationRelativeTo(null);
        //muestre el Método
         Inicio.show();
        
        
    }//final del metodo Main


    
}//final del proyecto TicoViajes
