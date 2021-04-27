package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.SistemaDao;
import br.com.fiap.entity.Sistema;

public class SistemaDaoImpl extends GenericDaoImp<Sistema, Integer> implements SistemaDao {

	public SistemaDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
