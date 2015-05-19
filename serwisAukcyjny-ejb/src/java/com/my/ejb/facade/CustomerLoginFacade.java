/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.AbstractFacade;
import com.my.dao.CustomerLoginFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.my.model.CustomerLogin;

/**
 *
 * @author zaba37
 */
@Stateless
public class CustomerLoginFacade extends AbstractFacade<CustomerLogin> implements CustomerLoginFacadeLocal {
    @PersistenceContext(unitName = "serwisAukcyjny-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerLoginFacade() {
        super(CustomerLogin.class);
    }
    
}
