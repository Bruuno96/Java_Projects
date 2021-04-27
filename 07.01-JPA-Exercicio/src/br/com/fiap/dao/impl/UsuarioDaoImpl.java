package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;

public class UsuarioDaoImpl extends GenericDaoImp<Usuario, Integer> implements UsuarioDao {

	public UsuarioDaoImpl(EntityManager em) {
		super(em);
	}

	

}
