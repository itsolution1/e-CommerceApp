/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Filial;

/**
 *
 * @author GPinzegher
 */

@Stateless(mappedName = "ejb/FilialFacade")
public class FilialFacade extends AbstractFacade<Filial> implements FilialFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilialFacade() {
        super(Filial.class);
    }
    
}