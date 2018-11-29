/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.utils;

/**
 *
 * @author usha
 */
public class APIConstant {

    
    public static final String BASE_URL = "/municipal";
    public static final String REST = "/api";    
    public static final String REST_BASE_URL = BASE_URL + REST; //"/municipal/api"
    public static final String USER_URL = REST_BASE_URL + "/user"; //"/municipal/api/user"
    public static final String HOUSE_INFO = REST_BASE_URL + "/houseinfo"; //"/municipal/api/houseinfo"  
    public static final String LAND_INFO = REST_BASE_URL + "/landinfo";  //"/municipal/api/landinfo" 
    public static final String USER_PAY_TAX = REST_BASE_URL + "/userpaytax";//"/municipal/api/userpaytax"
    public static final String PROPERTY_TAX_PAYMENT_URL = USER_PAY_TAX + "/taxpayment"; //"/municipal/api/userpaytax/taxpayment     
    
    public static final String PROPERTY_TAX_CALCULATION_URL = PROPERTY_TAX_PAYMENT_URL + "/taxcalculation"; //"/municipal/api/taxpayment/taxcalculation"   
    public static final String USER_DO_NAMSARI_URL = REST_BASE_URL + "/usertransferproperty"; //"/municipal/api/usertransferproperty"
    public static final String PROPERTY_NAMSARI_URL = USER_DO_NAMSARI_URL + "/transfer";  //"/municipal/api/usertransferproperty/transfer"  
    public static final String USER_REGISTER_PROPERTY_URL = REST_BASE_URL + "/userregisterproperty"; //"/municipal/api/userregisterproperty"   
    public static final String PROPERTY_REGISTRATION_URL = USER_REGISTER_PROPERTY_URL + "/registration"; //"/municipal/api/userregisterproperty/registration"    
    public static final String USER_PAY_REGISTRATION_FEE_URL = REST_BASE_URL + "/payfee"; //"/municipal/api/payfee" 
    public static final String REGISTRATION_FEE_PAYMENT_URL = USER_PAY_REGISTRATION_FEE_URL + "/registrationpayment"; //"/municipal/api/payfee/registrationpayment"

}
