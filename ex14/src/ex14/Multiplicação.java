package ex14;

import java.util.Scanner;

public class Multiplica��o {

	public static void main(String[] args) {
		
		int n, tabuada, multi;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Informe um n�mero qualquer: ");
		n = num.nextInt();
		
		for(tabuada = 1; tabuada<=10; tabuada++) {
			
			multi = n * tabuada;
			System.out.println( multi);
		}
		
	
	}

}
