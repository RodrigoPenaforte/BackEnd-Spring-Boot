package com.site.agencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.agencia.entities.Escolha;
import com.site.agencia.repositorys.EscolhaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/escolhavoo")
public class EscolhaController {
	
	@Autowired
	private EscolhaRepository escolhaRepository;
	
	// GET
	@GetMapping
	public ResponseEntity<List<Escolha>> findAll() {
		
		List<Escolha> escolhavoo = escolhaRepository.findAll();
		
		return ResponseEntity.ok().body(escolhavoo);
	}
	
	// GET por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Escolha> findById(@PathVariable Long id) {
		
		Escolha escolha = escolhaRepository.findById(id).get();
		
		return ResponseEntity.ok().body(escolha);
	}
	
	// CREATE
    @PostMapping
    public Escolha create(@RequestBody Escolha escolha) {
    	
        return escolhaRepository.save(escolha);
    }
    
    // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<Escolha> update(@PathVariable long id,@RequestBody Escolha escolhaDetails) {
    	Escolha updateEscolha = escolhaRepository.findById(id).get();

    	updateEscolha.setEmbarque(escolhaDetails.getEmbarque());
    	updateEscolha.setDesembarque(escolhaDetails.getDesembarque());
    	updateEscolha.setHorario(escolhaDetails.getHorario());
    	updateEscolha.setData(escolhaDetails.getData());

        escolhaRepository.save(updateEscolha);

        return ResponseEntity.ok(updateEscolha);
    }

    // DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable long id) {

    	Escolha escolha= escolhaRepository.findById(id).get();

    	escolhaRepository.delete(escolha);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    
}