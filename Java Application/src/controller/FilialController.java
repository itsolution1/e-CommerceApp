/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import jpa.ItemCarrinho;
import jpa.facade.FilialFacadeRemote;

/**
 *
 * @author GPinzegher
 */
public class FilialController {

    private FilialFacadeRemote filialFacade;

    public FilialController() throws Exception {
        Properties props = new Properties();
        props.load(new java.io.FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        filialFacade = (FilialFacadeRemote) ctx.lookup("ejb/FilialFacade");
    }

    public void create(ItemCarrinho entity) {
        filialFacade.create(entity);
    }
    
    public void edit(ItemCarrinho entity) {
        filialFacade.edit(entity);
    }
    
    public void remove(ItemCarrinho entity) {
        filialFacade.remove(entity);
    }

    public List<ItemCarrinho> findAll() {
        return (filialFacade.findAll());
    }
    
    public ItemCarrinho find(Long id){
        return (filialFacade.find(id));
    }
}
