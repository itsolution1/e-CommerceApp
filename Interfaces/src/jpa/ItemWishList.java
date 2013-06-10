/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author juliano
 */

@Entity
public class ItemWishList implements Serializable, Cloneable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  
    private Produto produto;
    private short quantidade;
    
    @ManyToOne
    private WishList lista;

    public ItemWishList() {
    }

    public ItemWishList(Produto produto) {
        this.produto = produto;
        quantidade = 1;
    }

    public ItemWishList(Produto produto, short quantidade, WishList lista) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.lista = lista;
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
        double quantia;
        quantia = (this.getQuantidade() * Double.parseDouble(produto.getPreco()));
        return quantia;
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
        final ItemWishList other = (ItemWishList) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    @Override
    public ItemWishList clone() {
        return new ItemWishList(this.produto,this.quantidade, this.lista);
    }


    @Override
    public String toString() {
        return "ItemWishList{" +"produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
    
 
    
}
