package com.digital.banco.nosso.api.model;

import com.digital.banco.nosso.domain.model.StatusProposta;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PropostaModel {

	private String codigo;
	private ClienteModel cliente;
	private ContaPropostaModel conta;
	private StatusProposta statusProposta;
	private String motivo;
}