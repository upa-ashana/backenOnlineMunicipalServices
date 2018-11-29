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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "property_namsari", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyNamsari.findAll", query = "SELECT p FROM PropertyNamsari p")
    , @NamedQuery(name = "PropertyNamsari.findByPropertyNamsariId", query = "SELECT p FROM PropertyNamsari p WHERE p.propertyNamsariId = :propertyNamsariId")
    , @NamedQuery(name = "PropertyNamsari.findByGiverName", query = "SELECT p FROM PropertyNamsari p WHERE p.giverName = :giverName")
    , @NamedQuery(name = "PropertyNamsari.findByGiverMobileNo", query = "SELECT p FROM PropertyNamsari p WHERE p.giverMobileNo = :giverMobileNo")
    , @NamedQuery(name = "PropertyNamsari.findByGiverCitizenNo", query = "SELECT p FROM PropertyNamsari p WHERE p.giverCitizenNo = :giverCitizenNo")
    , @NamedQuery(name = "PropertyNamsari.findByGiverRegion", query = "SELECT p FROM PropertyNamsari p WHERE p.giverRegion = :giverRegion")
    , @NamedQuery(name = "PropertyNamsari.findByGiverWardNo", query = "SELECT p FROM PropertyNamsari p WHERE p.giverWardNo = :giverWardNo")
    , @NamedQuery(name = "PropertyNamsari.findByTakerName", query = "SELECT p FROM PropertyNamsari p WHERE p.takerName = :takerName")
    , @NamedQuery(name = "PropertyNamsari.findByTakerMobileNo", query = "SELECT p FROM PropertyNamsari p WHERE p.takerMobileNo = :takerMobileNo")
    , @NamedQuery(name = "PropertyNamsari.findByTakerCitizenNo", query = "SELECT p FROM PropertyNamsari p WHERE p.takerCitizenNo = :takerCitizenNo")
    , @NamedQuery(name = "PropertyNamsari.findByTakerRegion", query = "SELECT p FROM PropertyNamsari p WHERE p.takerRegion = :takerRegion")
    , @NamedQuery(name = "PropertyNamsari.findByTakerWardNo", query = "SELECT p FROM PropertyNamsari p WHERE p.takerWardNo = :takerWardNo")
    , @NamedQuery(name = "PropertyNamsari.findByKittaNo", query = "SELECT p FROM PropertyNamsari p WHERE p.kittaNo = :kittaNo")
    , @NamedQuery(name = "PropertyNamsari.findByHouseNo", query = "SELECT p FROM PropertyNamsari p WHERE p.houseNo = :houseNo")
    , @NamedQuery(name = "PropertyNamsari.findByHouseArea", query = "SELECT p FROM PropertyNamsari p WHERE p.houseArea = :houseArea")
    , @NamedQuery(name = "PropertyNamsari.findByLandArea", query = "SELECT p FROM PropertyNamsari p WHERE p.landArea = :landArea")
    , @NamedQuery(name = "PropertyNamsari.findByNoOfAnna", query = "SELECT p FROM PropertyNamsari p WHERE p.noOfAnna = :noOfAnna")
    , @NamedQuery(name = "PropertyNamsari.findByDate", query = "SELECT p FROM PropertyNamsari p WHERE p.date = :date")
    , @NamedQuery(name = "PropertyNamsari.findByTransferFee", query = "SELECT p FROM PropertyNamsari p WHERE p.transferFee = :transferFee")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "propertyNamsariId")
public class PropertyNamsari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "property_namsari_id")
    private Integer propertyNamsariId;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "giver_name", length = 45)
    private String giverName;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "giver_mobile_no", length = 45)
    private String giverMobileNo;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "giver_citizen_no", length = 45)
    private String giverCitizenNo;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "giver_region", length = 45)
    private String giverRegion;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "giver_ward_no")
    private int giverWardNo;
    @Basic(optional = false)
