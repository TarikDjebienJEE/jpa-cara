package com.miage.entity;
import java.io.Serializable;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Article
 * @author tarik
 * @author Eric
 */
@Entity
public class Article implements Serializable {

	   
	/**
	 * 
	 */
	private static final long serialVersionUID = 715897864L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	private Float prixVente;
	private Float montantDerniereEnchere;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private User vendeur ; 
	
	@ManyToOne(fetch=FetchType.EAGER)
	private User acheteur ; 
	

	public Article() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the prixVente
	 */
	public Float getPrixVente() {
		return prixVente;
	}

	/**
	 * @param prixVente the prixVente to set
	 */
	public void setPrixVente(Float prixVente) {
		this.prixVente = prixVente;
	}

	/**
	 * @return the montantDerniereEnchere
	 */
	public Float getMontantDerniereEnchere() {
		return montantDerniereEnchere;
	}

	/**
	 * @param montantDerniereEnchere the montantDerniereEnchere to set
	 */
	public void setMontantDerniereEnchere(Float montantDerniereEnchere) {
		this.montantDerniereEnchere = montantDerniereEnchere;
	}

	/**
	 * @return the vendeur
	 */
	public User getVendeur() {
		return vendeur;
	}

	/**
	 * @param vendeur the vendeur to set
	 */
	public void setVendeur(User vendeur) {
		this.vendeur = vendeur;
	}

	/**
	 * @return the acheteur
	 */
	public User getAcheteur() {
		return acheteur;
	}

	/**
	 * @param acheteur the acheteur to set
	 */
	public void setAcheteur(User acheteur) {
		this.acheteur = acheteur;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + "]";
	}   
	
}
