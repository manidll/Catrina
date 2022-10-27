/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;


/**
 *
 * @author mane0
 */
public class Cuenta {
    
    private String cuenta;
    private String clabe;
    private String moneda;
    private String producto;
    private Cliente cliente;
    
    
     public Cuenta deserializar(String json){
        Cuenta cuenta = new Cuenta();
        try{
            cuenta = new Gson().fromJson(json, Cuenta.class);
        }catch(JsonSyntaxException ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   

 

   

    
    
    
}
