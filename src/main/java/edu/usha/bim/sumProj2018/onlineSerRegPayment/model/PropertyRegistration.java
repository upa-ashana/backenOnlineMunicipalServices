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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "property_registration", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyRegistration.findAll", query = "SELECT p FROM PropertyRegistration p")
    , @NamedQuery(name = "PropertyRegistration.findByPropertyRegistrationId", query = "SELECT p FROM PropertyRegistration p WHERE p.propertyRegistrationId = :propertyRegistrationId")
    , @NamedQuery(name = "PropertyRegistration.findByOwnerName", query = "SELECT p FROM PropertyRegistration p WHERE p.ownerName = :ownerName")
    , @NamedQuery(name = "PropertyRegistration.findByCitizonNo", query = "SELECT p FROM PropertyRegistration p WHERE p.citizonNo = :citizonNo")
    , @NamedQuery(name = "PropertyRegistration.findByPhoneNo", query = "SELECT p FROM PropertyRegistration p WHERE p.phoneNo = :phoneNo")
    , @NamedQuery(name = "PropertyRegistration.findByRegion", query = "SELECT p FROM PropertyRegistration p WHERE p.region = :region")
    , @NamedQuery(name = "PropertyRegistration.findByWardNo", query = "SELECT p FROM PropertyRegistration p WHERE p.wardNo = :wardNo")
    , @NamedQuery(name = "PropertyRegistration.findByKittaNo", query = "SELECT p FROM PropertyRegistration p WHERE p.kittaNo = :kittaNo")
    , @NamedQuery(name = "PropertyRegistration.findByHouseNo", query = "SELECT p FROM PropertyRegistration p WHERE p.houseNo = :houseNo")
    , @NamedQuery(name = "PropertyRegistration.findByNoOfRoom", query = "SELECT p FROM PropertyRegistration p WHERE p.noOfRoom = :noOfRoom")
    , @NamedQuery(name = "PropertyRegistration.findByNoOfFlat", query = "SELECT p FROM PropertyRegistration p WHERE p.noOfFlat = :noOfFlat")
    , @NamedQuery(name = "PropertyRegistration.findByHouseArea", query = "SELECT p FROM PropertyRegistration p WHERE p.houseArea = :houseArea")
    , @NamedQuery(name = "PropertyRegistration.findByLandArea", query = "SELECT p FROM PropertyRegistration p WHERE p.landArea = :landArea")
    , @NamedQuery(name = "PropertyRegistration.findByNoOfAnna", query = "SELECT p FROM PropertyRegistration p WHERE p.noOfAnna = :noOfAnna")
    , @NamedQuery(name = "PropertyRegistration.findByStreetName", query = "SELECT p FROM PropertyRegistration p WHERE p.streetName = :streetName")
    , @NamedQuery(name = "PropertyRegistration.findByRegisterDate", query = "SELECT p FROM PropertyRegistration p WHERE p.registerDate = :registerDate")
    , @NamedQuery(name = "PropertyRegistration.findByRegistrationFee", query = "SELECT p FROM PropertyRegistration p WHERE p.registrationFee = :registrationFee")})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="propertyRegistrationId")
public class PropertyRegistration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "property_registration_id")
    private Integer propertyRegistrationId;
    @Basic(optional = false)
    @NotNull  
    @Column(name = "owner_name", length = 45)
    private String ownerName;
    @Basic(optional = false)
    @NotNull  
    @Column(name = "citizon_no", length = 45)
    private String citizonNo;
    @Basic(optional = false)
    @NotNull    
    @Column(name = "phone_no", length = 45)
    private String phoneNo;
    @Basic(optional = false)
    @NotNull   
    @Column(name = "region", length = 45)
    private String region;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ward_no")
    private int wardNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kitta_no")
    private int kittaNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "house_no")
    private int houseNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_of_room")
    private int noOfRoom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_of_flat")
    private int noOfFlat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "house_area")
    private float houseArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "land_area")
    private float landArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_of_anna")
    private float noOfAnna;
    @Basic(optional = false)
    @NotNull    
    @Column(name = "street_name", length = 45)
    private String streetName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "register_date")
    @Temporal(TemporalType.DATE)
    private Date registerDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registration_fee")
    private float registrationFee;
    @Basic(optional = false)
    @NotNull
    @Lob   
    @Column(name = "owner_signature", length = 2147483647)
    private String ownerSignature;
    @Basic(optional = false)
    @NotNull
    @Lob   
    @Column(name = "wardsachib_signature", length = 2147483647)
    private String wardsachibSignature;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyRegistrationId")
    private List<UserRegisterProperty> userRegisterPropertyList;

    public PropertyRegistration() {
    }

    public PropertyRegistration(Integer propertyRegistrationId) {
        this.propertyRegistrationId = propertyRegistrationId;
    }

    public PropertyRegistration(Integer propertyRegistrationId, String ownerName, String citizonNo, String phoneNo, String region, int wardNo, int kittaNo, int houseNo, int noOfRoom, int noOfFlat, float houseArea, float landArea, float noOfAnna, String streetName, Date registerDate, float registrationFee, String ownerSignature, String wardsachibSignature) {
        this.propertyRegistrationId = propertyRegistrationId;
        this.ownerName = ownerName;
        this.citizonNo = citizonNo;
        this.phoneNo = phoneNo;
        this.region = region;
        this.wardNo = wardNo;
        this.kittaNo = kittaNo;
        this.houseNo = houseNo;
        this.noOfRoom = noOfRoom;
        this.noOfFlat = noOfFlat;
        this.houseArea = houseArea;
        this.landArea = landArea;
        this.noOfAnna = noOfAnna;
        this.streetName = streetName;
        this.registerDate = registerDate;
        this.registrationFee = registrationFee;
        this.ownerSignature = ownerSignature;
        this.wardsachibSignature = wardsachibSignature;
    }

    public Integer getPropertyRegistrationId() {
        return propertyRegistrationId;
    }

    public void setPropertyRegistrationId(Integer propertyRegistrationId) {
        this.propertyRegistrationId = propertyRegistrationId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCitizonNo() {
        return citizonNo;
    }

    public void setCitizonNo(String citizonNo) {
        this.citizonNo = citizonNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public int getKittaNo() {
        return kittaNo;
    }

    public void setKittaNo(int kittaNo) {
        this.kittaNo = kittaNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public int getNoOfFlat() {
        return noOfFlat;
    }

    public void setNoOfFlat(int noOfFlat) {
        this.noOfFlat = noOfFlat;
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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public float getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(float registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getOwnerSignature() {
        return ownerSignature;
    }

    public void setOwnerSignature(String ownerSignature) {
        this.ownerSignature = ownerSignature;
    }

    public String getWardsachibSignature() {
        return wardsachibSignature;
    }

    public void setWardsachibSignature(String wardsachibSignature) {
        this.wardsachibSignature = wardsachibSignature;
    }

    @XmlTransient
    public List<UserRegisterProperty> getUserRegisterPropertyList() {
        return userRegisterPropertyList;
    }

    public void setUserRegisterPropertyList(List<UserRegisterProperty> userRegisterPropertyList) {
        this.userRegisterPropertyList = userRegisterPropertyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyRegistrationId != null ? propertyRegistrationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyRegistration)) {
            return false;
        }
        PropertyRegistration other = (PropertyRegistration) object;
        if ((this.propertyRegistrationId == null && other.propertyRegistrationId != null) || (this.propertyRegistrationId != null && !this.propertyRegistrationId.equals(other.propertyRegistrationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyRegistration[ propertyRegistrationId=" + propertyRegistrationId + " ]";
    }
    
}
