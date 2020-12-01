package aula06;

public class Pessoa {

	public String nome;
	public String telefone;
	public String profissao;
	
	public void exibir() {
		System.out.println(nome + "::" +telefone+ "::" +profissao);
		System.out.println("\t Trabalha como " +profissao);
		//complemento a informação acerca da profissão
	}
	
}
