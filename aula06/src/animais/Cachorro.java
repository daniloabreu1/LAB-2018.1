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
public class Cachorro extends Animal{
    
    
    @Override
    public String emitirSom(){
        return super.emitirSom()+"au au au";
    }
    
    @Override
    public String acao(){
        return super.acao()+"correndo";
    }
}
