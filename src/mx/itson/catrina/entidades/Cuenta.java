/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import com.sun.security.ntlm.Client;
import java.awt.List;

/**
 *
 * @author mane0
 */
public class Cuenta {
    
    private int cuenta;
    private int clabe;
    private String moneda;
    private String producto;
    
    
     public Cuenta deserializar(String json){
        Cuenta cuenta = new Cuenta();
        try{
            cuenta = new Gson().fromJson(json, Cuenta.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return cuenta;
    }
   

    public int getClabe() {
        return clabe;
    }

    public void setClabe(int clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    
    
    
}
