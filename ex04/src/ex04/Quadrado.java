package ex04;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Informe um número qualquer: ");
		int quadrado = num.nextInt();
		
		quadrado *=  2;
		
		System.out.println("O quadrado do número é " +quadrado);
		
		

	}

}
