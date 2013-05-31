/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.filial.vendas;

import jpa.Produto;

/**
 *
 * @author GPinzegher
 */
public class ItemCarrinho {

    Produto produto;
    short quantidade;

    public ItemCarrinho(Produto produto, short quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void edit(Produto produto, short quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

}