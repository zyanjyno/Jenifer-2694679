/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Class.NumerosReales;
import java.util.Scanner;
/**
 *
 * @author MI PC
 */
public class ViewNumReales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número real: ");
            double num = scanner.nextDouble();
            NumerosReales numReal = new NumerosReales(num);
            if(numReal.MayorA(5)){
                System.out.println("El numero es mayor a 5.");
            }else{
                System.out.println("El numero es menor a 5.");
            }
            System.out.println(" El valor absoluto del número es: " + numReal.valorAbs());
            if(numReal.Positivo()){
                System.out.println("El numero es positivo.");
            }else{
                System.out.println("El numero es negativo.");
            }
         if(numReal.MayorA200()){
             System.out.println("EL numero es mayor a 200.");
         }else{
             System.out.println("El numero es menor a 200.");
         }
           if(numReal.Rango(200, 300)){
               System.out.println("El numero SI esta en el rango de 200-300.");
           }else{
               System.out.println("El numero NO esta en el rango de 200-300.");
           }
           if(numReal.Par()){
               System.out.println("El numero es par.");
           }else{
               System.out.println(" El nuemro no es par.");
           }
    }catch (Exception e) {
            System.out.println("Error: Ingresa un número válido.");
        }
}
}
