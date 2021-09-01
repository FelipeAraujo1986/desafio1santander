package br.com.bootcamp.santander.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bootcamp.santander.model.JornadaTrabalho;
import br.com.bootcamp.santander.repository.JornadaRepository;

@Service
public class JornadaService {
	
	JornadaRepository jornadarepository;
	
	@Autowired
	public JornadaService(JornadaRepository jornadarepository) {
		this.jornadarepository = jornadarepository;
	}
	
	public JornadaTrabalho salvaJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadarepository.save(jornadaTrabalho);
	}

}
