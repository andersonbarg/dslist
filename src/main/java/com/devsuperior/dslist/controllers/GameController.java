package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController			//configura a classe como um controlador
@RequestMapping(value = "/games") 		//mapeia o recurso para ser acessado pela url definida
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping			//configura o serviço como um GET para http
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
}
