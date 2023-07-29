/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author MI PC
 */
public class NumerosEnteros {
     private int numero;

    public NumerosEnteros(int numero) {
        this.numero = numero;
    }
    public boolean par(){
        return numero % 2==0;
    }
    public boolean po(){
        return numero>0;
    }

    public boolean Rango(int inicio, int fin) {
        return numero >= inicio && numero <= fin;
    }

    public boolean esPar() {
        return numero % 2 == 0;
    }
}
