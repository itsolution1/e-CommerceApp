/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import jpa.Contato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juliano
 */
@Stateless
public class ContatoFacade extends AbstractFacade<Contato> implements jpa.facade.ContatoFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContatoFacade() {
        super(Contato.class);
    }
    
}