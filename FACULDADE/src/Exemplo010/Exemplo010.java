package Exemplo010;

public class Exemplo010 {

	public static void main(String[] args) {
		
		//Instanciando os objeto p1 e p2
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		
		//Preenchimento dos atributos dos objetos p1 e p2
		
		p1.nome = "João Miranda";
		p1.telefone = "8299940-3630";
		
		p2.nome = "Cida Miranda";
		p2.telefone = "8299683-0139";
		
		//Chamada ao método exibir p1 e p2
		
		p1.exibir();
		p2.exibir();
		
	}

}
