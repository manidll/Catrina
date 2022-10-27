/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.awt.List;

/**
 *
 * @author mane0
 */
public class Cliente {
   
    private String nombre;
    private String rfc;
    private String domicilio;
    private String ciudad;
    private String cp;
    
    
    public Cliente deserializar(String json){
        Cliente cliente = new Cliente();
        try{
            cliente = new Gson().fromJson(json, Cliente.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

   
    
    
}
