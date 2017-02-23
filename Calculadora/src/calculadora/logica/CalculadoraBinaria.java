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
public class CalculadoraBinaria extends Calculadora{
    @Override
    public void sumar() {
        this.resultado = Integer.toBinaryString(Integer.parseInt(this.operando1, 2) +
                Integer.parseInt(this.operando2, 2));
    }

    @Override
    public void restar() {
        this.resultado = Integer.toBinaryString(Integer.parseInt(this.operando1, 2) -
                Integer.parseInt(this.operando2, 2));
    }

    @Override
    public void multiplicacion() {
        this.resultado = Integer.toBinaryString(Integer.parseInt(this.operando1, 2) *
                Integer.parseInt(this.operando2, 2));
    }

    @Override
    public void dividir() {
        this.resultado = Integer.toBinaryString(Integer.parseInt(this.operando1, 2) /
                Integer.parseInt(this.operando2, 2));
    }
    
}
