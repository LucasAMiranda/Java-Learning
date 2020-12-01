package ex15;

import java.util.Scanner;

public class InverterNúmeros {

	public static void main(String[] args) {
				
		Scanner ingressar = new Scanner(System.in);
		int numero, invertir = 0, div;
		System.out.println("Informe Número: ");
		numero = ingressar.nextInt();
		
		while(numero > 0) {
			div = numero % 10;
			invertir = invertir*10+div;
			numero /= 10;
		}
		
		System.out.println("O número invertido será : " +invertir);

	}

}
