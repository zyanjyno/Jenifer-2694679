/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author MI PC
 */
public class NumerosReales {
     private double numero;

    public NumerosReales(double numero) {
        this.numero = numero;
    }

    public boolean MayorA(double valor) {
        return numero > valor;
    }
    
    public double valorAbs() {
        return Math.abs(numero);
    }

    public boolean Positivo() {
        return numero > 0;
    }

    public boolean MayorA200() {
        return numero > 200;
    }
        public boolean Rango(double inicio, double fin) {
        return numero >= inicio && numero <= fin;
    }

    public boolean Par() {
        return numero % 2 == 0;
    }


}
