package ex07;

import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		
		float resultSegundos = 0;
		
		Scanner horas = new Scanner(System.in);
		System.out.println("Informe as horas: ");
		float hora = horas.nextFloat();
		
		Scanner minutos = new Scanner(System.in);
		System.out.println("Informe os minutos: ");
		float minuto = minutos.nextFloat();
		
		Scanner segundos = new Scanner(System.in);
		System.out.println("Informe os segundos: ");
		float segundo = segundos.nextFloat();
		
		
		resultSegundos = hora + minuto + segundo;
		
	    System.out.println("O resultado de segundo depois de 00:00 é " +resultSegundos+ " segundos");
		
		
		
	}

}
