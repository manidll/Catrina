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
 * @author Emmanuel Rivas Quintana
 */
public class Cuenta {
    
    private String cuenta;
    private String clabe;
    private String moneda;
    private String producto;
    private Cliente cliente;
    private List< Movimiento> movimientos;
    
    /**
     * convierte una cadena JSON en un objeto
     * @param json busca el formato JSON
     * @return cuentaDes
     */
    
    public Cuenta deserializar (String json){
        Cuenta cuentaDes = new Cuenta();
        try{
            cuentaDes = new Gson().fromJson(json, Cuenta.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return cuentaDes;
    }

    /**
     *  get and set Cuenta
     * @return numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     *  get and set moneda
     * @return tipo de moneda
     */
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    /**
     * get and set producto
     * @return Titulo de tabla
     */
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * get and set cliente
     * @return propiedades de la clase cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * get and set clabe
     * @return numero de clabe.
     */
    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * get and set lista movimiento
     * @return enumeradores de la clase Tipo.
     */
    public List< Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List< Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

 

   
    
}
