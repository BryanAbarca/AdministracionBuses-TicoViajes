/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 
 */
public class Tiempo {
    
    Calendar fecha = new GregorianCalendar();
    
    //para obtener la fecha
    String anho = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    //concatenamos para tener fecha
   public String fechacomp = anho+"/"+mes+"/"+dia;
    
    
    //obtener las horas 
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    
   public String horacomp = hora+":"+minuto;
}
