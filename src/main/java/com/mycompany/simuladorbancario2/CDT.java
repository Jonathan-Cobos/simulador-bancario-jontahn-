/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class CDT {
//constantes   

    public static final double tasa_CDT = 0.01;

//Atributos
    private double valorApertura;
    private Fecha fechaApertura;
    private double valorLiquidacion;
    private int meses;

    //constructo
    public CDT() {
        this.fechaApertura = new Fecha();
    }

    public CDT(double valorApertura, Fecha fechaApertura, double valorLiquidacion, int meses) {
        this.valorApertura = valorApertura;
        this.fechaApertura = fechaApertura;
        this.valorLiquidacion = valorLiquidacion;
        this.meses = meses;
    }
    //get y set

    public double getValorApertura() {
        return valorApertura;
    }

    public void setValorApertura(double valorApertura) {
        this.valorApertura = valorApertura;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getValorLiquidacion() {
        return valorLiquidacion;
    }

    public void setVaorLiquidacion(double valorLiquidacion) {
        this.valorLiquidacion = valorLiquidacion;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
   

    //metodos
    public void abrirCDT(Fecha apertura, double valor, int meses) {

        this.fechaApertura = apertura;
        this.valorApertura = valor;
        this.meses = meses;
    }

    ///intereses
    public double calcularIntereses() {

        this.valorLiquidacion = this.valorApertura + (this.valorApertura * tasa_CDT * this.meses);
        return this.valorLiquidacion;
    }
     //to string

    @Override
    public String toString() {
        return "CDT{" + "\nvalorApertura=" + valorApertura + ", \nfechaApertura=" + fechaApertura + ", \nvalorLiquidacion=" + valorLiquidacion + ", \nmeses=" + meses + '}';
    }
}
