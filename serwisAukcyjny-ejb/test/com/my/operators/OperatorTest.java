/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.operators;

import com.my.dao.AddressFacadeLocal;
import com.my.dao.CustomerFacadeLocal;
import com.my.model.Address;
import com.my.model.Customer;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaba37
 */

//TO JESZCZE NIE DZIAŁA!!!!!!!!!!!!!!!!!!
public class OperatorTest {
    
    public OperatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CreateNewCustomer method, of class Operator.
     */
    @Test
    public void testCreateNewCustomer() throws Exception {
        System.out.println("CreateNewCustomer");
        Customer customer = new Customer();
        Address address = new Address();
        customer.setEmail("zaba37");
        customer.setFirstname("a");
        customer.setLastname("b");
        customer.setLogin("zaba");
        customer.setPassword("1234");
        address.setCity("s");
        address.setCountry("p");
        address.setHouseNo(1);
        address.setPostcode("16-20");
        address.setStreet("aaa");
        
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        OperatorLocal instance1 = (OperatorLocal)container.getContext().lookup("java:global/classes/Operator");
        AddressFacadeLocal instance2 = (AddressFacadeLocal)container.getContext().lookup("java:global/classes/AddressFacade");
        int i = instance1.CreateNewCustomer(customer, address);
        
        System.out.println(i);
        
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
    }
    
}
