package com.dofusapi.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author benja
 *	Classe {@link Description}
 */
@Entity
public class Description {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Lob // permet d'insérer au delà de 255 charactères
	private String contenu;

	/**
	 * Constructeur par défaut 
	 */
	public Description() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contenu
	 */
	public Description(String contenu) {
		super();
		this.contenu = contenu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
}
