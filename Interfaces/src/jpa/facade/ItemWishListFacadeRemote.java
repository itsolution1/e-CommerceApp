/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.ItemWishList;

/**
 *
 * @author juliano
 */
@Remote
public interface ItemWishListFacadeRemote {

    void create(ItemWishList itemwishList);

    void edit(ItemWishList itemwishList);

    void remove(ItemWishList itemwishList);

    ItemWishList find(Object id);

    List<ItemWishList> findAll();

    List<ItemWishList> findRange(int[] range);

    int count();
    
}
