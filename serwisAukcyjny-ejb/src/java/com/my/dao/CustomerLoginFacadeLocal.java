/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.dao;

import java.util.List;
import javax.ejb.Local;
import com.my.model.CustomerLogin;

/**
 *
 * @author zaba37
 */
@Local
public interface CustomerLoginFacadeLocal {

    void create(CustomerLogin customerlogin);

    void edit(CustomerLogin customerlogin);

    void remove(CustomerLogin customerlogin);

    CustomerLogin find(Object id);

    List<CustomerLogin> findAll();

    List<CustomerLogin> findRange(int[] range);

    int count();
    
}
