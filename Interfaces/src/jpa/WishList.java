/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author juliano
 */
@Entity
public class WishList implements Serializable, Cloneable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  
    
    @OneToMany(fetch = FetchType.EAGER)
    Collection<ItemWishList> items;
    private int numeroDeItens;
    private double total;
    
    @OneToOne
    private Cliente cliente;

    public WishList() {
        items = new ArrayList<ItemWishList>();
        numeroDeItens = 0;
        total = 0;
    }

    public WishList(Collection<ItemWishList> items, int numeroDeItens, double total) {
        this.items = items;
        this.numeroDeItens = numeroDeItens;
        this.total = total;
    }

    

    public void addItem(Produto produto) {

        boolean newItem = true;

        for (ItemWishList scItem : items) {

            if (scItem.getProduto().getId() == produto.getId()) {

                newItem = false;
                scItem.addQtd();
            }
        }

        if (newItem) {
            ItemWishList scItem = new ItemWishList(produto);
            items.add(scItem);
        }
    }


    public void update(Produto produto, String quantidade) {

        short qty = -1;

        // cast quantity as short
        qty = Short.parseShort(quantidade);

        if (qty >= 0) {

            ItemWishList item = null;

            for (ItemWishList scItem : items) {

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


    public Collection<ItemWishList> getItems() {

        return items;
    }

    public int getNumeroDeItens() {

        numeroDeItens = 0;

        for (ItemWishList scItem : items) {

            numeroDeItens += scItem.getQuantidade();
        }

        return numeroDeItens;
    }


    public double getSubtotal() {

        double quantia = 0;

        for (ItemWishList scItem : items) {

            Produto produto = (Produto) scItem.getProduto();
            quantia += (scItem.getQuantidade() * Double.parseDouble(produto.getPreco()));
        }

        return quantia;
    }


    public void calculaTotal(String taxa) {

        double quantia = 0;

        // cast surcharge as double
        double s = Double.parseDouble(taxa);

        quantia = this.getSubtotal();
        quantia += s;

        total = quantia;
    }


    public double getTotal() {

        return total;
    }

    public void clear() {
        items.clear();
        numeroDeItens = 0;
        total = 0;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WishList other = (WishList) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public WishList clone() {
        return new WishList(this.items, this.numeroDeItens, this.total);
    }

    @Override
    public String toString() {
        return "WishList{" + "id=" + id + ", items=" + items + ", numeroDeItens=" + numeroDeItens + ", total=" + total + '}';
    }

 
    
}
