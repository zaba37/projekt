/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Customerlogin;

/**
 *
 * @author zaba37
 */
@Stateless
public class CustomerloginFacade extends AbstractFacade<Customerlogin> implements CustomerloginFacadeLocal {
    @PersistenceContext(unitName = "serwisAukcyjny-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerloginFacade() {
        super(Customerlogin.class);
    }
    
}
