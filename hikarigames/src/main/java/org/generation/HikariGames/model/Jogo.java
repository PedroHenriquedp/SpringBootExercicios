package org.generation.HikariGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double preco;
	@Size(min = 5, max = 12)
	private String codigoBarra;
	@Size(min = 30, max = 300 )
	private String descricao;
	@Size(max = 3)
	private String faixaEtaria;
	private Boolean jogoDigital;
	private Boolean multiplayer;
	private Boolean crossplayer;
	@ManyToOne
	@JsonIgnoreProperties
	private Categoria categoria;
	
	//-------GETTERS AND SETTERS-------
	

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getJogoDigital() {
		return jogoDigital;
	}
	public void setJogoDigital(Boolean jogoDigital) {
		this.jogoDigital = jogoDigital;
	}
	public Boolean getMultiplayer() {
		return multiplayer;
	}
	public void setMultiplayer(Boolean multiplayer) {
		this.multiplayer = multiplayer;
	}
	public Boolean getCrossplayer() {
		return crossplayer;
	}
	public void setCrossplayer(Boolean crossplayer) {
		this.crossplayer = crossplayer;
	}
	
	
	
	

}
