/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class Exer04 {
    
    public static void main (String[] args){
        
        //Faça um Programa que peça as 4 notas bimestrais e mostre a media.
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com a primeira nota ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota");
        double nota2 = scan.nextDouble();
        
        System.out.println("Entre com a terceira nota");
        double nota3 = scan.nextDouble();
        
        System.out.println("Entre com a quarta nota");
        double nota4 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media é: " + media);
        
        
        
        
    }
    
}
