package entities;

import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	
	private String name;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos;
	

}
