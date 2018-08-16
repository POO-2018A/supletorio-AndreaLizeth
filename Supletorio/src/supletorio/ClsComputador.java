/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

/**
 *
 * @author ESFOT
 */
public class ClsComputador extends Articulos {
    private String tipo;
    private int capacidadAlmacenamiento;
    private int ram;
    private String procesador;
    
    public ClsComputador(String nombre, double precio, String marca) {
        super(nombre, precio, marca);
    }

    public ClsComputador(String tipo, int capacidadAlmacenamiento, int ram, String procesador, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.tipo = tipo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
    
    
    
    
}
