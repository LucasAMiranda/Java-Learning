package ex13;

import java.util.Scanner;

public class N�meros {

	public static void main(String[] args) {
		
		int num1, num2, dobro;
		double num3, triplo, cubo;
		
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		num1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.println("Informe o segundo n�mero: ");
		num2 = n2.nextInt();
		
		Scanner n3 = new Scanner(System.in);
		System.out.println("Informe o segundo n�mero: ");
		num3 = n3.nextDouble();
		
		dobro =  (num1 * 2) / num2;
		triplo = (num1 * 3) + num3;
		cubo = Math.pow(num3, 3);
		
		System.out.println(dobro);
		System.out.println(triplo);
		System.out.println(cubo);
		
		

	}

}
