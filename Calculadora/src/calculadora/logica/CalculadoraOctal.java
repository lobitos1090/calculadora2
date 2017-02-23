/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author felip
 */
    public class CalculadoraOctal extends Calculadora {

    //@Override
   public void sumar() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 8) +
                Integer.parseInt(this.operando2, 8));
    }

    //@Override
    public void restar() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 8) -
                Integer.parseInt(this.operando2, 8));
    }

    //@Override
    public void multiplicacion() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 8) *
                Integer.parseInt(this.operando2, 8));
    }

    //@Override
    public void dividir() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 8) /
                Integer.parseInt(this.operando2, 8));
    }
    
}
   
