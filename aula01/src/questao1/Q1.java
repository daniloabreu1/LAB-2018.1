/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class Q1 {
    
    static int getNumero(){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro ");
        n = s.nextInt();
        return n;
    }
    static void imprimir(int a, int b){
        int aux;
        if(a>b){
            aux=a;
            a=b;
            b=aux;
        }
        for (; a < b; a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
    public static void main(String[] args) {  
        int a, b;
        a=getNumero();
        b=getNumero();
        imprimir(a, b);
    }
}
