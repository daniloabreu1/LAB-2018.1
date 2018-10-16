package scr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class Comum extends Funcionario{

     private static double abono;
    
    public void setSalario(double d) {
        this.salario=d;
    }

    public double getSalario() {
        return this.salario+abono;
    }

    public static void setAbono(double d) {
        abono=d;
    }
    
}
