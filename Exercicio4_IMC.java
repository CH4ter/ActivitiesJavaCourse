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
public class Exercicio4_IMC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float peso, altura, imc;
        String nome;

        System.out.println("IMC");
        System.out.println("Informe seu nome");

        nome = scan.next();

        System.out.println("Informe sua altura em centimetros");

        altura = scan.nextFloat();

        System.out.println("Agora informe seu peso");

        peso = scan.nextFloat();

        imc = peso/((altura/100)*(altura/100));

        System.out.println(nome+", pesa "+peso+"kg, tem "+((altura)/100)+"m de altura e seu imc eh: "+imc);
    }

}
