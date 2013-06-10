/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.ItemWishList;

/**
 *
 * @author juliano
 */
@Stateless(mappedName = "ejb/ItemWishListFacade")
public class ItemWishListFacade extends AbstractFacade<ItemWishList> implements jpa.facade.ItemWishListFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemWishListFacade() {
        super(ItemWishList.class);
    }
    
}
