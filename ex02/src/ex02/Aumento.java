package ex02;

import java.util.Scanner;
public class Aumento {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário base R$: ");
		double novoSal = teclado.nextDouble();
		
		double salAumento = novoSal *  0.10;
		
		System.out.println("O seu novo salario com aumento é R$ " +salAumento);
		
		
		
		

	}

}
