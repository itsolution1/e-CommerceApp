/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.Filial;

/**
 *
 * @author GPinzegher
 */
@Remote
public interface FilialFacadeRemote {

    void create(Filial filial);

    void edit(Filial categoria);

    void remove(Filial categoria);

    Filial find(Object id);

    List<Filial> findAll();

    List<Filial> findRange(int[] range);

    int count();
    
}
