/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class FuctionNumeric {
    private Double numero;
    private int num;
    
        private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }
    //atributos enteros numeros enteros
         private int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }
    
  public Double InputNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }

    private void InputNumeric(String mensaje, int tipo) {
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
    //creamos las funciones pero enteras
    public int InputNumeriScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNum();
    }

    public int InputNumeriJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNum();
    }

    private void InputNumeri(String mensaje, int tipo) {
        Boolean validar = false;
        FuctionString fs = new FuctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNum(Integer.parseInt(fs.InputScanner(mensaje)));
                }else{
                    this.setNum(Integer.parseInt(fs.InputJOptionPane(mensaje)));
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
    // aqui finaliza


    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);

        return this.getNumero();
    }
   public Double InputNumericPositivoScanner(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < 0);

        return this.getNumero();
    }
    
   public Double InputNumericNegativosScanner(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() > 0);

        return this.getNumero();
    }
   //estas son las de los enteros
   public int InputNumeriRangeScanner(String mensaje, int min, int max) {
        do {            
            InputNumeri(mensaje,1);
        } while (this.getNum() < min || this.getNum() > max);

        return this.getNum();
    }
   
    public int InputNumeriPositivoScanner(String mensaje) {
        do {            
            InputNumeri(mensaje,1);
        } while (this.getNum() < 0);

        return this.getNum();
    }
    
   public int InputNumeriNegativosScanner(String mensaje) {
        do {            
            InputNumeri(mensaje,1);
        } while (this.getNum() > 0);

        return this.getNum();
    }

}
