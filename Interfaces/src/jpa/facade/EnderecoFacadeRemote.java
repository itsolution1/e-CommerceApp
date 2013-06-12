/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facade;

import java.util.List;
import javax.ejb.Remote;
import jpa.Endereco;

/**
 *
 * @author juliano
 */
@Remote
public interface EnderecoFacadeRemote {

    void create(Endereco endereco);

    void edit(Endereco endereco);

    void remove(Endereco endereco);

    Endereco find(Object id);

    List<Endereco> findAll();

    List<Endereco> findRange(int[] range);

    int count();
    
}