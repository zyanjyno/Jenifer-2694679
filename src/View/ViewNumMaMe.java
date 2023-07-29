/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.Scanner;
import Class.NumMaMe;
/**
 *
 * @author MI PC
 */
public class ViewNumMaMe {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            NumMaMe numeros = new NumMaMe(numero1, numero2);

            double mayor = numeros.Mayor();
            double menor = numeros.Menor();
            
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingresa dos números válidos.");
        } 
    }
     

}
