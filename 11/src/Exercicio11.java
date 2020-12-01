
public class Exercicio11 {

	public static void main(String[] args) {
		
		int data = 28092020; //ddmmaa
		
		int dia, mes, ano;
		
		ano = data % 10000; //2016
		System.out.println(ano);
		
		data = data / 10000; //1212
		
		mes = data % 100;
		System.out.println(mes);
		
		data = data / 100;
		dia = data;
		System.out.println(dia);
		
		/** 
		 * dia: 12
		 * mes 12
		 * ano 2016
		 * 
		 * */
				
	}

}