//    @NotNull
    @Lob
    //@Size(min = 1, max = 2147483647)
    @Column(name = "giver_signature", length = 2147483647)
    private String giverSignature;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "taker_name", length = 45)
    private String takerName;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "taker_mobile_no", length = 45)
    private String takerMobileNo;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "taker_citizen_no", length = 45)
    private String takerCitizenNo;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "taker_region", length = 45)
    private String takerRegion;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "taker_ward_no")
    private int takerWardNo;
    @Basic(optional = false)
//    @NotNull
    @Lob
    //@Size(min = 1, max = 2147483647)
    @Column(name = "taker_signature", length = 2147483647)
    private String takerSignature;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "kitta_no")
    private int kittaNo;
    @Basic(optional = false)
//    @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "house_no", length = 45)
    private String houseNo;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "house_area")
    private float houseArea;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "land_area")
    private float landArea;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "no_of_anna")
    private float noOfAnna;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "transfer_fee")
    private float transferFee;
    @Basic(optional = false)
    //@Size(min = 1, max = 45)
//    @Column(name = "writing_type", length = 45)
//    private String writingType;
//    @Basic(optional = false)
//    @NotNull
    @Lob
    //@Size(min = 1, max = 2147483647)
    @Column(name = "wardsachib_signature", length = 2147483647)
    private String wardsachibSignature;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyNamsariId")
    private List<UserDoNamsari> userDoNamsariList;

    public PropertyNamsari() {
    }

