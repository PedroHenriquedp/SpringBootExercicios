package org.generation.pharmacya.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String medicamentos;
	private String saude;
	private String vitaminaSuplemento;
	private String beleza;
	private String cosmetico;
	private String mamãeEbebe;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produtos>produto;

	
	//------ GETTERS AND SETTERS ------
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	public String getVitaminaSuplemento() {
		return vitaminaSuplemento;
	}

	public void setVitaminaSuplemento(String vitaminaSuplemento) {
		this.vitaminaSuplemento = vitaminaSuplemento;
	}

	public String getBeleza() {
		return beleza;
	}

	public void setBeleza(String beleza) {
		this.beleza = beleza;
	}

	public String getCosmetico() {
		return cosmetico;
	}

	public void setCosmetico(String cosmetico) {
		this.cosmetico = cosmetico;
	}

	public String getMamãeEbebe() {
		return mamãeEbebe;
	}

	public void setMamãeEbebe(String mamãeEbebe) {
		this.mamãeEbebe = mamãeEbebe;
	}

	public List<Produtos> getProduto() {
		return produto;
	}

	public void setProduto(List<Produtos> produto) {
		this.produto = produto;
	}
	
}
