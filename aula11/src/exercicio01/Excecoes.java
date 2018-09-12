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
public class Excecoes extends Exception{
    String msg;
    public Excecoes(String msg) {
        super(msg);
        this.msg=msg;
    }
    
    public static class NaoCadastrado extends Excecoes{

        public NaoCadastrado() {
            super("nao encontrado");
        }     
    }
    public static class LimiteCadastro extends Excecoes{

        public LimiteCadastro() {
            super("nao pode cadastrar mais objetos");
        }    
    }
}
