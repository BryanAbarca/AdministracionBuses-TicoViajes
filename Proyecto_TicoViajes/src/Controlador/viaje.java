/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author HELLEN HERNANDEZ
 */
public class viaje {
    
    private String Punto_salida;
    private String  Punto_destino;
    private String  precio;
    private String Kilometros;
    private int  flotilla;
    private String fecha;
    private String Hsalida;
    private String HLlegada;

    public viaje(String Punto_salida, String Punto_destino, String precio, String Kilometros, int flotilla, String fecha, String Hsalida, String HLlegada) {
        this.Punto_salida = Punto_salida;
        this.Punto_destino = Punto_destino;
        this.precio = precio;
        this.Kilometros = Kilometros;
        this.flotilla = flotilla;
        this.fecha = fecha;
        this.Hsalida = Hsalida;
        this.HLlegada = HLlegada;
    }

    public String getPunto_salida() {
        return Punto_salida;
    }

    public void setPunto_salida(String Punto_salida) {
        this.Punto_salida = Punto_salida;
    }

    public String getPunto_destino() {
        return Punto_destino;
    }

    public void setPunto_destino(String Punto_destino) {
        this.Punto_destino = Punto_destino;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

 

    public String getKilometros() {
        return Kilometros;
    }

    public void setKilometros(String Kilometros) {
        this.Kilometros = Kilometros;
    }

    public int getFlotilla() {
        return flotilla;
    }

    public void setFlotilla(int flotilla) {
        this.flotilla = flotilla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHsalida() {
        return Hsalida;
    }

    public void setHsalida(String Hsalida) {
        this.Hsalida = Hsalida;
    }

    public String getHLlegada() {
        return HLlegada;
    }

    public void setHLlegada(String HLlegada) {
        this.HLlegada = HLlegada;
    }
    
    
    
}
