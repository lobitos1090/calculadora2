/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author labing506
 */
public class CalculadoraHexadeci extends Calculadora {

    @Override
   public void sumar() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 16) +
                Integer.parseInt(this.operando2, 16));
    }

    @Override
    public void restar() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 16) -
                Integer.parseInt(this.operando2, 16));
    }

    @Override
    public void multiplicacion() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 16) *
                Integer.parseInt(this.operando2, 16));
    }

    @Override
    public void dividir() {
        this.resultado = Integer.toHexString(Integer.parseInt(this.operando1, 16) /
                Integer.parseInt(this.operando2, 16));
    }
    
}
