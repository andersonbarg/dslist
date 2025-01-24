package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController			//configura a classe como um controlador
@RequestMapping(value = "/lists") 		//mapeia o recurso para ser acessado pela url definida
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping			//configura o serviço como um GET para http
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
