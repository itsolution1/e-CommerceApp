/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.WishList;

/**
 *
 * @author juliano
 */
@Stateless(mappedName = "ejb/WishListFacade")
public class WishListFacade extends AbstractFacade<WishList> implements jpa.facade.WishListFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WishListFacade() {
        super(WishList.class);
    }
    
}
