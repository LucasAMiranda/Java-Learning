package com.aula.construtores;

public class Pessoa {
	
	//Permite obter o valor interno do atributo
	public String getNome(){
	    return nome;
	  }
	
	 //Permite escrever um valor nesse atributo
	  public void setNome(String nome){
	    this.nome = nome;
	  }
	  
	  public String getTelefone(){
	    return telefone;
	  }
	  
	  public void setTelefone(String telefone){
	    this.telefone = telefone;
	  }
	  
	  private String nome;
	  private String telefone;
	  public Pessoa(String nome, String telefone){
	    this.nome = nome;
	    this.telefone = telefone;
	  }
	  
	  public void exibir(){
	    System.out.println(getNome()+"::"+getTelefone());
	  }
	}

