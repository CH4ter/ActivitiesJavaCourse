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
public class Exercicio3_Medias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float nota11,nota12,nota21,nota22;
        float media1,media2;
        String disciplina;
        
        System.out.println("informe a disciplina");
        disciplina = scan.next();
        
        System.out.println("informe as duas notas da primeira unidade");
        
        nota11 = scan.nextFloat();
        nota12 = scan.nextFloat();
        
        media1 = (nota12 + nota11)/2;
        
        System.out.println("informe as notas da segunda unidade");
        
        nota22 = scan.nextFloat();
        nota21 = scan.nextFloat();
        
        media2 = (nota21 + nota22)/2;
        
        
        System.out.println("Discplina : "+ disciplina +" || Media 1 unid: "+ media1);
        System.out.println("Discplina : "+ disciplina +" || Media 2 unid: "+ media2);
        
        
  
        scan.close();
    }
    
}
