package com.dofusapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dofusapi.domaine.Classe;
import com.dofusapi.service.ClasseService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/classe")
public class ClasseController {

	@Autowired
	private ClasseService classeService;
	
	/**
	 * @return
	 * Route du controller permettant d'afficher la liste de toutes les factures
	 */
	@ApiOperation(value = "Lister les factures")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(path="/", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Classe> getAllClasses(){
		return classeService.getAllClasses();
	}
	
	/**
	 * @return
	 * Route du controller permettant d'afficher la liste de toutes les factures
	 */
	@ApiOperation(value = "Afficher une facture selon son id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved facture"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Classe getClasseById(@PathVariable("id") int id) {
		return classeService.getByIdClasse(id);
	}
}
