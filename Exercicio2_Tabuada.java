/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;
import java.util.Scanner;

/**
 *
 * @author John(João)Cavalcanti
 */
public class Exercicio2_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("digite um numero para ver sua tabuada");

        a = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
        scan.close();
    }
}
