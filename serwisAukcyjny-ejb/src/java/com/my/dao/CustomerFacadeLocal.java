/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.dao;

import java.util.List;
import javax.ejb.Local;
import com.my.model.Customer;

/**
 *
 * @author zaba37
 */
@Local
public interface CustomerFacadeLocal {

    void create(Customer customer);

    void edit(Customer customer);

    void remove(Customer customer);

    Customer find(Object id);

    List<Customer> findAll();

    List<Customer> findRange(int[] range);
    
    List<Customer> findByAllParameters(String firstName, String lastName, String email);
    
    int count();
    
}
