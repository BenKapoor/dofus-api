package com.dofusapi.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.dofusapi.dao.DescriptionRepository;
import com.dofusapi.domaine.Description;
import com.dofusapi.service.DescriptionService;

public class DescriptionServiceTest {

	@Mock
	private DescriptionRepository descriptionRepository;
	
	@Autowired
	@InjectMocks
	private DescriptionService descriptionService;
	
	@BeforeEach
	public void setupMock() {
		MockitoAnnotations.initMocks(this); // Cette méthode initialise également les objets simulés lors de
											// l'initialisation des tests junit.
	}
	
	@Test
	public void saveDescriptionTest() {
		Description description = new Description();
		description.setId(1);
		description.setContenu("contenu");
		
		descriptionService.saveDescription(description);
		verify(descriptionRepository, times(1)).save(description);
	}
	
	@Test
	public void getAllDescriptionTest() {
		List<Description>list = new ArrayList<Description>();
		
		// Création de 3 factures
		Description desc1 = new Description("Conetnu 1");
		Description desc2 = new Description("Contenu 2");
		Description desc3 = new Description("Contenu 3");
		
		// Ajout des factures à la liste
		list.add(desc1);
		list.add(desc2);
		list.add(desc3);
		
		when(descriptionService.getAllDescriptions()).thenReturn(list);
		
		// test
		List<Description> listDescriptions = descriptionRepository.findAll();
		
		assertEquals(3, listDescriptions.size());
		verify(descriptionRepository, times(1)).findAll();
	}
	
	@Test
	public void getDescriptionByIdTest() {
		Integer descriptionId = new Integer(1);
		
		Description description = new Description();
		description.setId(descriptionId);
		description.setContenu("contenu");
		
		when(descriptionService.getByIdDescription(descriptionId)).thenReturn(description);
		
		//test
		Description descriptionTest = descriptionRepository.getOne(descriptionId);
		
		verify(descriptionRepository, times(1)).getOne(descriptionId);
		assertEquals(description, descriptionTest);

		assertEquals("contenu", descriptionTest.getContenu());
	}
}
