/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import jpa.Pedido;
import jpa.facade.PedidoFacadeRemote;

/**
 *
 * @author GPinzegher
 */
public class PedidoController {

    private PedidoFacadeRemote pedidoFacade;

    public PedidoController() throws Exception {
        Properties props = new Properties();
        props.load(new java.io.FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        pedidoFacade = (PedidoFacadeRemote) ctx.lookup("ejb/PedidoFacade");
    }

    public void create(Pedido entity) {
        pedidoFacade.create(entity);
    }
    
    public void edit(Pedido entity) {
        pedidoFacade.edit(entity);
    }
    
    public void remove(Pedido entity) {
        pedidoFacade.remove(entity);
    }

    public List<Pedido> findAll() {
        return (pedidoFacade.findAll());
    }
    
    public Pedido find(Long id){
        return (pedidoFacade.find(id));
    }
}
