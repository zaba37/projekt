/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.AbstractFacade;
import com.my.dao.CustomerFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.my.model.Customer;
import java.util.List;
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

    @Override
    public List<Customer> findByAllParameters(String firstName, String lastName, String email) {
        TypedQuery<Customer> query = em.createNamedQuery("Customer.findByAllParameters", Customer.class);
        query.setParameter("email", email);
        query.setParameter("firstname", firstName);
        query.setParameter("lastname", lastName);
        List<Customer> result = query.getResultList();
        em.close();
        return result;
    }
    
    
    
}
