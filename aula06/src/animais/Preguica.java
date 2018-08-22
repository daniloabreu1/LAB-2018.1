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
public class Preguica extends Animal{
  @Override
    public String emitirSom(){
        return super.emitirSom()+"haaaaaa";
    }
    
    @Override
    public String acao(){
        return super.acao()+"subindo em árvores";
    }   
}
