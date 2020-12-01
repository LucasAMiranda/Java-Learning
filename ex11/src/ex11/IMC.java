package ex11;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		float imc;
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Informe seu peso: ");
		float peso = entrada1.nextFloat();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		float altura = entrada2.nextFloat();
		
		imc = (peso ) / (altura * altura);
		
		System.out.println("Seu IMC é de " +imc+ " kg");

	}

}
