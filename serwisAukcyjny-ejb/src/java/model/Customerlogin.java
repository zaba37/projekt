/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author zaba37
 */
@Entity
@Table(name = "CUSTOMERLOGIN")
@NamedQueries({
    @NamedQuery(name = "Customerlogin.findAll", query = "SELECT c FROM Customerlogin c"),
    @NamedQuery(name = "Customerlogin.findById", query = "SELECT c FROM Customerlogin c WHERE c.id = :id"),
    @NamedQuery(name = "Customerlogin.findByLogin", query = "SELECT c FROM Customerlogin c WHERE c.login = :login"),
    @NamedQuery(name = "Customerlogin.findByPassword", query = "SELECT c FROM Customerlogin c WHERE c.password = :password")})
public class Customerlogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "LOGIN")
    private String login;
    @Size(max = 25)
    @Column(name = "PASSWORD")
    private String password;
    @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne
    private Customer idCustomer;

    public Customerlogin() {
    }

    public Customerlogin(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
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
        if (!(object instanceof Customerlogin)) {
            return false;
        }
        Customerlogin other = (Customerlogin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Customerlogin[ id=" + id + " ]";
    }
    
}
