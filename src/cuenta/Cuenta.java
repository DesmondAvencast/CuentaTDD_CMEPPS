/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author H
 */
public class Cuenta {

    private double saldo;
    private String nCuenta;
    
    public Cuenta(double saldo, String cuenta){
        this.saldo=saldo;
        this.nCuenta=cuenta;
    }
    
    public void Retirada(double retirada) throws Exception{
        if(retirada<=0){
            throw new Exception("No se puede retirar una cantidad Negativa");
        }
        else if(this.getSaldo()<retirada){
            throw new Exception("Saldo insuficiente");
        }
        else{
            saldo=saldo-retirada;
        }
    }
    
    public void Ingreso(double ingreso) throws Exception{
        if(ingreso<=0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        else{
            saldo=saldo+ingreso;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getCuenta(){
        return nCuenta;
    }
    
}
