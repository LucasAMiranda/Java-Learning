package ex15;

import java.util.Scanner;

public class InverterN�meros {

	public static void main(String[] args) {
				
		Scanner ingressar = new Scanner(System.in);
		int numero, invertir = 0, div;
		System.out.println("Informe N�mero: ");
		numero = ingressar.nextInt();
		
		while(numero > 0) {
			div = numero % 10;
			invertir = invertir*10+div;
			numero /= 10;
		}
		
		System.out.println("O n�mero invertido ser� : " +invertir);

	}

}
