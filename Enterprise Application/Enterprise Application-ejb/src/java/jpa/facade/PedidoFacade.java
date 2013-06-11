/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Categoria;
import jpa.Pedido;

/**
 *
 * @author juliano
 */

@Stateless(mappedName = "ejb/PedidoFacade")
public class PedidoFacade extends AbstractFacade<Pedido> implements PedidoFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidoFacade() {
        super(Pedido.class);
    }
    
}