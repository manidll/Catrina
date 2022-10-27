/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.awt.List;
import java.util.Date;

/**
 *
 * @author mane0
 */
public class Movimiento {
  
    private Date fecha;
    private String descripcion;
    private double cantidad;
    private int tipo;
    
    
     public Movimiento deserializar(String json){
        Movimiento movimiento = new Movimiento();
        try{
            movimiento = new Gson().fromJson(json, Movimiento.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return movimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
