package com.site.agencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.site.agencia.entities.Escolha;
import com.site.agencia.repositorys.EscolhaRepository;
import com.site.agencia.entities.Pagamento;
import com.site.agencia.repositorys.PagamentoRepository;

@SpringBootApplication
public class AgenciaApplication implements CommandLineRunner {
	
	@Autowired
	private EscolhaRepository escolhaRepository;
	
	
	@SuppressWarnings("unused")
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	
	
	public static void main (String[] args) {
		SpringApplication.run(AgenciaApplication.class, args);
		
	}
		
	

	@Override
	public void run(String... args) throws Exception {
		
		Escolha a1 = new Escolha(0,null, "Rio de janeiro", null, null);
		Escolha a2 = new Escolha(0,null,"São Paulo", null, null);
		Escolha a3 = new Escolha(0,null,"21:00", null, null);	
		Escolha a4 = new Escolha(0,null,"Dezembro", null, null);	
		
		escolhaRepository.save(a1);
		escolhaRepository.save(a2);
		escolhaRepository.save(a3);
		escolhaRepository.save(a4);
		

		Pagamento e1 = new Pagamento(0,null, "Credito/Debito", null, null);
		Pagamento e2 = new Pagamento(0,null,"12x de R$:349,00", null, null);
		Pagamento e3 = new Pagamento(0,null,"Pix/CPF: xxxxxxx-xx/Celular: xxxx-xxxx", null, null);	
		Pagamento e4 = new Pagamento(0,null,"Valor XY", null, null);	
		
		escolhaRepository.save(e1);
		escolhaRepository.save(e2);
		escolhaRepository.save(e3);
		escolhaRepository.save(e4);
		
	}
		
		

	
	

}
