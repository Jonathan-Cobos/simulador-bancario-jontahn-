/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class Corriente {

    private double saldo;

    //contructo
    public Corriente(double saldo) {
        this.saldo = saldo;
    }

    public Corriente() {
    }

//get y set
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//string
    @Override
    public String toString() {
        return "Corriente{" + "saldo=" + saldo + '}';
    }

}
