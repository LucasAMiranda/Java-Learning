package com.IvanaBandeira.operadores;

import java.util.Scanner;

public class OperadoresLogicosRelacionais {

	public static void main(String[] args) {
		
		int a , b  , c;
		
		boolean x; 
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Informe o primeiro valor: ");
		
		a = input.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		
		b = input.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		
		c = input.nextInt();
		
		//Implentação da lógica
		
		x = a < b; 
		
		System.out.println("Passo 1: " + x); // concatenação
		
		x = (b < a) && ( c > b); // and false && false = false
		
		
		System.out.println("Passo 2: " + x);
		
		
		x = (b == c); 
		System.out.println("Passo 3: " + x);
		

	}

}
