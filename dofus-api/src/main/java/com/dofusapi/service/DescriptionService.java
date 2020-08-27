package com.dofusapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dofusapi.dao.DescriptionRepository;
import com.dofusapi.domaine.Description;

@Service
public class DescriptionService implements IDescriptionService {

	@Autowired
	private DescriptionRepository descriptionRepository; 
	
	@Override
	public Description saveDescription(Description description) {
		// TODO Auto-generated method stub
		return descriptionRepository.save(description);
	}

	@Override
	public List<Description> getAllDescriptions() {
		// TODO Auto-generated method stub
		return descriptionRepository.findAll();
	}

	@Override
	public Description getByIdDescription(int id) {
		// TODO Auto-generated method stub
		return descriptionRepository.getOne(id);
	}

}
