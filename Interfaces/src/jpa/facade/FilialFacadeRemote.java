/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.ItemCarrinho;

/**
 *
 * @author GPinzegher
 */
@Remote
public interface FilialFacadeRemote {

    void create(ItemCarrinho filial);

    void edit(ItemCarrinho categoria);

    void remove(ItemCarrinho categoria);

    ItemCarrinho find(Object id);

    List<ItemCarrinho> findAll();

    List<ItemCarrinho> findRange(int[] range);

    int count();
    
}
