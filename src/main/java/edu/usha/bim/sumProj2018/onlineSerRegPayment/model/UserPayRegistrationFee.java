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
@Table(name = "user_pay_registration_fee", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPayRegistrationFee.findAll", query = "SELECT u FROM UserPayRegistrationFee u")
    , @NamedQuery(name = "UserPayRegistrationFee.findByUserPayRegistrationFeeId", query = "SELECT u FROM UserPayRegistrationFee u WHERE u.userPayRegistrationFeeId = :userPayRegistrationFeeId")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userPayRegistrationFeeId", scope = UserPayRegistrationFee.class)
public class UserPayRegistrationFee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_pay_registration_fee_id")
    private Integer userPayRegistrationFeeId;
    @JoinColumn(name = "registration_fee_payment_id", referencedColumnName = "registration_fee_payment_id")
    @ManyToOne(optional = false)
    private RegistrationFeePayment registrationFeePaymentId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserLogin userId;

    public UserPayRegistrationFee() {
    }

    public UserPayRegistrationFee(Integer userPayRegistrationFeeId) {
        this.userPayRegistrationFeeId = userPayRegistrationFeeId;
    }

    public Integer getUserPayRegistrationFeeId() {
        return userPayRegistrationFeeId;
    }

    public void setUserPayRegistrationFeeId(Integer userPayRegistrationFeeId) {
        this.userPayRegistrationFeeId = userPayRegistrationFeeId;
    }

    public RegistrationFeePayment getRegistrationFeePaymentId() {
        return registrationFeePaymentId;
    }

    public void setRegistrationFeePaymentId(RegistrationFeePayment registrationFeePaymentId) {
        this.registrationFeePaymentId = registrationFeePaymentId;
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
        hash += (userPayRegistrationFeeId != null ? userPayRegistrationFeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPayRegistrationFee)) {
            return false;
        }
        UserPayRegistrationFee other = (UserPayRegistrationFee) object;
        if ((this.userPayRegistrationFeeId == null && other.userPayRegistrationFeeId != null) || (this.userPayRegistrationFeeId != null && !this.userPayRegistrationFeeId.equals(other.userPayRegistrationFeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserPayRegistrationFee[ userPayRegistrationFeeId=" + userPayRegistrationFeeId + " ]";
    }

}
