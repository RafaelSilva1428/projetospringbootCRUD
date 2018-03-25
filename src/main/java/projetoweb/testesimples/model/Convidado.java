package projetoweb.testesimples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private int numeroAcompanhantes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAcompanhantes() {
		return numeroAcompanhantes;
	}
	public void setNumeroAcompanhantes(int numeroAcompanhantes) {
		this.numeroAcompanhantes = numeroAcompanhantes;
	}
	
}
