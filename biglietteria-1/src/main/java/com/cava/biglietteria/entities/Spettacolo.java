package com.cava.biglietteria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "spettacoli")
public class Spettacolo {

	@Id
	@GeneratedValue
	private int cod_spettacolo;

	@Column
	private String titolo;

	@Column
	private String autore;

	@Column
	private String regista;

	@Column
	private double prezzo;

	// FOREIGN KEY CHE FA RIFERIMENTO A ID TABELLA TEATRI
    @ManyToOne
    @JoinColumn(name = "COD_TEATRO") 
    private Teatro cod_teatro;

	public int getCod_spettacolo() {
		return cod_spettacolo;
	}

	public void setCod_spettacolo(int cod_spettacolo) {
		this.cod_spettacolo = cod_spettacolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Teatro getCod_teatro() {
		return cod_teatro;
	}

	public void setCod_teatro(Teatro cod_teatro) {
		this.cod_teatro = cod_teatro;
	}

	

	

	

}
