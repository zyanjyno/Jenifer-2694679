/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class FuctionGrados {
     private Double f;
    private Double c;
    private Double k;
    private Double numero;
    
    
        private Double getF() {
        return f;
    }

    private void setF(Double f) {
        this.f = f;
    }
    
       private Double getC() {
        return c;
    }

    private void setC(Double c) {
        this.c = c;
    }
    
       private Double getK() {
        return k;
    }

    private void setK(Double k) {
        this.k = k;
    }
    
       private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }
    
     public Double celsiusfah(Double celsius) {
        
        return celsius + 273.15;
    }


    public Double InputGradosJOptionPane(String mensaje) {
        InputGrados(mensaje, 2);
        return this.getNumero();
    }

    private void InputGrados(String mensaje, int tipo) {
        Boolean validar = false;
        FuctionString fs = new FuctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
     public Double InputGradoFahrenheitScanner(String mensaje) {
              InputGrados(mensaje,1);
        

    
}
