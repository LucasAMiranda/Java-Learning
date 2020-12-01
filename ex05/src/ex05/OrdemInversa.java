package ex05;

public class OrdemInversa {

	public static void main(String[] args) {
		
			
			int [] vetor = {1, 2, 3};
			int [] armazena = new int [vetor.length];
			
			for(int i= 0; i<vetor.length; i++ ) {
				armazena[i] = vetor[(vetor.length - i ) - 1];
				System.out.println(armazena[i]);
			}
 	
    }
}
