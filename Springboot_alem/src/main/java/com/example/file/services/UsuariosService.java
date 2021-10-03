package com.example.file.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.file.interfaceServices.IUsuarioService;
import com.example.file.interfaces.IUsuarios;
import com.example.file.model.Usuarios;

@Service
public class UsuariosService implements IUsuarioService{
	
	@Autowired
	private IUsuarios data;
	
	@Override
	public List<Usuarios> listar() {
		return (List<Usuarios>)data.findAll();
	}

	@Override
	public Optional<Usuarios> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Usuarios u) {
		int rta=0;
		Usuarios usuario=data.save(u);
		if(!usuario.equals(null)) {
			rta=1;
		}
		return rta;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}

}
