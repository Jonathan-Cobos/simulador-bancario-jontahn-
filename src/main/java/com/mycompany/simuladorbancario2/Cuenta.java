/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class Cuenta {

    private String cliente;
    private String correo;
    private String cedula;
    private Ahorros ahorro;
    private Corriente corriente;
    private CDT cdt;
    private int mesessimulacion;
//contruscot

    public Cuenta() {
        this.ahorro = new Ahorros();
        this.corriente = new Corriente();
        this.cdt = new CDT();
    }

    public Cuenta(String cliente, String correo, String cedula, Ahorros ahorro, Corriente corriente, CDT cdt, int mesessimulacion) {
        this.cliente = cliente;
        this.correo = correo;
        this.cedula = cedula;
        this.ahorro = ahorro;
        this.corriente = corriente;
        this.cdt = cdt;
        this.mesessimulacion = mesessimulacion;
    }

    //get y ser
    public int getMesessimulacion() {
        return mesessimulacion;
    }

    public void setMesessimulacion(int mesessimulacion) {
        this.mesessimulacion = mesessimulacion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Ahorros getAhorro() {
        return ahorro;
    }

    public void setAhorro(Ahorros ahorro) {
        this.ahorro = ahorro;
    }

    public Corriente getCorriente() {
        return corriente;
    }

    public void setCorriente(Corriente corriente) {
        this.corriente = corriente;
    }

    public CDT getCdt() {
        return cdt;
    }

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }
    //to string

    @Override
    public String toString() {
        return "Cuenta{" + "\ncliente=" + cliente + ",\n correo=" + correo + ", \ncedula=" + cedula + ", \nahorro=" + ahorro + ", \ncorriente=" + corriente + ",\n cdt=" + cdt + ",\n mesessimulacion=" + mesessimulacion + '}';
    }

    //actulizar saldo cdt 
    public void  actualizarSaldos(){
    
    
       this.ahorro.consignar(this.cdt.getValorLiquidacion());
    
    }
    //dejar en 0 CDt
    public void  dejar_0_CDT(){
    
    this.cdt.setValorApertura(0);
    this.cdt.setMeses(0);
    }
    
}
