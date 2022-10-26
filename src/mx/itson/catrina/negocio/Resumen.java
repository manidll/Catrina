/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.negocio;

/**
 *
 * @author mane0
 */
public class Resumen {
 
    private double saldoInicial;
    private double totalDepositos;
    private double totalRetiros;
    private double saldoFinal;

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getTotalDepositos() {
        return totalDepositos;
    }

    public void setTotalDepositos(double totalDepositos) {
        this.totalDepositos = totalDepositos;
    }

    public double getTotalRetiros() {
        return totalRetiros;
    }

    public void setTotalRetiros(double totalRetiros) {
        this.totalRetiros = totalRetiros;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
    
}
