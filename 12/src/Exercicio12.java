
public class Exercicio12 {

	public static void main(String[] args) {
		
		int entrada = 5600;// 1h : 33min : 20 seg
        int horas = entrada / 3600;
        int minutos = (entrada- (horas * 3600)) / 60;
        int segundos = entrada - (horas * 3600) - (minutos * 60);
        System.out.printf("Horas: %d%nMinutos: %d%nSegundos: %d%n", horas, minutos, segundos);
 

	}

}
