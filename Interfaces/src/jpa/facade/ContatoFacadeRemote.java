/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.Contato;

/**
 *
 * @author juliano
 */
@Remote
public interface ContatoFacadeRemote {

    void create(Contato contato);

    void edit(Contato contato);

    void remove(Contato contato);

    Contato find(Object id);

    List<Contato> findAll();

    List<Contato> findRange(int[] range);

    int count();
    
}
