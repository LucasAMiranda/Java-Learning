package ex03;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int n1 = teclado1.nextInt();
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Informe o segundo número: ");
		int n2 = teclado2.nextInt();
		
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("Informe o terceiro número: ");
		int n3 = teclado3.nextInt();
		
		double media =  (n1 + n2 + n3 )/ 3;
		
		System.out.println("A média da soma entre os números é de " +media);
		
		

	}

}
