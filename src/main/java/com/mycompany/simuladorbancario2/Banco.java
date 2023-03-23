/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class Banco {

    private String nombre;
    private int nit;
    public String correo;
    private Cuenta cliente1;
    private Cuenta cliente2;
// construct

    public Banco() {
        this.cliente1 = new Cuenta();
        this.cliente2 = new Cuenta();
    }

    public Banco(String nombre, int nit, String correo, Cuenta cliente1, Cuenta cliente2) {
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;

    }

    //gget y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cuenta getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cuenta cliente1) {
        this.cliente1 = cliente1;
    }

    public Cuenta getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cuenta cliente2) {
        this.cliente2 = cliente2;
    }

    // to string
    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", nit=" + nit + ", correo=" + correo + ", cliente1=" + cliente1 + ", cliente2=" + cliente2 + '}';
    }

}
