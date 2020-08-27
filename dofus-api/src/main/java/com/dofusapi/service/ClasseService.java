package com.dofusapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dofusapi.dao.ClasseRepository;
import com.dofusapi.domaine.Classe;

@Service
public class ClasseService implements IClasseService {

	@Autowired
	private ClasseRepository classeRepository;
	
	@Override
	public Classe saveClasse(Classe classe) {
		// TODO Auto-generated method stub
		return classeRepository.save(classe);
	}

	@Override
	public List<Classe> getAllClasses() {
		// TODO Auto-generated method stub
		return classeRepository.findAll();
	}

	@Override
	public Classe getByIdClasse(int id) {
		// TODO Auto-generated method stub
		return classeRepository.getOne(id);
	}

}
