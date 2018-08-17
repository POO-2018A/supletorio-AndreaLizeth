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
public class ClsComponente extends ClsProductos {

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
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
     * @return the Velocidad
     */
    public String getVelocidad() {
        return Velocidad;
    }

    /**
     * @param Velocidad the Velocidad to set
     */
    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }
    private String Tipo;
    private int Capacidad;
    private String Velocidad;

    public ClsComponente(String Tipo, int Capacidad, String Velocidad,String nombre,String marca,double precio) {
        super(nombre,marca,precio);
        this.Tipo = Tipo;
        this.Capacidad = Capacidad;
        this.Velocidad = Velocidad;
    }

    public ClsComponente() {
    }

    public ClsComponente(String Tipo, int Capacidad, String Velocidad) {
        this.Tipo = Tipo;
        this.Capacidad = Capacidad;
        this.Velocidad = Velocidad;
    }
    
    
}
