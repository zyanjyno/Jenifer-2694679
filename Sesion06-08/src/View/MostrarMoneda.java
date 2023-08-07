/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import ENtity.Abstracts.ConversionMoneda.ConversionMoneda;
/**
 *
 * @author JuanDa
 */
public class MostrarMoneda {
    public static void main(String[] args) {
        ConversionMoneda cm = new ConversionMoneda();
        cm.PesosCOP();
        cm.PesosUSD();
        cm.PesosPEN();
        cm.PesosVEF();
        
    }
}
