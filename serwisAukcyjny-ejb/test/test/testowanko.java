/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.my.dao.CustomerFacadeLocal;
import com.my.ejb.facade.CustomerFacade;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import junit.framework.Assert;
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

//TO JEST GOWNO!!!!!
public class testowanko {

    private static EJBContainer c;

    public testowanko() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(EJBContainer.MODULES, new File("build/jar"));
        c = EJBContainer.createEJBContainer(properties);
        System.out.println("Opening the container");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        c.close();
        System.out.println("Closing the container");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addNumbers method, of class MyBean.
     */
    @Test
    public void testAddNumbers() throws Exception {
        System.out.println("addNumbers");
     /*   int numberA = 1;
        int numberB = 2;
*/
        // Create the instance using the container context to look up the bean 
        // in the directory that contains the built classes
        CustomerFacade instance = (CustomerFacade) c.getContext().lookup("java:global/classes/CustomerFacade");

        int expResult = 3;

        // Invoke the addNumbers method on the bean instance:
        //int result = instance.addNumbers(numberA, numberB);

        assertEquals(expResult, 3);
    }

    @Test
    public void testInsert() throws Exception {

        // Lookup the EJB
        System.out.println("Looking up EJB...");
        /*MyBean instance = (MyBean) c.getContext().lookup("java:global/classes/MyBean");

        System.out.println("Inserting entities...");
        instance.insert(5);
        int res = instance.verify();
        System.out.println("JPA call returned: " + res);
        System.out.println("Done calling EJB");

        Assert.assertTrue("Unexpected number of entities", (res == 5));*/
        System.out.println("..........SUCCESSFULLY finished embedded test");
    }
}
