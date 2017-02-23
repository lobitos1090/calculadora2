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
public class CalculadoraDecimal extends Calculadora{

    @Override
    public void sumar() {
        this.resultado = String.valueOf(Integer.parseInt(this.operando1) +
                Integer.parseInt(this.operando2,10));
    }

    @Override
    public void restar() {
        this.resultado = String.valueOf(Integer.parseInt(this.operando1) -
                Integer.parseInt(this.operando2,10));
    }

    @Override
    public void multiplicacion() {
        this.resultado = String.valueOf(Integer.parseInt(this.operando1) *
                Integer.parseInt(this.operando2,10));
    }

    @Override
    public void dividir() {
        this.resultado = String.valueOf(Integer.parseInt(this.operando1) /
                Integer.parseInt(this.operando2,10));
    }
    
}
