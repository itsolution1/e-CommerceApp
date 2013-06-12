/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author juliano
 */
@Entity
public class Cliente implements Serializable, Cloneable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cpf;
    private String nome;
    private String telefone;
    private char sexo;
    private String senha;
    private String email;
   
   @OneToOne
   private WishList lista;
   @OneToOne
   private Endereco enderecoCadastro;
//private Endereco enderecoCadastro;
//private Endereco enderecoEntrega;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String telefone, char sexo, String senha, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.senha = senha;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Contato)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", sexo=" + sexo + ", senha=" + senha + ", email=" + email + '}';
    }


    @Override
    public Cliente clone() {
        return new Cliente(this.cpf, this.nome, this.telefone,this.sexo, this.senha, this.email);
    }

    /**
     * @return the enderecoCadastro
     */
    public Endereco getEnderecoCadastro() {
        return enderecoCadastro;
    }

    /**
     * @param enderecoCadastro the enderecoCadastro to set
     */
    public void setEnderecoCadastro(Endereco enderecoCadastro) {
        this.enderecoCadastro = enderecoCadastro;
    }

    /**
     * @return the lista
     */
    public WishList getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(WishList lista) {
        this.lista = lista;
    }



    
   
    
    
    
}
