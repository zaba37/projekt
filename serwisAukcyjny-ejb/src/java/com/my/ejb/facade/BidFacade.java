/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.AbstractFacade;
import com.my.dao.BidFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.my.model.Bid;

/**
 *
 * @author zaba37
 */
@Stateless
public class BidFacade extends AbstractFacade<Bid> implements BidFacadeLocal {
    @PersistenceContext(unitName = "serwisAukcyjny-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BidFacade() {
        super(Bid.class);
    }
    
}
