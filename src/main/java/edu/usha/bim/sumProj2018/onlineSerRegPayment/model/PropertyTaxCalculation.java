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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "property_tax_calculation", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyTaxCalculation.findAll", query = "SELECT p FROM PropertyTaxCalculation p")
    , @NamedQuery(name = "PropertyTaxCalculation.findByPropertyTaxCalculationId", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.propertyTaxCalculationId = :propertyTaxCalculationId")
    , @NamedQuery(name = "PropertyTaxCalculation.findByTotalLandValue", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.totalLandValue = :totalLandValue")
    , @NamedQuery(name = "PropertyTaxCalculation.findByTotalHouseValue", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.totalHouseValue = :totalHouseValue")
    , @NamedQuery(name = "PropertyTaxCalculation.findByTotalPropertyValue", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.totalPropertyValue = :totalPropertyValue")
    , @NamedQuery(name = "PropertyTaxCalculation.findByTaxPercentage", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.taxPercentage = :taxPercentage")
    , @NamedQuery(name = "PropertyTaxCalculation.findByTotalPropertyTax", query = "SELECT p FROM PropertyTaxCalculation p WHERE p.totalPropertyTax = :totalPropertyTax")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "propertyTaxCalculationId", scope = PropertyTaxCalculation.class)
public class PropertyTaxCalculation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "property_tax_calculation_id")
    private Integer propertyTaxCalculationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_land_value")
    private double totalLandValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_house_value")
    private double totalHouseValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_property_value")
    private double totalPropertyValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_percentage")
    private float taxPercentage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_property_tax")
    private double totalPropertyTax;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyTaxCalculationId")
    private List<PropertyTaxPayment> propertyTaxPaymentList;
    @JoinColumn(name = "house_info_id", referencedColumnName = "house_info_id")
    @ManyToOne(optional = false)
    private HouseInfo houseInfoId;
    @JoinColumn(name = "land_info_id", referencedColumnName = "land_info_id")
    @ManyToOne(optional = false)
    private LandInfo landInfoId;

    public PropertyTaxCalculation() {
    }

    public PropertyTaxCalculation(Integer propertyTaxCalculationId) {
        this.propertyTaxCalculationId = propertyTaxCalculationId;
    }

    public PropertyTaxCalculation(Integer propertyTaxCalculationId, double totalLandValue, double totalHouseValue, double totalPropertyValue, float taxPercentage, double totalPropertyTax) {
        this.propertyTaxCalculationId = propertyTaxCalculationId;
        this.totalLandValue = totalLandValue;
        this.totalHouseValue = totalHouseValue;
        this.totalPropertyValue = totalPropertyValue;
        this.taxPercentage = taxPercentage;
        this.totalPropertyTax = totalPropertyTax;
    }

    public Integer getPropertyTaxCalculationId() {
        return propertyTaxCalculationId;
    }

    public void setPropertyTaxCalculationId(Integer propertyTaxCalculationId) {
        this.propertyTaxCalculationId = propertyTaxCalculationId;
    }

    public double getTotalLandValue() {
        return totalLandValue;
    }

    public void setTotalLandValue(double totalLandValue) {
        this.totalLandValue = totalLandValue;
    }

    public double getTotalHouseValue() {
        return totalHouseValue;
    }

    public void setTotalHouseValue(double totalHouseValue) {
        this.totalHouseValue = totalHouseValue;
    }

    public double getTotalPropertyValue() {
        return totalPropertyValue;
    }

    public void setTotalPropertyValue(double totalPropertyValue) {
        this.totalPropertyValue = totalPropertyValue;
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTotalPropertyTax() {
        return totalPropertyTax;
    }

    public void setTotalPropertyTax(double totalPropertyTax) {
        this.totalPropertyTax = totalPropertyTax;
    }

    @XmlTransient
    public List<PropertyTaxPayment> getPropertyTaxPaymentList() {
        return propertyTaxPaymentList;
    }

    public void setPropertyTaxPaymentList(List<PropertyTaxPayment> propertyTaxPaymentList) {
        this.propertyTaxPaymentList = propertyTaxPaymentList;
    }

    public HouseInfo getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(HouseInfo houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public LandInfo getLandInfoId() {
        return landInfoId;
    }

    public void setLandInfoId(LandInfo landInfoId) {
        this.landInfoId = landInfoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyTaxCalculationId != null ? propertyTaxCalculationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyTaxCalculation)) {
            return false;
        }
        PropertyTaxCalculation other = (PropertyTaxCalculation) object;
        if ((this.propertyTaxCalculationId == null && other.propertyTaxCalculationId != null) || (this.propertyTaxCalculationId != null && !this.propertyTaxCalculationId.equals(other.propertyTaxCalculationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyTaxCalculation[ propertyTaxCalculationId=" + propertyTaxCalculationId + " ]";
    }

}
