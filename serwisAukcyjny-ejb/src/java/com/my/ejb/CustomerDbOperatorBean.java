/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb;

import com.my.dao.AddressFacadeLocal;
import com.my.dao.CustomerFacadeLocal;
import com.my.ejb.facade.CustomerLoginFacade;
import com.my.model.Address;
import com.my.model.Customer;
import com.my.model.CustomerLogin;
import java.util.Scanner;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author zaba37
 */
@Stateless
public class CustomerDbOperatorBean implements CustomerDbOperatorBeanRemote {
    
    @EJB
    private CustomerFacadeLocal customer;
    
    @EJB
    private CustomerLoginFacade customerLogin;
    
    @EJB 
    private AddressFacadeLocal address;
    
    
    @Override
    public boolean addCustomer(Customer customer, CustomerLogin customerLogin, Address address) {
        this.customer.create(customer);
        
      
        
        return true;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
