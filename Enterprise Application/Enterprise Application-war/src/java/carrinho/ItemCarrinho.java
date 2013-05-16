/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carrinho;

import jpa.Produto;

/**
 *
 * @author juliano
 */
public class ItemCarrinho {

    Produto produto;
    short quantidade;

    public ItemCarrinho(Produto produto) {
        this.produto = produto;
        quantidade = 1;
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

    public void addQtd() {
        quantidade++;
    }

    public void dimQtd() {
        quantidade--;
    }

    public double getTotal() {
        double quantia = 0;
        quantia = (this.getQuantidade() * Double.parseDouble(produto.getPreco()));
        return quantia;
    }

}