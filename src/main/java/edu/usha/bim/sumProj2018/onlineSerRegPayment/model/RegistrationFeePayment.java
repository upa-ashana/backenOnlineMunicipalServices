/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "registration_fee_payment", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistrationFeePayment.findAll", query = "SELECT r FROM RegistrationFeePayment r")
    , @NamedQuery(name = "RegistrationFeePayment.findByRegistrationFeePaymentId", query = "SELECT r FROM RegistrationFeePayment r WHERE r.registrationFeePaymentId = :registrationFeePaymentId")
    , @NamedQuery(name = "RegistrationFeePayment.findByRegistrationFeeAmount", query = "SELECT r FROM RegistrationFeePayment r WHERE r.registrationFeeAmount = :registrationFeeAmount")})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="registrationFeePaymentId")
public class RegistrationFeePayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "registration_fee_payment_id")
    private Integer registrationFeePaymentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registration_fee_amount")
    private float registrationFeeAmount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrationFeePaymentId")
    private List<UserPayRegistrationFee> userPayRegistrationFeeList;

    public RegistrationFeePayment() {
    }

    public RegistrationFeePayment(Integer registrationFeePaymentId) {
        this.registrationFeePaymentId = registrationFeePaymentId;
    }

    public RegistrationFeePayment(Integer registrationFeePaymentId, float registrationFeeAmount) {
        this.registrationFeePaymentId = registrationFeePaymentId;
        this.registrationFeeAmount = registrationFeeAmount;
    }

    public Integer getRegistrationFeePaymentId() {
        return registrationFeePaymentId;
    }

    public void setRegistrationFeePaymentId(Integer registrationFeePaymentId) {
        this.registrationFeePaymentId = registrationFeePaymentId;
    }

    public float getRegistrationFeeAmount() {
        return registrationFeeAmount;
    }

    public void setRegistrationFeeAmount(float registrationFeeAmount) {
        this.registrationFeeAmount = registrationFeeAmount;
    }

    @XmlTransient
    public List<UserPayRegistrationFee> getUserPayRegistrationFeeList() {
        return userPayRegistrationFeeList;
    }

    public void setUserPayRegistrationFeeList(List<UserPayRegistrationFee> userPayRegistrationFeeList) {
        this.userPayRegistrationFeeList = userPayRegistrationFeeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrationFeePaymentId != null ? registrationFeePaymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrationFeePayment)) {
            return false;
        }
        RegistrationFeePayment other = (RegistrationFeePayment) object;
        if ((this.registrationFeePaymentId == null && other.registrationFeePaymentId != null) || (this.registrationFeePaymentId != null && !this.registrationFeePaymentId.equals(other.registrationFeePaymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.RegistrationFeePayment[ registrationFeePaymentId=" + registrationFeePaymentId + " ]";
    }
    
}
