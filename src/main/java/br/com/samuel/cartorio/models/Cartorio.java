package br.com.samuel.cartorio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartorio {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	 private String nome;
	 
	 
	 public Cartorio() {}
	

	public Cartorio(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Cartorio [id=" + id + ", nome=" + nome + "]";
	}
	 

}
