/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import jpa.Produto;
import jpa.facade.ProdutoFacadeRemote;

/**
 *
 * @author GPinzegher
 */
public class ProdutoController {

    private ProdutoFacadeRemote categoriaFacade;

    public ProdutoController() throws Exception {
        Properties props = new Properties();
        props.load(new java.io.FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        categoriaFacade = (ProdutoFacadeRemote) ctx.lookup("ejb/ProdutoFacade");
    }

    public void create(Produto entity) {
        categoriaFacade.create(entity);
    }
    
    public void edit(Produto entity) {
        categoriaFacade.edit(entity);
    }
    
    public void remove(Produto entity) {
        categoriaFacade.remove(entity);
    }

    public List<Produto> findAll() {
        return (categoriaFacade.findAll());
    }
    
    public Produto find(Long id){
        return (categoriaFacade.find(id));
    }
}
