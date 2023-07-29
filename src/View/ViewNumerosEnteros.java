/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.Scanner;
import Class.NumerosEnteros;
/**
 *
 * @author MI PC
 */
public class ViewNumerosEnteros {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int num = scanner.nextInt();
            NumerosEnteros numentero = new NumerosEnteros(num);
            if(numentero.par()){
                System.out.println("EL numero es par.");
            }else{
                System.out.println("El numero es impar.");
            }
            if(numentero.po()){
                System.out.println("El numero es positivo.");
            }else{
                System.out.println("El numero es negativo.");
            }
             


            if (numentero.Rango(200, 300)) {
                System.out.println("El número está en el rango 200-300.");
                System.out.println("El número es " + (numentero.esPar() ? "par." : "impar."));
            } else {
                System.out.println("El número no está en el rango 200-300.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }
}
