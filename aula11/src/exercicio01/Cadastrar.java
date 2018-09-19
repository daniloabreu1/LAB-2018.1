package exercicio01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exercicio01.Excecoes.LimiteCadastro;
import exercicio01.Excecoes.NaoCadastrado;

/**
 *
 * @author Danilo Abreu
 */
public class Cadastrar {
    private final Cliente[] clientes = new Cliente[3];
    private int i=0;
    
    public void inserirCliente(Cliente c)throws Excecoes{
        if(i<3){
            clientes[i]=c;
            i++;
        }else{
            throw new LimiteCadastro();
        }      
    }
    
    public Cliente buscarCliente(String nome) throws Excecoes{
        for(int n=0;n<3;n++){
            if(clientes[n].getNome().equals(nome))
                return clientes[n];
        }
        throw new NaoCadastrado();
    }
    public void listar(){
        for(int n=0;n<3;n++){
            System.out.println(clientes[n].getNome());
        }
    }
}
