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
	 private String endereco;
	 
	 public Cartorio() {}

	public Cartorio(int id, String nome, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cartorio [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	 
	 
}
