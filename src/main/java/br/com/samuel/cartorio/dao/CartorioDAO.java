package br.com.samuel.cartorio.dao;

import java.util.List;

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
    
    public List<Cartorio> listar(){
        return manager.createQuery("select p from Cartorio p", Cartorio.class).getResultList();
    }
	
    public Cartorio find(int id){
        return manager.find(Cartorio.class, id);
    }

}
