package com.dofusapi.service;

import java.util.List;

import com.dofusapi.domaine.Classe;

public interface IClasseService {
	public Classe saveClasse(Classe classe);
	
	public List<Classe> getAllClasses();
	
	public Classe getByIdClasse(int id);
}
