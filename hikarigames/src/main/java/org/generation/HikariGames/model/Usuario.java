package org.generation.HikariGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name="tb_usuarios")
public class Usuario {

	//------------------------ATRIBUTOS----------------------------
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//ID
	private Long id;
	
	//NOME
	@NotBlank
	private String nome;
	
	//FOTO
	private String foto;
		
	//USUARIO
	@Email
	@NotBlank(message = "Escreva um usuário!!!")
	private String usuario;
	
	//SENHA
	@NotBlank(message = "A Senha deve ter no mínimo 8 caractéres!!!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres!!!")
	private String senha;
	//FOREIGN KEY
	@JsonIgnoreProperties("usuario")
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	private List<Jogo> jogo	;

	//-----------------------GETTERS AND SETTERS-----------------------

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
