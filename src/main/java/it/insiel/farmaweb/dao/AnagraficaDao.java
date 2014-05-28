package it.insiel.farmaweb.dao;

import it.insiel.farmaweb.models.Paziente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnagraficaDao extends JpaRepository<Paziente, Integer>{

	@Query
}
