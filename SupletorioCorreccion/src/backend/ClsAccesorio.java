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
public class ClsAccesorio extends ClsProductos{

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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    private String tipo;
    private String color;

    public ClsAccesorio() {
    }

    public ClsAccesorio(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public ClsAccesorio(String tipo, String color, String nombre,String marca,double precio) {
        super(nombre,marca, precio);
        this.tipo = tipo;
        this.color = color;
    }
    
    
    
}
