package com.cava.biglietteria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "teatri")
public class Teatro {

	@Id
	@GeneratedValue
	private int cod_teatro;

	@Column
	private String nome;

	@Column
	private String indirizzo;

	@Column
	private String citta;

	@Column
	private String provincia;

	@Column
	private String telefono;

	@Column
	private int posti;

	public int getCod_teatro() {
		return cod_teatro;
	}

	public void setCod_teatro(int cod_teatro) {
		this.cod_teatro = cod_teatro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	

}
