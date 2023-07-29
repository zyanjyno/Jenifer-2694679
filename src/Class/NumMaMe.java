/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author MI PC
 */
public class NumMaMe {
    private double numero1;
    private double numero2;

    public NumMaMe(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
     public double Mayor() {
        return Math.max(numero1, numero2);
    }

    public double Menor() {
        return Math.min(numero1, numero2);
    }
}
