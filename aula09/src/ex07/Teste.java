/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class Teste {
    
    public static void imprimir(List<CarbonFootPrint> l){
        for(CarbonFootPrint i:l){
            System.out.println("Valor: "+i.getCarbonFootPrint());
        }
    }
    
    public static void main(String[] args) {
        List<CarbonFootPrint> lista = new ArrayList<>();
        
        Car c1 = new Car();
        Car c2 = new Car();
        
        Bicycle m1 = new Bicycle();
        Bicycle m2 = new Bicycle();
        
        Bilding b1 = new House();
        Bilding b2 = new School();
        
        c1.setCilindros(100);
        c1.setCombustivel("flex");
        
        c2.setCilindros(200);
        c2.setCombustivel("diesel");
        
        m1.setCilindros(125);
        m2.setCilindros(250);
        
        b1.setEnergiaRenovavel(false);
        b1.setNumeroLampadas(400);
        b1.setNumeroPessoas(2000);
        b1.setUsoArCondicionado(true);
        
        b2.setEnergiaRenovavel(true);
        b2.setNumeroLampadas(100);
        b2.setNumeroPessoas(90);
        b2.setUsoArCondicionado(false);
        
        lista.add(c1);
        lista.add(b1);
        lista.add(c2);
        lista.add(b2);
        lista.add(m1);
        lista.add(m2);
        
        imprimir(lista);
    }
}
