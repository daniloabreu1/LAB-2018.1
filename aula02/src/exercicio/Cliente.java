/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente {
    private String nome;
    private int codigo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public Cliente(){
    }
    
    public Cliente(int codigo){
        this.codigo= codigo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome = " + nome + ", codigo = " + codigo + '}';
    }
    
    
}
