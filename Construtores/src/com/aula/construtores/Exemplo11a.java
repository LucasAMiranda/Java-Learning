package com.aula.construtores;

public class Exemplo11a {

	public static void main(String[] args) {
		Pessoa[] pessoas = {
				   new Pessoa("Joao","1111-1111"),
			       new Pessoa("Maria","2222-2222"),
			       new Professional("Lucas","3333-3333","Analista de Sistemas")};
		
			    for(int i=0; i< 3; i++)
			      pessoas[i].exibir();
	}

}
