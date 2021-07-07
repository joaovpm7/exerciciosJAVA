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
public class Exer02 {
    
    public static void main (String[] args){
        
        //Faça um Programa que peça um numero e então mostre a mensagem O numero informado foi [numero].
        Scanner scan = new Scanner (System.in );
        
        System.out.println("Entre com um numero inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi:" + numero);
        
        
        
    }
    
    
    
    
    
}
