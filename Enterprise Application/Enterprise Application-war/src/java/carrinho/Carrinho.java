/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carrinho;

import java.util.ArrayList;
import java.util.List;
import jpa.Produto;

/**
 *
 * @author juliano
 */
public class Carrinho {

    List<ItemCarrinho> items;
    int numeroDeItens;
    double total;

    public Carrinho() {
        items = new ArrayList<ItemCarrinho>();
        numeroDeItens = 0;
        total = 0;
    }


    public synchronized void addItem(Produto produto) {

        boolean newItem = true;

        for (ItemCarrinho scItem : items) {

            if (scItem.getProduto().getId() == produto.getId()) {

                newItem = false;
                scItem.addQtd();
            }
        }

        if (newItem) {
            ItemCarrinho scItem = new ItemCarrinho(produto);
            items.add(scItem);
        }
    }


    public synchronized void update(Produto produto, String quantidade) {

        short qty = -1;

        // cast quantity as short
        qty = Short.parseShort(quantidade);

        if (qty >= 0) {

            ItemCarrinho item = null;

            for (ItemCarrinho scItem : items) {

                if (scItem.getProduto().getId() == produto.getId()) {

                    if (qty != 0) {
                        // set item quantity to new value
                        scItem.setQuantidade(qty);
                    } else {
                        // if quantity equals 0, save item and break
                        item = scItem;
                        break;
                    }
                }
            }

            if (item != null) {
                // remove from cart
                items.remove(item);
            }
        }
    }


    public synchronized List<ItemCarrinho> getItems() {

        return items;
    }

    public synchronized int getNumeroDeItens() {

        numeroDeItens = 0;

        for (ItemCarrinho scItem : items) {

            numeroDeItens += scItem.getQuantidade();
        }

        return numeroDeItens;
    }


    public synchronized double getSubtotal() {

        double quantia = 0;

        for (ItemCarrinho scItem : items) {

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

        total = quantia;
    }


    public synchronized double getTotal() {

        return total;
    }

    public synchronized void clear() {
        items.clear();
        numeroDeItens = 0;
        total = 0;
    }

}