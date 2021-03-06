/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "user_pay_tax", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPayTax.findAll", query = "SELECT u FROM UserPayTax u")
    , @NamedQuery(name = "UserPayTax.findByUserPayTaxId", query = "SELECT u FROM UserPayTax u WHERE u.userPayTaxId = :userPayTaxId")})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="userPayTaxId")
public class UserPayTax implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_pay_tax_id")
    private Integer userPayTaxId;
    @JoinColumn(name = "property_tax_payment_id", referencedColumnName = "property_tax_payment_id")
    @ManyToOne(optional = false)
    private PropertyTaxPayment propertyTaxPaymentId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserLogin userId;

    public UserPayTax() {
    }

    public UserPayTax(Integer userPayTaxId) {
        this.userPayTaxId = userPayTaxId;
    }

    public Integer getUserPayTaxId() {
        return userPayTaxId;
    }

    public void setUserPayTaxId(Integer userPayTaxId) {
        this.userPayTaxId = userPayTaxId;
    }

    public PropertyTaxPayment getPropertyTaxPaymentId() {
        return propertyTaxPaymentId;
    }

    public void setPropertyTaxPaymentId(PropertyTaxPayment propertyTaxPaymentId) {
        this.propertyTaxPaymentId = propertyTaxPaymentId;
    }

    public UserLogin getUserId() {
        return userId;
    }

    public void setUserId(UserLogin userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userPayTaxId != null ? userPayTaxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPayTax)) {
            return false;
        }
        UserPayTax other = (UserPayTax) object;
        if ((this.userPayTaxId == null && other.userPayTaxId != null) || (this.userPayTaxId != null && !this.userPayTaxId.equals(other.userPayTaxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserPayTax[ userPayTaxId=" + userPayTaxId + " ]";
    }
    
}
