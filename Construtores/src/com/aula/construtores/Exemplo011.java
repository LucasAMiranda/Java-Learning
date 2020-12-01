package com.aula.construtores;

public class Exemplo011 {

	public static void main(String[] args) {

		//Instanciando e Inicializando os objetos p1 e p2
		
		Pessoa p1 = new Pessoa("João", "8299940-3630");
		Pessoa p2 = new Pessoa("Maria", "8299683-0139");
		
		
		//Chamada ao método exibir
		
		p1.exibir();
		p2.exibir();

	}

}
