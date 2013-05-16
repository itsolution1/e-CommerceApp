/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;
    
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Produto;

/**
 *
 * @author GPinzegher
 */

@Stateless(mappedName = "ejb/ProdutoFacade")
public class ProdutoFacade extends AbstractFacade<Produto> implements ProdutoFacadeRemote {
    @PersistenceContext(unitName = "Enterprise_Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProdutoFacade() {
        super(Produto.class);
    }
    
}