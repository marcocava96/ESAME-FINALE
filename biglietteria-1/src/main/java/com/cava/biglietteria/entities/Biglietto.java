package com.cava.biglietteria.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp; // Import the Timestamp class

@Entity
@Table(name = "biglietti")
public class Biglietto {

	@Id
	@GeneratedValue
	private long cod_operazione;

	// FOREIGN KEY CHE FA RIFERIMENTO A ID TABELLA CLIENTI
	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;

	// FOREIGN KEY CHE FA RIFERIMENTO A ID TABELLA REPLICHE
	@ManyToOne
	@JoinColumn(name = "cod_replica")
	private Replica replica;

//	//FIXARE PROBLEMA CON DATA
//	@JsonProperty("callEndTime")
//	@Column(name = "data_prenotazione")
//	@JsonFormat(pattern = "yyyy-MM-dd")
//	private Date data;

//	@JsonProperty("callEndTime")
//	@Column(name = "data_prenotazione")
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//	private Timestamp data_prenotazione; // Change the data type to java.sql.Timestamp
	
//	@JsonProperty()
	@Column(name = "data_prenotazione")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime data_prenotazione; // Change the data type to java.sql.Timestamp

	@Column
	private String tipo_pagamento;

	@Column
	private long quantita;

	public long getCod_operazione() {
		return cod_operazione;
	}

	public void setCod_operazione(long cod_operazione) {
		this.cod_operazione = cod_operazione;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}



	public LocalDateTime getData_prenotazione() {
		return data_prenotazione;
	}

	public void setData_prenotazione(LocalDateTime data_prenotazione) {
		this.data_prenotazione = data_prenotazione;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public long getQuantita() {
		return quantita;
	}

	public void setQuantita(long quantita) {
		this.quantita = quantita;
	}

	

}
