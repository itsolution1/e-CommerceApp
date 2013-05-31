/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.filial.vendas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jpa.Produto;

/**
 *
 * @author juliano
 */
public class Carrinho {

    List<ItemCarrinho> itensCarrinho;
    ItemCarrinho filial;
    int numeroDeItens;
    double precoTotal;

    public Carrinho(ItemCarrinho filial) {
        this.itensCarrinho = new ArrayList<>();
        this.filial = filial;
        numeroDeItens = 0;
        precoTotal = 0;
    }


    public synchronized void adicionarItem(ItemCarrinho itemCarrinho) {

        boolean newItem = true;

        for (ItemCarrinho novoItem : itensCarrinho) {
            if (novoItem.produto.getId() == itemCarrinho.produto.getId()) {
                newItem = false;
                return;
            }
        }

        if (newItem) {
            itensCarrinho.add(itemCarrinho);
            numeroDeItens += itemCarrinho.getQuantidade();
        }
    }


    public synchronized void atualizarQuantidade(ItemCarrinho itemCarrinho, short novaQuantidade) {
        int i = 0;
        for (ItemCarrinho item : itensCarrinho) {
            if (item.getProduto().getId() == itemCarrinho.produto.getId()) {
                numeroDeItens -= itemCarrinho.getQuantidade();
                
               item.setQuantidade(novaQuantidade);
               itensCarrinho.set(i, item);
            }
            i++;
        }

    }
    
    public synchronized void deletarItem(ItemCarrinho itemCarrinho){
        for (ItemCarrinho item : itensCarrinho) {
            if (item.getProduto().getId() == itemCarrinho.produto.getId()) {
                itensCarrinho.remove(item);
            }
        }
    }


    public synchronized List<ItemCarrinho> getItems() {
        return itensCarrinho;
    }

    public synchronized int getNumeroDeItens() {

        numeroDeItens = 0;

        for (ItemCarrinho scItem : itensCarrinho) {

            numeroDeItens += scItem.getQuantidade();
        }

        return numeroDeItens;
    }


    public synchronized double getSubtotal() {

        double quantia = 0;

        for (ItemCarrinho scItem : itensCarrinho) {

            Produto produto = (Produto) scItem.getProduto();
            quantia += (scItem.getQuantidade() * Double.parseDouble(produto.getPreco()));
        }

        return quantia;
    }


    public synchronized void calculaTotal(String taxa) {

        double quantia = 0;

        // cast surcharge as double
        double s = Double.parseDouble(taxa);

        quantia = this.getSubtotal();
        quantia += s;

        precoTotal = quantia;
    }


    public synchronized double getTotal() {

        return precoTotal;
    }

    public synchronized void clear() {
        itensCarrinho.clear();
        numeroDeItens = 0;
        precoTotal = 0;
    }

}