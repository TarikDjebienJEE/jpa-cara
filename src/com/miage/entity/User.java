package com.miage.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String nom;
	private String motDePasse;
	private String adressePostale;
	private String adresseElectronique;
	
	@OneToMany(mappedBy="acheteur")
	private Collection<Article> articlesAchetes ;  
	
	@OneToMany(mappedBy="vendeur")
	private Collection<Article> articlesVendues ;  	
	
	public User() {
		super();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the adressePostale
	 */
	public String getAdressePostale() {
		return adressePostale;
	}

	/**
	 * @param adressePostale the adressePostale to set
	 */
	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	/**
	 * @return the adresseElectronique
	 */
	public String getAdresseElectronique() {
		return adresseElectronique;
	}

	/**
	 * @param adresseElectronique the adresseElectronique to set
	 */
	public void setAdresseElectronique(String adresseElectronique) {
		this.adresseElectronique = adresseElectronique;
	}

	/**
	 * @return the articlesAchetes
	 */
	public Collection<Article> getArticlesAchetes() {
		return articlesAchetes;
	}

	/**
	 * @param articlesAchetes the articlesAchetes to set
	 */
	public void setArticlesAchetes(Collection<Article> articlesAchetes) {
		this.articlesAchetes = articlesAchetes;
	}

	/**
	 * @return the articlesVendues
	 */
	public Collection<Article> getArticlesVendues() {
		return articlesVendues;
	}

	/**
	 * @param articlesVendues the articlesVendues to set
	 */
	public void setArticlesVendues(Collection<Article> articlesVendues) {
		this.articlesVendues = articlesVendues;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
