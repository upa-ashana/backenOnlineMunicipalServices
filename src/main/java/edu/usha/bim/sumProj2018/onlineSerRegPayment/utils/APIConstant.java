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
    public static final String REST_BASE_URL = BASE_URL + REST;
    public static final String USER_URL = REST_BASE_URL + "/user";
    public static final String HOUSE_INFO = REST_BASE_URL + "/houseinfo";   
    public static final String LAND_INFO = REST_BASE_URL + "/landinfo";   
    public static final String PROPERTY_TAX_PAYMENT_URL = REST_BASE_URL + "/taxpayment";      
    public static final String USER_PAY_TAX = PROPERTY_TAX_PAYMENT_URL + "/userpaytax";
    public static final String PROPERTY_TAX_CALCULATION_URL = PROPERTY_TAX_PAYMENT_URL + "/taxcalculation";    
    public static final String USER_DO_NAMSARI_URL = REST_BASE_URL + "/user transfer property";
    public static final String PROPERTY_NAMSARI_URL = USER_DO_NAMSARI_URL + "/transfer";    
    public static final String USER_REGISTER_PROPERTY_URL = REST_BASE_URL + "/User register property";    
    public static final String PROPERTY_REGISTRATION_URL = USER_REGISTER_PROPERTY_URL + "/registration";    
    public static final String USER_PAY_REGISTRATION_FEE_URL = REST_BASE_URL + "/payfee";    
    public static final String REGISTRATION_FEE_PAYMENT_URL = USER_PAY_REGISTRATION_FEE_URL + "/registration payment";

}
