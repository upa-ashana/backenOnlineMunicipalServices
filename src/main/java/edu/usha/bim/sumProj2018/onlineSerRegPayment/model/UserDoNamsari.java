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
@Table(name = "user_do_namsari", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserDoNamsari.findAll", query = "SELECT u FROM UserDoNamsari u")
    , @NamedQuery(name = "UserDoNamsari.findByUserDoNamsariId", query = "SELECT u FROM UserDoNamsari u WHERE u.userDoNamsariId = :userDoNamsariId")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userDoNamsariId")
public class UserDoNamsari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_do_namsari_id")
    private Integer userDoNamsariId;
    @JoinColumn(name = "property_namsari_id", referencedColumnName = "property_namsari_id")
    @ManyToOne(optional = false)
    private PropertyNamsari propertyNamsariId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserLogin userId;

    public UserDoNamsari() {
    }

    public UserDoNamsari(Integer userDoNamsariId) {
        this.userDoNamsariId = userDoNamsariId;
    }

    public Integer getUserDoNamsariId() {
        return userDoNamsariId;
    }

    public void setUserDoNamsariId(Integer userDoNamsariId) {
        this.userDoNamsariId = userDoNamsariId;
    }

    public PropertyNamsari getPropertyNamsariId() {
        return propertyNamsariId;
    }

    public void setPropertyNamsariId(PropertyNamsari propertyNamsariId) {
        this.propertyNamsariId = propertyNamsariId;
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
        hash += (userDoNamsariId != null ? userDoNamsariId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserDoNamsari)) {
            return false;
        }
        UserDoNamsari other = (UserDoNamsari) object;
        if ((this.userDoNamsariId == null && other.userDoNamsariId != null) || (this.userDoNamsariId != null && !this.userDoNamsariId.equals(other.userDoNamsariId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserDoNamsari[ userDoNamsariId=" + userDoNamsariId + " ]";
    }

}
