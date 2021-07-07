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
public class Exer03 {
    
    public static void main (String[] args){
        
        //Faça um Programa que peça dois numeros e imprima a soma.
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("A some dos numeros é: " + resultado);
        
        
        
    }
    
}
