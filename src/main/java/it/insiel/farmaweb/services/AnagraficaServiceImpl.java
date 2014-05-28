package it.insiel.farmaweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnagraficaServiceImpl implements AnagraficaService {

		@Autowired
		AnagraficaService anagrafica;
		
		@Override
		@Transactional(readonly="true")
		public List<Paziente> elencoPazienti(){
			return null;
		}
	
}
