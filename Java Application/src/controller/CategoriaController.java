/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import jpa.Categoria;
import jpa.facade.CategoriaFacadeRemote;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class CategoriaController {

    private CategoriaFacadeRemote categoriaFacade;

    public CategoriaController() throws Exception {
        Properties props = new Properties();
        props.load(new java.io.FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        categoriaFacade = (CategoriaFacadeRemote) ctx.lookup("ejb/CategoriaFacade");
    }

    public void create(Categoria entity) {
        categoriaFacade.create(entity);
    }

    public List<Categoria> findAll() {
        return (categoriaFacade.findAll());
    }
    
    public void remove(Categoria entity){
        categoriaFacade.remove(entity);
    }
    
    public void edit(Categoria entity){
        categoriaFacade.edit(entity);
    }
    
    
    
}
