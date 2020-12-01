package com.aula.construtores;

public class Professional extends Pessoa {

	String profissao;
	
	Professional(String nome, String telefone, String profissao){
		super(nome, telefone);
		this.profissao = profissao;
	}
	
	@Override
	public void exibir() {
		super.exibir();
		//Chama exibir de Pessoa , imprimindo nome e telefone 
		System.out.println("\tTrabalha como " +profissao);
		//complemento da informação acerca da profissão
	}
	
}
