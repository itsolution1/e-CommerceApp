/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Categoria;

/**
 *
 * @author juliano
 */

@Stateless(mappedName = "ejb/CategoriaFacade")
public class CategoriaFacade extends AbstractFacade<Categoria> implements CategoriaFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }
    
}