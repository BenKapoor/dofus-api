package com.dofusapi.domaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int ankamaId;
	private String nom;
	private String url_off;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Description description;
	
	@ManyToMany
	@JoinTable(
			name = "role_rattache",
			joinColumns = @JoinColumn(name = "classe_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	Set<Role> rattacherRoles;
	
	@OneToMany(mappedBy = "classe")
	private Collection<Sort> sorts = new ArrayList<Sort>();
	
	private String images_masc;
	private String images_fem;
	
}
