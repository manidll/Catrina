/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;
import java.util.Date;
import mx.itson.catrina.enumeradores.Tipo;


/**
 *
 * @author mane0
 */
public class Movimiento {
  
    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;
    

    /**
     * Get and set Fecha
     * @return lista de fechas.
     */
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Get and set Descripcion
     * @return descripciones de movimientos.
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get and set Cantidad
     * @return Lista de cantidades dentro del json
     */
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Get and set Tipo
     * @return enumeradores de la clase Tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    


   
    
    
}
