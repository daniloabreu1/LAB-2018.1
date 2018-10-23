package arquivos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class main {
    private static Scanner s = new Scanner(System.in); 
    static int  menu(){
        System.out.println("1 - Para inserir um novo Cliente");
        System.out.println("2 - Para listar os clientes");
        System.out.println("3 - Para remover um cliente");
        System.out.println("0 - Para sair");
        System.out.print("OPÇÃO >>> ");
        return s.nextInt();
    }
    public static void main(String[] args) {
        int o;
        Intermediaria.criarArquivo();
        while((o=menu())!=0){
            
            switch(o){
                case 1:
                    Intermediaria.inserirCliente();
                    break;
                case 2:
                    s.nextLine();
                    Intermediaria.imprimirClientes();
                    break;
                case 3:
                    s.nextLine();
                    Intermediaria.removerCliente();
                    break;
                default:
                    s.nextLine();
                    System.out.println("Opção Inválida");
            }
        }
    }
    
}
