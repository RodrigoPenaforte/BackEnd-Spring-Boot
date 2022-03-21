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

import com.site.agencia.entities.Pagamento;
import com.site.agencia.repositorys.PagamentoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	// GET
	@GetMapping
	public ResponseEntity<List<Pagamento>> findAll() {
		
		List<Pagamento> pagamentos = pagamentoRepository.findAll();
		
		return ResponseEntity.ok().body(pagamentos);
	}
	
	// GET por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pagamento> findById(@PathVariable Long id) {
		
		Pagamento pagamento = pagamentoRepository.findById(id).get();
		
		return ResponseEntity.ok().body(pagamento);
	}
	
	// CREATE
    @PostMapping
    public Pagamento create(@RequestBody Pagamento pagamento) {
    	
        return pagamentoRepository.save(pagamento);
    }
    
    // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<Pagamento> update(@PathVariable long id,@RequestBody Pagamento PagamentoDetails) {
    	Pagamento updatePagamento = pagamentoRepository.findById(id).get();

    	updatePagamento.setCartao(PagamentoDetails.getCartao());
    	updatePagamento.setParcela(PagamentoDetails.getParcela());
    	updatePagamento.setPix(PagamentoDetails.getPix());
    	updatePagamento.setPreco_viagem(PagamentoDetails.getPreco_viagem());

        pagamentoRepository.save(updatePagamento);

        return ResponseEntity.ok(updatePagamento);
    }

    // DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable long id) {

    	Pagamento pagamento= pagamentoRepository.findById(id).get();

    	pagamentoRepository.delete(pagamento);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    
}