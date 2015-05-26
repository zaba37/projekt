/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.operators;

import com.my.dao.CustomerFacadeLocal;
import com.my.ejb.facade.AddressFacade;
import com.my.model.Address;
import com.my.model.Customer;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;

/**
 *
 * @author zaba37
 */
@Singleton
public class Operator implements OperatorLocal {

    @EJB
    private CustomerFacadeLocal customer;
    
    @EJB
    private AddressFacade address;
    
    
    @Override
    public int CreateNewCustomer(Customer customer, Address address) {
        List<Customer> c;
        
        this.customer.create(customer);
        
        c = this.customer.findByLogin(customer.getLogin());
        address.setIdCustomer(c.get(0));
        
        this.address.create(address);
        
        return c.get(0).getId();
        
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
