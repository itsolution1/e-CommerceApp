/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.filial.vendas;

import java.util.ArrayList;
import java.util.List;
import jpa.Produto;

/**
 *
 * @author GPinzegher
 */
public class Carrinho {

    private List<ItemCarrinho> itensCarrinho;
    int numeroDeItens;
    double precoTotal;

    public Carrinho() {
        this.itensCarrinho = new ArrayList<>();
        numeroDeItens = 0;
        precoTotal = 0;
    }
    
    public synchronized void adicionarItem(ItemCarrinho itemCarrinho) {

        boolean newItem = true;
        if ( itensCarrinho != null ) {
            for (ItemCarrinho novoItem : itensCarrinho) {
                if (novoItem.getProduto().getId() == itemCarrinho.getProduto().getId()) {
                    newItem = false;
                    return;
                }
            }

            if (newItem) {
                getItensCarrinho().add(itemCarrinho);
                numeroDeItens += itemCarrinho.getQuantidade();
            }
        }
        
    }
    
    public synchronized void deletarItem(ItemCarrinho itemCarrinho){
        for (ItemCarrinho item : getItensCarrinho()) {
            if (item.getProduto().getId() == itemCarrinho.getProduto().getId()) {
                getItensCarrinho().remove(item);
            }
        }
    }

    public synchronized int getNumeroDeItens() {

        numeroDeItens = 0;

        for (ItemCarrinho scItem : getItensCarrinho()) {

            numeroDeItens += scItem.getQuantidade();
        }

        return numeroDeItens;
    }


    public synchronized double getPrecoTotal() {

        double quantia = 0;

        for (ItemCarrinho scItem : getItensCarrinho()) {

            Produto produto = (Produto) scItem.getProduto();
            quantia += (scItem.getQuantidade() * Double.parseDouble(produto.getPreco()));
        }

        return quantia;
    }
    
    public synchronized void setPrecoTotal(){
        this.precoTotal = getPrecoTotal();
    }

    public synchronized void clear() {
        getItensCarrinho().clear();
        numeroDeItens = 0;
        precoTotal = 0;
    }

    /**
     * @return the itensCarrinho
     */
    public List<ItemCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    /**
     * @param itensCarrinho the itensCarrinho to set
     */
    public void setItensCarrinho(List<ItemCarrinho> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }

}