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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Digite um numero inteiro ");
            a = s.nextInt();
            System.out.print("Digite um numero inteiro ");
            b = s.nextInt();
        } while (a >= b);
        for (; a < b; a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}
