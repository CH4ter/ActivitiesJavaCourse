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
public class Exercicio1_Operacoes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float a, b, soma, sub, mult, div;

        System.out.println("Digite dois numeros :");
        a = scan.nextFloat();
        b = scan.nextFloat();

        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;

        System.out.println((a)+" + "+(b)+" = "+ (soma));
        System.out.println((a)+" - "+(b)+" = "+ (sub));
        System.out.println((a)+" * "+(b)+" = "+ (mult));
        System.out.println((a)+" : "+(b)+" = "+ (div));

        scan.close();
    }
}
