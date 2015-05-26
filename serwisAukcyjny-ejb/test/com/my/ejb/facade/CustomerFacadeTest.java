/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ejb.facade;

import com.my.dao.CustomerFacadeLocal;
import com.my.model.Customer;
import java.util.List;
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
public class CustomerFacadeTest {
    Customer entity;
    public CustomerFacadeTest() {
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
     * Test of create method, of class CustomerFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class CustomerFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CustomerFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CustomerFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        Customer expResult = null;
        Customer result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CustomerFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class CustomerFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class CustomerFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByLogin method, of class CustomerFacade.
     */
    @Test
    public void testFindByLogin() throws Exception {
        System.out.println("findByLogin");
        String login = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacadeLocal instance = (CustomerFacadeLocal)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findByLogin(login);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
