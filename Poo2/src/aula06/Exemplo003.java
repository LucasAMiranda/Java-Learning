package aula06;

public class Exemplo003 {

	public static void main(String[] args) {
		//instaciando objeto p1 e p2
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		//Preechimento dos atributos dos objetos p1 e p2
		
		p1.nome = "João Miranda";
		p1.telefone = "1111-1111";
		p2.nome = "Maria Aparecida";
		p2.telefone = "2222-2222";
		p1.profissao = "Servidor público aposentado";
		p2.profissao = "Dona de Casa e ex-cabeleireira";
		
		//chamada ao método exibir em p1 e p2
		
		p1.exibir();
		p2.exibir();

	}
}
