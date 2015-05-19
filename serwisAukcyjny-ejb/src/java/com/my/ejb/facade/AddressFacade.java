/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.AbstractFacade;
import com.my.dao.AddressFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.my.model.Address;

/**
 *
 * @author zaba37
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address> implements AddressFacadeLocal {
    @PersistenceContext(unitName = "serwisAukcyjny-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressFacade() {
        super(Address.class);
    }
    
}
