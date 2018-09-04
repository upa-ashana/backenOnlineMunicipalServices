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
@Table(name = "house_info", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HouseInfo.findAll", query = "SELECT h FROM HouseInfo h")
    , @NamedQuery(name = "HouseInfo.findByHouseInfoId", query = "SELECT h FROM HouseInfo h WHERE h.houseInfoId = :houseInfoId")
    , @NamedQuery(name = "HouseInfo.findByHouseNo", query = "SELECT h FROM HouseInfo h WHERE h.houseNo = :houseNo")
    , @NamedQuery(name = "HouseInfo.findByWardNo", query = "SELECT h FROM HouseInfo h WHERE h.wardNo = :wardNo")
    , @NamedQuery(name = "HouseInfo.findByStreetName", query = "SELECT h FROM HouseInfo h WHERE h.streetName = :streetName")
    , @NamedQuery(name = "HouseInfo.findByHouseArea", query = "SELECT h FROM HouseInfo h WHERE h.houseArea = :houseArea")
    , @NamedQuery(name = "HouseInfo.findByHousePrice", query = "SELECT h FROM HouseInfo h WHERE h.housePrice = :housePrice")
    , @NamedQuery(name = "HouseInfo.findByTotalHouseValue", query = "SELECT h FROM HouseInfo h WHERE h.totalHouseValue = :totalHouseValue")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "houseInfoId")
public class HouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "house_info_id")
    private Integer houseInfoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "house_no")
    private int houseNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ward_no")
    private int wardNo;
    @Basic(optional = false)
    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "street_name", length = 45)
    private String streetName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "house_area")
    private float houseArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "house_price")
    private double housePrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_house_value")
    private double totalHouseValue;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "houseInfoId")
    private List<PropertyTaxCalculation> propertyTaxCalculationList;

    public HouseInfo() {
    }

    public HouseInfo(Integer houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public HouseInfo(Integer houseInfoId, int houseNo, int wardNo, String streetName, float houseArea, double housePrice, double totalHouseValue) {
        this.houseInfoId = houseInfoId;
        this.houseNo = houseNo;
        this.wardNo = wardNo;
        this.streetName = streetName;
        this.houseArea = houseArea;
        this.housePrice = housePrice;
        this.totalHouseValue = totalHouseValue;
    }

    public Integer getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(Integer houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public float getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(float houseArea) {
        this.houseArea = houseArea;
    }

    public double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(double housePrice) {
        this.housePrice = housePrice;
    }

    public double getTotalHouseValue() {
        return totalHouseValue;
    }

    public void setTotalHouseValue(double totalHouseValue) {
        this.totalHouseValue = totalHouseValue;
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
        hash += (houseInfoId != null ? houseInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HouseInfo)) {
            return false;
        }
        HouseInfo other = (HouseInfo) object;
        if ((this.houseInfoId == null && other.houseInfoId != null) || (this.houseInfoId != null && !this.houseInfoId.equals(other.houseInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.HouseInfo[ houseInfoId=" + houseInfoId + " ]";
    }

}
