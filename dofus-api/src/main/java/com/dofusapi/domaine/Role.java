package com.dofusapi.domaine;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String libelle;
	private String image;

	@OneToOne(cascade = CascadeType.ALL)
	private Description description;
	
	@ManyToMany(mappedBy = "rattacherRoles")
	private Set<Classe> rattacher;
}