//    public PropertyNamsari(Integer propertyNamsariId) {
//        this.propertyNamsariId = propertyNamsariId;
//    }
//
//    public PropertyNamsari(Integer properytNamsariId, String giverName, String giverMobileNo, String giverCitizenNo, String giverRegion, int giverWardNo, String giverSignature, String takerName, String takerMobileNo, String takerCitizenNo, String takerRegion, int takerWardNo, String takerSignature, int kittaNo, String houseNo, float houseArea, float landArea, float noOfAnna, Date date, float transferFee, String wardsachibSignature) {
//        this.propertyNamsariId = properytNamsariId;
//        this.giverName = giverName;
//        this.giverMobileNo = giverMobileNo;
//        this.giverCitizenNo = giverCitizenNo;
//        this.giverRegion = giverRegion;
//        this.giverWardNo = giverWardNo;
//        this.giverSignature = giverSignature;
//        this.takerName = takerName;
//        this.takerMobileNo = takerMobileNo;
//        this.takerCitizenNo = takerCitizenNo;
//        this.takerRegion = takerRegion;
//        this.takerWardNo = takerWardNo;
//        this.takerSignature = takerSignature;
//        this.kittaNo = kittaNo;
//        this.houseNo = houseNo;
//        this.houseArea = houseArea;
//        this.landArea = landArea;
//        this.noOfAnna = noOfAnna;
//        this.date = date;
//        this.transferFee = transferFee;
//        this.wardsachibSignature = wardsachibSignature;
//    }public PropertyNamsari(Integer propertyNamsariId) {
//        this.propertyNamsariId = propertyNamsariId;
//    }
//
//    public PropertyNamsari(Integer properytNamsariId, String giverName, String giverMobileNo, String giverCitizenNo, String giverRegion, int giverWardNo, String giverSignature, String takerName, String takerMobileNo, String takerCitizenNo, String takerRegion, int takerWardNo, String takerSignature, int kittaNo, String houseNo, float houseArea, float landArea, float noOfAnna, Date date, float transferFee, String wardsachibSignature) {
//        this.propertyNamsariId = properytNamsariId;
//        this.giverName = giverName;
//        this.giverMobileNo = giverMobileNo;
//        this.giverCitizenNo = giverCitizenNo;
//        this.giverRegion = giverRegion;
//        this.giverWardNo = giverWardNo;
//        this.giverSignature = giverSignature;
//        this.takerName = takerName;
//        this.takerMobileNo = takerMobileNo;
//        this.takerCitizenNo = takerCitizenNo;
//        this.takerRegion = takerRegion;
//        this.takerWardNo = takerWardNo;
//        this.takerSignature = takerSignature;
//        this.kittaNo = kittaNo;
//        this.houseNo = houseNo;
//        this.houseArea = houseArea;
//        this.landArea = landArea;
//        this.noOfAnna = noOfAnna;
//        this.date = date;
//        this.transferFee = transferFee;
//        this.wardsachibSignature = wardsachibSignature;
//    }

    public Integer getProperytNamsariId() {
        return propertyNamsariId;
    }

    public void setProperytNamsariId(Integer properytNamsariId) {
        this.propertyNamsariId = properytNamsariId;
    }

    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }

    public String getGiverMobileNo() {
        return giverMobileNo;
    }

    public void setGiverMobileNo(String giverMobileNo) {
        this.giverMobileNo = giverMobileNo;
    }

    public String getGiverCitizenNo() {
        return giverCitizenNo;
    }

    public void setGiverCitizonNo(String giverCitizonNo) {
        this.giverCitizenNo = giverCitizonNo;
    }

    public String getGiverRegion() {
        return giverRegion;
    }

    public void setGiverRegion(String giverRegion) {
        this.giverRegion = giverRegion;
    }

    public int getGiverWardNo() {
        return giverWardNo;
    }

    public void setGiverWardNo(int giverWardNo) {
        this.giverWardNo = giverWardNo;
    }

    public String getGiverSignature() {
        return giverSignature;
    }

    public void setGiverSignature(String giverSignature) {
        this.giverSignature = giverSignature;
    }

    public String getTakerName() {
        return takerName;
    }

    public void setTakerName(String takerName) {
        this.takerName = takerName;
    }

    public String getTakerMobileNo() {
        return takerMobileNo;
    }

    public void setTakerMobileNo(String takerMobileNo) {
        this.takerMobileNo = takerMobileNo;
    }

    public String getTakerCitizenNo() {
        return takerCitizenNo;
    }

    public void setTakerCitizenNo(String takerCitizenNo) {
        this.takerCitizenNo = takerCitizenNo;
    }

    public String getTakerRegion() {
        return takerRegion;
    }

    public void setTakerRegion(String takerRegion) {
        this.takerRegion = takerRegion;
    }

    public int getTakerWardNo() {
        return takerWardNo;
    }

    public void setTakerWardNo(int takerWardNo) {
        this.takerWardNo = takerWardNo;
    }

    public String getTakerSignature() {
        return takerSignature;
    }

    public void setTakerSignature(String takerSignature) {
        this.takerSignature = takerSignature;
    }

    public int getKittaNo() {
        return kittaNo;
    }

    public void setKittaNo(int kittaNo) {
        this.kittaNo = kittaNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public float getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(float houseArea) {
        this.houseArea = houseArea;
    }

    public float getLandArea() {
        return landArea;
    }

    public void setLandArea(float landArea) {
        this.landArea = landArea;
    }

    public float getNoOfAnna() {
        return noOfAnna;
    }

    public void setNoOfAnna(float noOfAnna) {
        this.noOfAnna = noOfAnna;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(float transferFee) {
        this.transferFee = transferFee;
    }

    public String getWardSachibSignature() {
        return wardsachibSignature;
    }

    public void setWardsachibSignature(String wardsachibSignature) {
        this.wardsachibSignature = wardsachibSignature;
    }

    @XmlTransient
    public List<UserDoNamsari> getUserDoNamsariList() {
        return userDoNamsariList;
    }

    public void setUserDoNamsariList(List<UserDoNamsari> userDoNamsariList) {
        this.userDoNamsariList = userDoNamsariList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyNamsariId != null ? propertyNamsariId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyNamsari)) {
            return false;
        }
        PropertyNamsari other = (PropertyNamsari) object;
        if ((this.propertyNamsariId == null && other.propertyNamsariId != null) || (this.propertyNamsariId != null && !this.propertyNamsariId.equals(other.propertyNamsariId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyNamsari[ propertyNamsariId=" + this.propertyNamsariId + " ]";
    }

}
