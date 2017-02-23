/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author LiliamC
 */
public abstract class Calculadora {
    String operando1;
    String operando2;
    String resultado;

    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }

    public String getResultado() {
        return resultado;
    }
    public abstract void sumar();
    
    public abstract void restar();
    
    public abstract void multiplicacion();
    
    public abstract void dividir();
        
}
