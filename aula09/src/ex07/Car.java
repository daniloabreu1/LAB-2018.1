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
public class Car implements CarbonFootPrint{
    private String combustivel;
    private float cilindros;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getCilindros() {
        return cilindros;
    }

    public void setCilindros(float cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public double getCarbonFootPrint() {
        return 1;
    }
    
    
    
}
