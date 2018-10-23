/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class Intermediaria {

    private static Arquivo arq;
    private static Scanner s = new Scanner(System.in);
    private static Cliente c = new Cliente();
    private static List<String> lista = new ArrayList<>();

    public static void criarArquivo() {
        arq = new Arquivo("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\aula17.txt");
    }

    public static void inserirCliente() {
        System.out.println("");
        System.out.print("Digte o nome do Cliente: ");
        c.setNome(s.nextLine());
        System.out.print("Digte o cpf do Cliente: ");
        c.setCpf(s.nextLine());
        System.out.print("Digte 1 para masculino ou 2 para feminino: ");
        int o=s.nextInt();
        if(o==1){
            c.setSexo("masculino");
        }else{
            c.setSexo("feminino");
        }
        System.out.println("");
        arq.escreverArquivo(c.toString());
        s.nextLine();
    }

    public static void imprimirClientes() {
        lista = arq.lerArquivo();
        if (lista.isEmpty()) {
            System.out.println("");
            System.out.println("Não há clientes cadastrados");
            System.out.println("");
        } else {
            System.out.println("Clientes");
            System.out.println("--------------------------------");
            for (String texto : lista) {                
                String[] split = texto.split(";");
                System.out.println("Nome: " + split[0]);
                System.out.println("CPF: " + split[1]);
                System.out.println("Sexo: " + split[2]);
                System.out.println("--------------------------------");
                System.out.println("");
            }
        }
    }
    
    public static void removerCliente(){
        lista = arq.lerArquivo();
        if (lista.isEmpty()) {
            System.out.println("");
            System.out.println("Não há clientes cadastrados");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Clientes");
            int i=1,o;
            for (String texto : lista) {                
                String[] split = texto.split(";");
                System.out.println(i+" - Nome: " + split[0]);
                i++;
            }
            System.out.print("Cliente a ser removido >>>> ");
            o=s.nextInt();
            if(o<=lista.size()){
                lista.remove(o-1);
            }
            arq.reescreverArquivo(lista);
            s.nextLine();
            System.out.println("");
        }
    }
}
