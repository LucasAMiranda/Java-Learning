package ex06;

import java.util.Scanner;

public class Idade100 {

	public static void main(String[] args) {
         int anos;
		
		
		Scanner entrada1  =  new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = entrada1.nextLine();
		
		Scanner entrada2  =  new Scanner(System.in);
		System.out.println("Informe seu idade: ");
		int idade = entrada2.nextInt();
		
		anos = idade + 100;
		
		System.out.println("Seja bem vindo ao seus " +anos+ " anos");


	}

}
