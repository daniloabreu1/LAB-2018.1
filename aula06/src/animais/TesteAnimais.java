/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Danilo Abreu
 */


public class TesteAnimais {
    static void somAnimal(Animal a){
        System.out.println(a.emitirSom());
    }
    
    static void acaoAnimal(Animal a){
        System.out.println(a.acao());
    }
    
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Cavalo pocoto = new Cavalo();
        Preguica pregui = new Preguica();
        
        dog.setIdade(5);
        dog.setNome("rex");
        
        pocoto.setIdade(18);
        pocoto.setNome("argo");
        
        pregui.setIdade(8);
        pregui.setNome("jaiminho");
        
        somAnimal(dog);
        somAnimal(pocoto);
        somAnimal(pregui);
        
        acaoAnimal(dog);
        acaoAnimal(pocoto);
        acaoAnimal(pregui);
    }
}
