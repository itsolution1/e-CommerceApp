/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.Produto;

/**
 *
 * @author GPinzegher
 */
@Remote
public interface ProdutoFacadeRemote {

    void create(Produto produto);

    void edit(Produto produto);

    void remove(Produto produto);

    Produto find(Object id);

    List<Produto> findAll();

    List<Produto> findRange(int[] range);

    int count();
    
}
