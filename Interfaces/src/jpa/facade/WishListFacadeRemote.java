/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.WishList;

/**
 *
 * @author juliano
 */
@Remote
public interface WishListFacadeRemote {

    void create(WishList wishList);

    void edit(WishList wishList);

    void remove(WishList wishList);

    WishList find(Object id);

    List<WishList> findAll();

    List<WishList> findRange(int[] range);

    int count();
    
}
