package com.algaworks.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.brewer.model.Usuario;
import com.algaworks.brewer.repository.Usuarios;
import com.algaworks.brewer.service.exception.UsuarioEmailJaCadastradoException;

@Service
public class CadastroUsuarioService {

	@Autowired
	private Usuarios usuarios;
	
	@Transactional
	public void salvar(Usuario usuario) {
		Optional<Usuario> usuarioJaExiste = usuarios.findByEmailIgnoringCase(usuario.getEmail());
		
		if (usuarioJaExiste.isPresent()) {
			throw new UsuarioEmailJaCadastradoException("E-mail já cadastrado");
		}
		
		usuarios.save(usuario);
	}
}
