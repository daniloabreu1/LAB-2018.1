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
public class Pedido {
    private String descriacao;
    private Cliente comprador;
    private int codigo;

    public String getDescriacao() {
        return descriacao;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public Pedido(String descricao, Cliente cliente, int codigo){
        this.codigo=codigo;
        this.comprador=cliente;
        this.descriacao=descricao;
    }

    @Override
    public String toString() {
        return "Pedido{" + "descriacao= " + descriacao + ", comprador= " + comprador + ", codigo= " + codigo + '}';
    }
    
    
}
