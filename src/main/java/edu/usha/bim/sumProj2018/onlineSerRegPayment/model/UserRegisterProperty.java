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
@Table(name = "user_register_property", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRegisterProperty.findAll", query = "SELECT u FROM UserRegisterProperty u")
    , @NamedQuery(name = "UserRegisterProperty.findByUserRegisterPropertyId", query = "SELECT u FROM UserRegisterProperty u WHERE u.userRegisterPropertyId = :userRegisterPropertyId")})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="userRegisterPropertyId")
public class UserRegisterProperty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_register_property_id")
    private Integer userRegisterPropertyId;
    @JoinColumn(name = "property_registration_id", referencedColumnName = "property_registration_id")
    @ManyToOne(optional = false)
    private PropertyRegistration propertyRegistrationId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserLogin userId;

    public UserRegisterProperty() {
    }

    public UserRegisterProperty(Integer userRegisterPropertyId) {
        this.userRegisterPropertyId = userRegisterPropertyId;
    }

    public Integer getUserRegisterPropertyId() {
        return userRegisterPropertyId;
    }

    public void setUserRegisterPropertyId(Integer userRegisterPropertyId) {
        this.userRegisterPropertyId = userRegisterPropertyId;
    }

    public PropertyRegistration getPropertyRegistrationId() {
        return propertyRegistrationId;
    }

    public void setPropertyRegistrationId(PropertyRegistration propertyRegistrationId) {
        this.propertyRegistrationId = propertyRegistrationId;
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
        hash += (userRegisterPropertyId != null ? userRegisterPropertyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRegisterProperty)) {
            return false;
        }
        UserRegisterProperty other = (UserRegisterProperty) object;
        if ((this.userRegisterPropertyId == null && other.userRegisterPropertyId != null) || (this.userRegisterPropertyId != null && !this.userRegisterPropertyId.equals(other.userRegisterPropertyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserRegisterProperty[ userRegisterPropertyId=" + userRegisterPropertyId + " ]";
    }
    
}
