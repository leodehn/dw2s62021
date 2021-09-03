package com.dw2s6.ctl_fin.domain.model;

import java.util.Objects;

public class Cliente {
	//código, nome, e-mail e telefone
	private int codigo;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(int codigo, String nome, String email, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, email, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return codigo == other.codigo && Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
	
}
