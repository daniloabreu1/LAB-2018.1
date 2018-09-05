/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

/**
 *
 * @author Danilo Abreu
 */
public class Bicycle implements CarbonFootPrint {
    private int cilindros;

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    @Override
   public double getCarbonFootPrint(){
       return 3;
   }
}
