package com.site.agencia.entities;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Pagamento implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_pagamento;
	private String cartao;
	private String parcela;
	private String pix;
	private String preco_viagem;
	
	public Pagamento() {
		super();
		
		
	}
	
	public Pagamento(long id_pagamento, String cartao, String parcela, String pix, String preco_viagem) {
		super();
		this.Id_pagamento = id_pagamento;
		this.cartao = cartao;
		this.parcela = parcela;
		this.pix = pix;
		this.preco_viagem = preco_viagem;
	}

	public long getId_pagamento() {
		return Id_pagamento;
	}

	public void setId_pagamento(long id_pagamento) {
		Id_pagamento = id_pagamento;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

	public String getPreco_viagem() {
		return preco_viagem;
	}

	public void setPreco_viagem(String preco_viagem) {
		this.preco_viagem = preco_viagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	
}
	