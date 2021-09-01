package br.com.bootcamp.santander.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bootcamp.santander.model.JornadaTrabalho;
import br.com.bootcamp.santander.service.JornadaService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

	@Autowired
	JornadaService jornadaService;

	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaService.salvaJornada(jornadaTrabalho);
	}

}
