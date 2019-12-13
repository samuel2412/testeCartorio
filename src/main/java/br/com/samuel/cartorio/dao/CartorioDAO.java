package br.com.samuel.cartorio.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.samuel.cartorio.models.Cartorio;

@Repository
@Transactional
public class CartorioDAO {

	@PersistenceContext
    private EntityManager manager;

    public void gravar(Cartorio cartorio){
        manager.persist(cartorio);
    }
	
}
