/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.simuladorbancario2;

/**
 *
 * @author Acer
 */
public class SimuladorBancario2 {

    public static void main(String[] args) {
        //banco
        Banco MiBanco = new Banco();
        MiBanco.setNombre("Bancobos");
        MiBanco.setNit(123654789);
        MiBanco.setCorreo("Bancobos@tubanco.com");

        System.out.println("Informacion Banco: " + MiBanco.toString());
        //crear cuenta

        Ahorros ahorro01 = new Ahorros(2000000, 0);
        Corriente corriente01 = new Corriente(200000);
        CDT cdt01 = new CDT(1000000, new Fecha(21, 03, 2023), 0, 12);

        Cuenta miCuenta = new Cuenta("jonathan", "cobosprivado@gmail.com", "1001091226", ahorro01, corriente01, cdt01, 0);
        //Asociar cuenta
        MiBanco.setCliente1(miCuenta);
        System.out.println("su cuenta es:" + miCuenta);
        //Correinte
        System.out.println("su ceunta Corriente tiene un saldo de:" + miCuenta.getCorriente());
       
        //consignar corriente
        corriente01.consignar(50000);
        System.out.println("El valor de su cuenta corrientemas consignacion es: " + corriente01.toString());

        //retirar correitne 
        corriente01.retirar(25000);

        System.out.println("El valor de su cuenta corriente mas el retiro es: " + corriente01.toString());
        
        //Ahorros
        System.out.println("su ceunta Ahorro tiene un saldo de:" + miCuenta.getAhorro());
        //consignar ahorros
        ahorro01.consignar(100000);
        System.out.println("El valor de su cuenta ahorros mas consignacion es: " + ahorro01.toString());

        //retirar ahorros
        ahorro01.retirar(0);

        System.out.println("El valor de su cuenta ahorros mas el retiro es: " + ahorro01.toString());
        //intereses 
        System.out.println("sus intereses son: " + ahorro01.calcularinteres());
        //CDT
        CDT miCDT = new CDT();
        miCDT.abrirCDT(new Fecha(21, 03, 2023), 1000000, 2);
        System.out.println("Abrir CDT:" + miCDT.toString());
        miCDT.calcularIntereses();
        System.out.println("sus intereses son " + miCDT.getValorLiquidacion());
        //Ahorros + cdt
        miCuenta.actualizarSaldos();
        System.out.println("Su saldo en Ahorro mas intereses del CDT es:" + (miCuenta.getAhorro()));
        // actualizar cdt
        miCuenta.dejar_0_CDT();
        System.out.println("su saldo en CDT es:" + miCuenta.getCdt());

    }
}
