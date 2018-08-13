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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "land_info", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LandInfo.findAll", query = "SELECT l FROM LandInfo l")
    , @NamedQuery(name = "LandInfo.findByLandInfoId", query = "SELECT l FROM LandInfo l WHERE l.landInfoId = :landInfoId")
    , @NamedQuery(name = "LandInfo.findByStreetName", query = "SELECT l FROM LandInfo l WHERE l.streetName = :streetName")
    , @NamedQuery(name = "LandInfo.findByNoOfAnna", query = "SELECT l FROM LandInfo l WHERE l.noOfAnna = :noOfAnna")
    , @NamedQuery(name = "LandInfo.findByPriceInAana", query = "SELECT l FROM LandInfo l WHERE l.priceInAana = :priceInAana")
    , @NamedQuery(name = "LandInfo.findByLandArea", query = "SELECT l FROM LandInfo l WHERE l.landArea = :landArea")
    , @NamedQuery(name = "LandInfo.findByLandQuality", query = "SELECT l FROM LandInfo l WHERE l.landQuality = :landQuality")
    , @NamedQuery(name = "LandInfo.findByTotalLandValue", query = "SELECT l FROM LandInfo l WHERE l.totalLandValue = :totalLandValue")})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="landInfoId")
public class LandInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "land_info_id")
    private Integer landInfoId;

    @Basic(optional = false)
    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "street_name", length = 45)
    private String streetName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_of_anna")
    private float noOfAnna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price_in_aana")
    private double priceInAana;
    @Basic(optional = false)
    @NotNull
    @Column(name = "land_area")
    private float landArea;
    @Basic(optional = false)
    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "land_quality", length = 45)
    private String landQuality;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_land_value")
    private double totalLandValue;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "landInfoId")
    private List<PropertyTaxCalculation> propertyTaxCalculationList;

    public LandInfo() {
    }

    public LandInfo(Integer landInfoId) {
        this.landInfoId = landInfoId;
    }

    public LandInfo(Integer landInfoId, String streetName, float noOfAnna, double priceInAana, float landArea, String landQuality, double totalLandValue) {
        this.landInfoId = landInfoId;
        
        this.streetName = streetName;
        this.noOfAnna = noOfAnna;
        this.priceInAana = priceInAana;
        this.landArea = landArea;
        this.landQuality = landQuality;
        this.totalLandValue = totalLandValue;
    }

    public Integer getLandInfoId() {
        return landInfoId;
    }

    public void setLandInfoId(Integer landInfoId) {
        this.landInfoId = landInfoId;
    }

 
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public float getNoOfAnna() {
        return noOfAnna;
    }

    public void setNoOfAnna(float noOfAnna) {
        this.noOfAnna = noOfAnna;
    }

    public double getPriceInAana() {
        return priceInAana;
    }

    public void setPriceInAana(double priceInAana) {
        this.priceInAana = priceInAana;
    }

    public float getLandArea() {
        return landArea;
    }

    public void setLandArea(float landArea) {
        this.landArea = landArea;
    }

    public String getLandQuality() {
        return landQuality;
    }

    public void setLandQuality(String landQuality) {
        this.landQuality = landQuality;
    }

    public double getTotalLandValue() {
        return totalLandValue;
    }

    public void setTotalLandValue(double totalLandValue) {
        this.totalLandValue = totalLandValue;
    }

    @XmlTransient
    public List<PropertyTaxCalculation> getPropertyTaxCalculationList() {
        return propertyTaxCalculationList;
    }

    public void setPropertyTaxCalculationList(List<PropertyTaxCalculation> propertyTaxCalculationList) {
        this.propertyTaxCalculationList = propertyTaxCalculationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (landInfoId != null ? landInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LandInfo)) {
            return false;
        }
        LandInfo other = (LandInfo) object;
        if ((this.landInfoId == null && other.landInfoId != null) || (this.landInfoId != null && !this.landInfoId.equals(other.landInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.LandInfo[ landInfoId=" + landInfoId + " ]";
    }
    
}
