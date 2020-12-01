package aula06;

public class Exemplo002 {

	public static void main(String[] args) {
		
		double soma = 0.0;
		
		for (int x = 1; x<=5; x++) {
			soma += Math.pow(x, 2);
			//eleva a base a potência 2 e acumula
			
			System.out.println(soma/5);
		}

	}

}
