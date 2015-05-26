/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.operators;

import com.my.dao.CustomerFacadeLocal;
import com.my.ejb.facade.CustomerFacade;
import com.my.model.Address;
import com.my.model.Customer;
import javax.ejb.EJB;
import javax.ejb.Local;

/**
 *
 * @author zaba37
 */
@Local
public interface OperatorLocal {

    
    int CreateNewCustomer(Customer customer, Address address);
    
}
