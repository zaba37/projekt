/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.CustomerFacadeLocal;
import com.my.model.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author zaba37
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {
    @PersistenceContext(unitName = "serwisAukcyjny-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }
    
    public List<Customer> findByLogin(String login){
        TypedQuery<Customer> query = em.createNamedQuery("Customer.findByLogin", Customer.class);
        query.setParameter("login", login);
        List<Customer> result = query.getResultList();
        em.close(); //nie wiem czy tu trzeba to zamykac!!!!!!!!!!!!!
        return result;
    }
}
