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

    private Produto produto;
    short quantidade;

    public ItemCarrinho(Produto produto, short quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void edit(Produto produto, short quantidade){
        this.setProduto(produto);
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

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}