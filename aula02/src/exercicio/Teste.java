package exercicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente(234);
        c1.setNome("Maria Jose");
        System.out.println("Codigo: "+c1.getCodigo());
        System.out.println("Nome: "+c1.getNome());
        System.out.println(c1.toString());
        
        Pedido p1 = new Pedido("Nova Compra", c1,899077);
        System.out.println(p1.toString());
    }
    
}
