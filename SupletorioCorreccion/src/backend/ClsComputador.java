/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author usuario
 */
public class ClsComputador extends ClsProductos{

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Capacidad
     */
    public int getCapacidad() {
        return Capacidad;
    }

    /**
     * @param Capacidad the Capacidad to set
     */
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    /**
     * @return the Ram
     */
    public int getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    private String tipo ;
    private int Capacidad;
    private int Ram;
    private String procesador;

    public ClsComputador(String tipo, int Capacidad, int Ram, String procesador,  String nombre, String marca,double precio) {
        super(nombre, marca, precio);
        this.tipo = tipo;
        this.Capacidad = Capacidad;
        this.Ram = Ram;
        this.procesador = procesador;
    }

    public ClsComputador() {
    }

    

    
    
    
}
