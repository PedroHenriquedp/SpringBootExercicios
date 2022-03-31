package org.generation.pharmacya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long codigoBarra;
	private String validade;
	private Boolean receita;
	private Double notaDoProduto;
	private Double preco;
	private String marca;
	@ManyToOne
	@JsonIgnoreProperties()
	private Categoria categoria;
	
	//------GETTERS AND SETTERS-------
	
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
	public Long getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(Long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public Boolean getReceita() {
		return receita;
	}
	public void setReceita(Boolean receita) {
		this.receita = receita;
	}
	public Double getNotaDoProduto() {
		return notaDoProduto;
	}
	public void setNotaDoProduto(Double notaDoProduto) {
		this.notaDoProduto = notaDoProduto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
	
	

	
