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
	/**
	 * @param ankamaId
	 * @param nom
	 * @param url_off
	 * @param description
	 * @param rattacherRoles
	 * @param sorts
	 * @param images_masc
	 * @param images_fem
	 */
	public Classe(int ankamaId, String nom, String url_off, Description description, Set<Role> rattacherRoles,
			Collection<Sort> sorts, String images_masc, String images_fem) {
		super();
		this.ankamaId = ankamaId;
		this.nom = nom;
		this.url_off = url_off;
		this.description = description;
		this.rattacherRoles = rattacherRoles;
		this.sorts = sorts;
		this.images_masc = images_masc;
		this.images_fem = images_fem;
	}
	/**
	 * 
	 */
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classe [ankamaId=" + ankamaId + ", nom=" + nom + ", url_off=" + url_off + ", description=" + description
				+ ", rattacherRoles=" + rattacherRoles + ", sorts=" + sorts + ", images_masc=" + images_masc
				+ ", images_fem=" + images_fem + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnkamaId() {
		return ankamaId;
	}
	public void setAnkamaId(int ankamaId) {
		this.ankamaId = ankamaId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUrl_off() {
		return url_off;
	}
	public void setUrl_off(String url_off) {
		this.url_off = url_off;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	public Set<Role> getRattacherRoles() {
		return rattacherRoles;
	}
	public void setRattacherRoles(Set<Role> rattacherRoles) {
		this.rattacherRoles = rattacherRoles;
	}
	public Collection<Sort> getSorts() {
		return sorts;
	}
	public void setSorts(Collection<Sort> sorts) {
		this.sorts = sorts;
	}
	public String getImages_masc() {
		return images_masc;
	}
	public void setImages_masc(String images_masc) {
		this.images_masc = images_masc;
	}
	public String getImages_fem() {
		return images_fem;
	}
	public void setImages_fem(String images_fem) {
		this.images_fem = images_fem;
	}	
}
