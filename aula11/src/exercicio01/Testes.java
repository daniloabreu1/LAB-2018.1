package exercicio01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Danilo Abreu
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente();
        c1.setNome("danilo");
        Cliente c2 = new Cliente();
        c2.setNome("maria");
        Cliente c3 = new Cliente();
        c3.setNome("pedro");
        
        Cliente c4 = new Cliente();
        c4.setNome("hugo");
        
        Cadastrar lista = new Cadastrar();
        try {
            lista.inserirCliente(c1);
        } catch (Excecoes ex) {
            System.out.println(ex.getMessage());
        }
        try {
            lista.inserirCliente(c2);
        } catch (Excecoes ex) {
            System.out.println(ex.getMessage());
        }
        try {
            lista.inserirCliente(c3);
        } catch (Excecoes ex) {
            System.out.println(ex.getMessage());
        }
         try {
            lista.inserirCliente(c4);
        } catch (Excecoes ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(lista.buscarCliente("maria").getNome());
        } catch (Excecoes ex) {
            System.out.println(ex.getMessage());
        }
    }

}
