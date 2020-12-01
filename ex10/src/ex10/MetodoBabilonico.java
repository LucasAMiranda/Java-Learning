package ex10;

import java.util.Scanner;

public class MetodoBabilonico {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int entrada;
		double resultado;
		double soma;
		double divisao;
		
		System.out.println("Digite um número e retorne sua raiz quadrada ");
		entrada = numero.nextInt();
		
		resultado = Math.sqrt(entrada);
		System.out.println(resultado);
		
		soma = entrada + resultado;
		System.out.println(soma);
		
		divisao = entrada / resultado;
		System.out.println(divisao);
		

	}

}
