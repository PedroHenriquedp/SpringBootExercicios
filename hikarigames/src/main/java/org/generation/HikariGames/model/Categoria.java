package org.generation.HikariGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 4, max = 12)
	private String genero;
	private String promocao;
	private String lancamento;
	private String maisVendido;
	private String jogoCasual;
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Jogo>jogo;
	
	//-------GETTERS AND SETTERS-------
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPromocao() {
		return promocao;
	}
	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}
	public String getLancamento() {
		return lancamento;
	}
	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	public String getMaisVendido() {
		return maisVendido;
	}
	public void setMaisVendido(String maisVendido) {
		this.maisVendido = maisVendido;
	}
	public String getJogoCasual() {
		return jogoCasual;
	}
	public void setJogoCasual(String jogoCasual) {
		this.jogoCasual = jogoCasual;
	}
}
