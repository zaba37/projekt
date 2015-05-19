/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;
import model.Customerlogin;

/**
 *
 * @author zaba37
 */
@Local
public interface CustomerloginFacadeLocal {

    void create(Customerlogin customerlogin);

    void edit(Customerlogin customerlogin);

    void remove(Customerlogin customerlogin);

    Customerlogin find(Object id);

    List<Customerlogin> findAll();

    List<Customerlogin> findRange(int[] range);

    int count();
    
}
