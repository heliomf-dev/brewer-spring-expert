package com.algaworks.brewer.service.event.cerveja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.brewer.storage.FotoStorage;

// Não será mais utilizado após o S3
//@Component
public class CervejaListener {

//	@Autowired
//	private FotoStorage fotoStorage;
	
//	@EventListener(condition = "#evento.temFoto() and #evento.isFotoNova()")
//	public void cervejaSalva(CervejaSalvaEvent evento) {
//		fotoStorage.salvar(evento.getCerveja().getFoto());
//	}
}
