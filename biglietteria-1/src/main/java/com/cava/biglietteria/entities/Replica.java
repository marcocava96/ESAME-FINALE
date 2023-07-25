package com.cava.biglietteria.entities;

import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "repliche")
public class Replica {

	@Id
	@GeneratedValue
	private int cod_replica;

	// FOREIGN KEY CHE FA RIFERIMENTO A ID TABELLA SPETTACOLI
	@ManyToOne
	@JoinColumn(name = "COD_SPETTACOLO")
	private Spettacolo cod_spettacolo;

	
	
	//POSSIBILE PROBLEMA CON DATA
//	@JsonProperty("callEndTime")
	@Column(name = "DATA_REPLICA")
//	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date data_replica;

	public int getCod_replica() {
		return cod_replica;
	}

	public void setCod_replica(int cod_replica) {
		this.cod_replica = cod_replica;
	}

	public Spettacolo getCod_spettacolo() {
		return cod_spettacolo;
	}

	public void setCod_spettacolo(Spettacolo cod_spettacolo) {
		this.cod_spettacolo = cod_spettacolo;
	}

	public Date getData_replica() {
		return data_replica;
	}

	public void setData_replica(Date data_replica) {
		this.data_replica = data_replica;
	}

}
