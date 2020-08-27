package com.dofusapi.service;

import java.util.List;

import com.dofusapi.domaine.Description;

public interface IDescriptionService {
	public Description saveDescription(Description description);
	
	public List<Description> getAllDescriptions();
	
	public Description getByIdDescription(int id);
}
