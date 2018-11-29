/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usha
 */
@Entity
@Table(name = "user_login", catalog = "servicepayment", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserLogin.findAll", query = "SELECT u FROM UserLogin u")
    , @NamedQuery(name = "UserLogin.findByUserId", query = "SELECT u FROM UserLogin u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserLogin.findByUserName", query = "SELECT u FROM UserLogin u WHERE u.userName = :userName")
    , @NamedQuery(name = "UserLogin.findByPassword", query = "SELECT u FROM UserLogin u WHERE u.password = :password")
    , @NamedQuery(name = "UserLogin.findByFirstName", query = "SELECT u FROM UserLogin u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "UserLogin.findByLastName", query = "SELECT u FROM UserLogin u WHERE u.lastName = :lastName")
    , @NamedQuery(name = "UserLogin.findByAddress", query = "SELECT u FROM UserLogin u WHERE u.address = :address")
    , @NamedQuery(name = "UserLogin.findByEmail", query = "SELECT u FROM UserLogin u WHERE u.email = :email")
    , @NamedQuery(name = "UserLogin.findByRole", query = "SELECT u FROM UserLogin u WHERE u.role = :role")
    , @NamedQuery(name = "UserLogin.findByGender", query = "SELECT u FROM UserLogin u WHERE u.gender = :gender")
    , @NamedQuery(name = "UserLogin.findByPhone", query = "SELECT u FROM UserLogin u WHERE u.phone = :phone")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId", scope = UserLogin.class)
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    // @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "user_name", length = 45)
    private String userName;
    @Basic(optional = false)
    // @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    // @NotNull
    // @Size(min = 1, max = 45)
    @Column(name = "first_name", length = 45)
    private String firstName;
    @Basic(optional = false)
    // @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "last_name", length = 45)
    private String lastName;
    //@Size(max = 45)
    @Column(name = "address", length = 45)
    private String address;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    // @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;
    @Basic(optional = false)
    // @NotNull
    //@Size(min = 1, max = 6)
    @Column(name = "role", length = 6)
    private String role;
    @Basic(optional = false)
    // @NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "gender", length = 2)
    private String gender;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    //@Size(max = 45)
    @Column(name = "phone", length = 45)
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<UserRegisterProperty> userRegisterPropertyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<UserPayTax> userPayTaxList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<UserDoNamsari> userDoNamsariList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<UserPayRegistrationFee> userPayRegistrationFeeList;

    public UserLogin() {
    }

    public UserLogin(Integer userId) {
        this.userId = userId;
    }

    public UserLogin(Integer userId, String userName, String password, String firstName, String lastName, String role, String gender) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public List<UserRegisterProperty> getUserRegisterPropertyList() {
        return userRegisterPropertyList;
    }

    public void setUserRegisterPropertyList(List<UserRegisterProperty> userRegisterPropertyList) {
        this.userRegisterPropertyList = userRegisterPropertyList;
    }

    @XmlTransient
    public List<UserPayTax> getUserPayTaxList() {
        return userPayTaxList;
    }

    public void setUserPayTaxList(List<UserPayTax> userPayTaxList) {
        this.userPayTaxList = userPayTaxList;
    }

    @XmlTransient
    public List<UserDoNamsari> getUserDoNamsariList() {
        return userDoNamsariList;
    }

    public void setUserDoNamsariList(List<UserDoNamsari> userDoNamsariList) {
        this.userDoNamsariList = userDoNamsariList;
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
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLogin)) {
            return false;
        }
        UserLogin other = (UserLogin) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserLogin[ userId=" + userId + " ]";
    }

}
