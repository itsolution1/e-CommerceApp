/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author juliano
 */
@Entity
public class Pedido implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double valorTotal = 0;
    @OneToMany(fetch = FetchType.EAGER)
    private Collection<ItemPedido> itensPedido;
    private boolean pedidoEncaminhado;
    private boolean pedidoEnviadoCliente;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDoPedido;
    
    //private Cliente cliente;
    public Pedido() {
    }
    
    public Pedido(Collection<ItemPedido> itensPedido){
        this.itensPedido = itensPedido;
        for(ItemPedido ip: itensPedido) {
            this.valorTotal += Double.parseDouble(ip.getProduto().getPreco()) * ip.getQuantidade();
        }
        this.pedidoEncaminhado = false;
        this.pedidoEnviadoCliente = false;
        setDataDoPedido();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contato)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the itensPedido
     */
    public Collection<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    /**
     * @param itensPedido the itensPedido to set
     */
    public void setItensPedido(Collection<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the pedidoEncaminhado
     */
    public boolean isPedidoEncaminhado() {
        return pedidoEncaminhado;
    }

    /**
     * @param pedidoEncaminhado the pedidoEncaminhado to set
     */
    public void setPedidoEncaminhado(boolean pedidoEncaminhado) {
        this.pedidoEncaminhado = pedidoEncaminhado;
    }

    /**
     * @return the pedidoEnviadoCliente
     */
    public boolean isPedidoEnviadoCliente() {
        return pedidoEnviadoCliente;
    }

    /**
     * @param pedidoEnviadoCliente the pedidoEnviadoCliente to set
     */
    public void setPedidoEnviadoCliente(boolean pedidoEnviadoCliente) {
        this.pedidoEnviadoCliente = pedidoEnviadoCliente;
    }

    /**
     * @return the dataDoPedido
     */
    public Date getDataDoPedido() {
        return dataDoPedido;
    }

    /**
     * @param dataDoPedido the dataDoPedido to set
     */
    private void setDataDoPedido() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.dataDoPedido = date;
    }

}
