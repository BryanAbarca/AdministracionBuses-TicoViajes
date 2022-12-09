/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



/**
 *
 * @author 
 */
public class Encomienda {
    
    private String Codigo;
    private String Peso;
    private String PXP;
    private String NombreEntrega;
    private String NombreRetira;
    private String Viajes;
    private int Bus;
    private String LugarSalida;
    private String LugarDestino;
    private String hora;
    private String FechaSalida;
    private String FechaLlegada;
    private String fechaEntregaDestinario;
    private String horaEntregaDestinario;
    private String Estado;

    public Encomienda(String Codigo, String Peso, String PXP, String NombreEntrega, String NombreRetira, String Viajes, int Bus, String LugarSalida, String LugarDestino, String hora, String FechaSalida, String FechaLlegada, String fechaEntregaDestinario, String horaEntregaDestinario, String Estado) {
        this.Codigo = Codigo;
        this.Peso = Peso;
        this.PXP = PXP;
        this.NombreEntrega = NombreEntrega;
        this.NombreRetira = NombreRetira;
        this.Viajes = Viajes;
        this.Bus = Bus;
        this.LugarSalida = LugarSalida;
        this.LugarDestino = LugarDestino;
        this.hora = hora;
        this.FechaSalida = FechaSalida;
        this.FechaLlegada = FechaLlegada;
        this.fechaEntregaDestinario = fechaEntregaDestinario;
        this.horaEntregaDestinario = horaEntregaDestinario;
        this.Estado = Estado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getPXP() {
        return PXP;
    }

    public void setPXP(String PXP) {
        this.PXP = PXP;
    }

    public String getNombreEntrega() {
        return NombreEntrega;
    }

    public void setNombreEntrega(String NombreEntrega) {
        this.NombreEntrega = NombreEntrega;
    }

    public String getNombreRetira() {
        return NombreRetira;
    }

    public void setNombreRetira(String NombreRetira) {
        this.NombreRetira = NombreRetira;
    }

    public String getViajes() {
        return Viajes;
    }

    public void setViajes(String Viajes) {
        this.Viajes = Viajes;
    }

  

    public int getBus() {
        return Bus;
    }

    public void setBus(int Bus) {
        this.Bus = Bus;
    }

    public String getLugarSalida() {
        return LugarSalida;
    }

    public void setLugarSalida(String LugarSalida) {
        this.LugarSalida = LugarSalida;
    }

    public String getLugarDestino() {
        return LugarDestino;
    }

    public void setLugarDestino(String LugarDestino) {
        this.LugarDestino = LugarDestino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaLlegada() {
        return FechaLlegada;
    }

    public void setFechaLlegada(String FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public String getFechaEntregaDestinario() {
        return fechaEntregaDestinario;
    }

    public void setFechaEntregaDestinario(String fechaEntregaDestinario) {
        this.fechaEntregaDestinario = fechaEntregaDestinario;
    }

    public String getHoraEntregaDestinario() {
        return horaEntregaDestinario;
    }

    public void setHoraEntregaDestinario(String horaEntregaDestinario) {
        this.horaEntregaDestinario = horaEntregaDestinario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

   
    
    
}
