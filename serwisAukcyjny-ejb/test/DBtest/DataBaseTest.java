/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBtest;

import com.my.ejb.CustomerDbOperatorBean;
import com.my.ejb.facade.CustomerFacade;
import com.my.model.Customer;
import java.util.List;
import javax.ejb.EJB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaba37
 */
public class DataBaseTest {
    
    public DataBaseTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @EJB
    CustomerDbOperatorBean CustomerDbOperatorBean;
    
    @EJB
    CustomerFacade customerFacade;
    
    @Test
    public void addCustomerTest(){
        Customer customer = new Customer();
        customer.setEmail("email");
        customer.setLastname("aa");
        customer.setFirstname("bb");
        
        CustomerDbOperatorBean.addCustomer(customer, null, null);
        List<Customer> list = customerFacade.findByAllParameters(customer.getFirstname(), customer.getLastname(), customer.getEmail());
        
        assert list.size() == 1;
        
    }
}
