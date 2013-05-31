/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author GPinzegher
 */

@Entity
public class Produto implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private String preco;
    
    @OneToMany(fetch=FetchType.EAGER)  
    private Collection<Filial> filiais;

    public Produto() {
    }

    public Produto(String nome, String descricao, String preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.filiais = null;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public Produto clone() {
        return new Produto(this.nome, this.descricao, this.preco);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return the filial
     */
    public Collection<Filial> getFilial() {
        return getFiliais();
    }

    /**
     * @param filial the filial to set
     */
    public void setFilial(Collection<Filial> filial) {
        this.setFiliais(filial);
    }
    
    public int getTotalProdutos(){
        int contador = 0;
        for (Filial filial: getFiliais()) {
            contador += filial.getQuantidadeEstoque();
        }
        return contador;
    }

    /**
     * @return the filiais
     */
    public Collection<Filial> getFiliais() {
        return filiais;
    }

    /**
     * @param filiais the filiais to set
     */
    public void setFiliais(Collection<Filial> filiais) {
        this.filiais = filiais;
    }
}