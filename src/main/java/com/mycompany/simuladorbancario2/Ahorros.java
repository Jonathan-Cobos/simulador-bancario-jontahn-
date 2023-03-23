/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class Ahorros {

    //constante 
    public final static double PORCENTAGE_INTERES = 0.06;

    //atributos
    private double saldo;
    private double interes;

//constructo
    public Ahorros() {
    }

    public Ahorros(double saldo, double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }
//get y set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
//string

    @Override
    public String toString() {
        return "Ahorros{" + "saldo=" + saldo + '}';
    }

    //calcular interes de un mes
    public double calcularinteres() {
        this.interes = this.saldo * Ahorros.PORCENTAGE_INTERES;
        return this.interes;
    }

    //consignar
    public void consignar(double valor) {
        this.saldo += valor;

    }

    //retirar 
    public void retirar(double valor) {
        this.saldo -= valor;

    }

}
