/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;



/**
 *
 * @author mane0
 */
public class CuentaContable {
    
    private String cuenta;
    private String clabe;
    private String moneda;
    private String producto;
    private Cliente cliente;
    private List< Movimiento> movimientos;

    
    public CuentaContable deserializar (String json){
        CuentaContable cuentaDes = new CuentaContable();
        try{
            cuentaDes = new Gson().fromJson(json, CuentaContable.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return cuentaDes;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
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

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public List< Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List< Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
