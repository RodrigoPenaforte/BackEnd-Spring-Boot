package com.site.agencia.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.site.agencia.entities.Escolha;
import com.site.agencia.entities.Pagamento;

public interface EscolhaRepository extends JpaRepository<Escolha,Long> {

	
	

}
