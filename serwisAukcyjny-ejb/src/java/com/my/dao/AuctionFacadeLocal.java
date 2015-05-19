/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.dao;

import java.util.List;
import javax.ejb.Local;
import com.my.model.Auction;

/**
 *
 * @author zaba37
 */
@Local
public interface AuctionFacadeLocal {

    void create(Auction auction);

    void edit(Auction auction);

    void remove(Auction auction);

    Auction find(Object id);

    List<Auction> findAll();

    List<Auction> findRange(int[] range);

    int count();
    
}
