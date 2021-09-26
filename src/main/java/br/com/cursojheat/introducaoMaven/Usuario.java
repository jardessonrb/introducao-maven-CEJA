package br.com.cursojheat.introducaoMaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	public Usuario(Long id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return"usuario@jrs.com.br";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return "usuario123456";
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
