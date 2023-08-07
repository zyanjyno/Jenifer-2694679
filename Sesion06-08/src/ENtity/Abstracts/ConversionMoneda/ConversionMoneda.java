/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENtity.Abstracts.ConversionMoneda;



import ENtity.Abstracts.SuperEntity;
import Utils.FunctionNumeric;
import Utils.FunctionString;


public class ConversionMoneda extends SuperEntity {
    private Double ConversionMoneda;
    private Double Conversion;
    
     //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();

    public Double getConversionMoneda() {
        return ConversionMoneda;
    }

    public void setConversionMoneda(Double ConversionMoneda) {
        this.ConversionMoneda = ConversionMoneda;
    }

    public Double getConversion() {
        return Conversion;
    }

    public void setConversion(Double Conversion) {
        this.Conversion = Conversion;
    }
    
    public void PesosCOP(){
        this.setConversionMoneda(fn.InputDoubleNumericScanner("Ingrese su dinero en COP: "));
        this.setConversion(this.getConversionMoneda()*0.00024);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"COP a USD es: "+this.getConversion()+"\n");
        this.setConversion(this.getConversionMoneda()*137.70);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"COP a VEF es: "+this.getConversion()+"\n");
        this.setConversion(this.getConversionMoneda()*1130.86);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"COP a PEN es: "+this.getConversion()+"\n");
        this.setConversion(this.getConversionMoneda()*0.036784934);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"COP a PTAS es: "+this.getConversion()+"\n");
        this.setConversion(this.getConversionMoneda()*0.000210);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"COP a PTAS es: "+this.getConversion()+"\n");
}
    
 public void PesosUSD(){
    this.setConversionMoneda(fn.InputDoubleNumericScanner("Ingrese su dinero en COP: "));
        this.setConversion(this.getConversionMoneda()*4144.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"USD a COP es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*300656.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"USD a VEF es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*367.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"USD a PEN es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*151155.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"USF a PTAS es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*087.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"USD a CHF es: "+this.getConversion()+"\n");
}   
 public void PesosVEF(){
    this.setConversionMoneda(fn.InputDoubleNumericScanner("Ingrese su dinero en COP: "));
        this.setConversion(this.getConversionMoneda()*13785.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"VEF a COP es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*0033.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+" VEF a USD es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*012190.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"VEF a PEN es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*0512566.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"VEF a PTAS es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*0294833.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"VEF a CHF es: "+this.getConversion()+"\n");
}   
 
 public void PesosPEN(){
    this.setConversionMoneda(fn.InputDoubleNumericScanner("Ingrese su dinero en COP: "));
        this.setConversion(this.getConversionMoneda()*1130.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"PEN a COP es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*027.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+" PEN a USD es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*81967.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"PEN a VEF es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*411686.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"PEN a PTAS es: "+this.getConversion()+"\n");
         this.setConversion(this.getConversionMoneda()*023810.0);
        fs.ShowScanner("La conversion de "+this.getConversionMoneda()+"PEN a CHF es: "+this.getConversion()+"\n");
}   
 
}
