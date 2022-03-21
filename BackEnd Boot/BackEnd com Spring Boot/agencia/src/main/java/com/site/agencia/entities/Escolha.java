package com.site.agencia.entities;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Escolha implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_escolha;
	private String embarque;
	private String desembarque;
	private String horario;
	private String data;
	
	public Escolha() {
		super();
		
		
	}
	
	
	public Escolha(long id_escolha, String embarque, String desembarque, String horario, String data) {
		super();
		this.Id_escolha = id_escolha;
		this.embarque = embarque;
		this.desembarque = desembarque;
		this.horario = horario;
		this.data = data;
	}


	public long getId_escolha() {
		return Id_escolha;
	}


	public void setId_escolha(long id_escolha) {
		Id_escolha = id_escolha;
	}


	public String getEmbarque() {
		return embarque;
	}


	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}


	public String getDesembarque() {
		return desembarque;
	}


	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
	
	