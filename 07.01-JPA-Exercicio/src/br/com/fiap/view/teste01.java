package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.SistemaDao;
import br.com.fiap.dao.impl.GenericDaoImp;
import br.com.fiap.dao.impl.SistemaDaoImpl;
import br.com.fiap.entity.CasoTeste;
import br.com.fiap.entity.Sistema;
import br.com.fiap.entity.Usuario;
import br.com.fiap.entity.itemTeste;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class teste01 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		SistemaDao dao1 = new SistemaDaoImpl(em);
		
		Sistema sistema = new Sistema("Nome do sistema");
		CasoTeste caso1 = new CasoTeste("Devolução", "Realizar uma devolução");
		CasoTeste caso2 = new CasoTeste("Vendas", "Realizar vendas");
		
		sistema.addCasoTeste(caso1);
		sistema.addCasoTeste(caso2);
		
		itemTeste item1 = new itemTeste("Venda de produto por carnê");
		itemTeste item2 = new itemTeste("Venda de produto por cartão extra");
		itemTeste item3 = new itemTeste("Venda de produto por boleto");
		
		caso1.addItemTeste(item1);
		caso1.addItemTeste(item2);
		caso2.addItemTeste(item3);
		
//		
//		try {
//			dao1.create(sistema);
//			dao1.commit();
//			System.out.println("Sistema cadastrado");
//		} catch (CommitException e) {
//			e.printStackTrace();
//		}
//		
//		List<itemTeste> itens = new ArrayList<>();
//		itens.add(item1);
//		itens.add(item2);
//		itens.add(item3);
//		
//		Usuario user = new Usuario("Bruno", itens);
//		
		GenericDao<Usuario, Integer> usuarioDao = new GenericDaoImp<Usuario, Integer>(em){};
//		
//		
//		try {
//			usuarioDao.create(user);
//			usuarioDao.commit();
//			System.out.println("Usuario cadastrado com os itens de teste");
//		} catch (CommitException e) {
//			// TODO Auto-generated catch block
//			System.out.println("erro ao criar");
//		}
		
		try {
			usuarioDao.read(1);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}

}
