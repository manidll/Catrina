/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;



/**
 *
 * @author Emmanuel Rivas Quintana
 */
public class Cliente {
   
    private String codigo;
    private String nombre;
    private String rfc;
    private String domicilio;
    private String ciudad;
    private String cp;
    

    /**
     * Get and set Nombre
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get and set RFC
     * @return RFC del cliente
     */
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Get and set Ciudad
     * @return Ciudad donde recide el cliente.
     */
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Get and set CP
     * @return CP del cliente.
     */
    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * Get and set Domicilio
     * @return Domicilio del cliente.
     */
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    
    
}
