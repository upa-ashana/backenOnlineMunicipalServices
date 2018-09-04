/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "property_tax_payment", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyTaxPayment.findAll", query = "SELECT p FROM PropertyTaxPayment p")
    , @NamedQuery(name = "PropertyTaxPayment.findByPropertyTaxPaymentId", query = "SELECT p FROM PropertyTaxPayment p WHERE p.propertyTaxPaymentId = :propertyTaxPaymentId")
    , @NamedQuery(name = "PropertyTaxPayment.findByPaymentType", query = "SELECT p FROM PropertyTaxPayment p WHERE p.paymentType = :paymentType")
    , @NamedQuery(name = "PropertyTaxPayment.findByCurrentYearAmount", query = "SELECT p FROM PropertyTaxPayment p WHERE p.currentYearAmount = :currentYearAmount")
    , @NamedQuery(name = "PropertyTaxPayment.findByDueAmount", query = "SELECT p FROM PropertyTaxPayment p WHERE p.dueAmount = :dueAmount")
    , @NamedQuery(name = "PropertyTaxPayment.findByTotalPaymentAmount", query = "SELECT p FROM PropertyTaxPayment p WHERE p.totalPaymentAmount = :totalPaymentAmount")
    , @NamedQuery(name = "PropertyTaxPayment.findByPaymentDate", query = "SELECT p FROM PropertyTaxPayment p WHERE p.paymentDate = :paymentDate")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "propertyTaxPaymentId", scope = PropertyTaxPayment.class)
public class PropertyTaxPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "property_tax_payment_id")
    private Integer propertyTaxPaymentId;
    @Basic(optional = false)
    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "payment_type", length = 45)
    private String paymentType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_year_amount")
    private double currentYearAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "due_amount")
    private double dueAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_payment_amount")
    private double totalPaymentAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyTaxPaymentId")
    private List<UserPayTax> userPayTaxList;
    @JoinColumn(name = "property_tax_calculation_id", referencedColumnName = "property_tax_calculation_id")
    @ManyToOne(optional = false)
    private PropertyTaxCalculation propertyTaxCalculationId;

    public PropertyTaxPayment() {
    }

    public PropertyTaxPayment(Integer propertyTaxPaymentId) {
        this.propertyTaxPaymentId = propertyTaxPaymentId;
    }

    public PropertyTaxPayment(Integer propertyTaxPaymentId, String paymentType, double currentYearAmount, double dueAmount, double totalPaymentAmount, Date paymentDate) {
        this.propertyTaxPaymentId = propertyTaxPaymentId;
        this.paymentType = paymentType;
        this.currentYearAmount = currentYearAmount;
        this.dueAmount = dueAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.paymentDate = paymentDate;
    }

    public Integer getPropertyTaxPaymentId() {
        return propertyTaxPaymentId;
    }

    public void setPropertyTaxPaymentId(Integer propertyTaxPaymentId) {
        this.propertyTaxPaymentId = propertyTaxPaymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getCurrentYearAmount() {
        return currentYearAmount;
    }

    public void setCurrentYearAmount(double currentYearAmount) {
        this.currentYearAmount = currentYearAmount;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @XmlTransient
    public List<UserPayTax> getUserPayTaxList() {
        return userPayTaxList;
    }

    public void setUserPayTaxList(List<UserPayTax> userPayTaxList) {
        this.userPayTaxList = userPayTaxList;
    }

    public PropertyTaxCalculation getPropertyTaxCalculationId() {
        return propertyTaxCalculationId;
    }

    public void setPropertyTaxCalculationId(PropertyTaxCalculation propertyTaxCalculationId) {
        this.propertyTaxCalculationId = propertyTaxCalculationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyTaxPaymentId != null ? propertyTaxPaymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyTaxPayment)) {
            return false;
        }
        PropertyTaxPayment other = (PropertyTaxPayment) object;
        if ((this.propertyTaxPaymentId == null && other.propertyTaxPaymentId != null) || (this.propertyTaxPaymentId != null && !this.propertyTaxPaymentId.equals(other.propertyTaxPaymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyTaxPayment[ propertyTaxPaymentId=" + propertyTaxPaymentId + " ]";
    }

}
