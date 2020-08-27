package com.dofusapi.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Sort {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String image;
	private int libelle;
	private int niveau;
	private String descriptionSort;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Classe classe;
//	private Map<String, String> caracteristiques;
}
