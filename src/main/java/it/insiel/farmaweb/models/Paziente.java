package it.insiel.farmaweb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="anagrafica")
public class Paziente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="COGNOME")
	private String cognome;
	
	@OneToMany(mappedBy="paziente" fetch=FetchType.EAGER)
	private Set<Prescrizione> prescrizioni;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Set<Prescrizione> getPrescrizioni() {
		return prescrizioni;
	}

	public void setPrescrizioni(Set<Prescrizione> prescrizioni) {
		this.prescrizioni = prescrizioni;
	}
	
	
	
}
