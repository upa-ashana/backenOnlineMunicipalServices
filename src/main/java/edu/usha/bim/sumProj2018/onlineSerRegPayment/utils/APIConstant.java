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
    //usha chaudhary
     public static final String BASE_URL="/municipal";
     public static final String REST="/api";
     public static final String REST_BASE_URL=BASE_URL+REST;
     
     public static final String ONLINESERVICE_URL =REST_BASE_URL+"/onlineservices";  
     //municipal/api/houseinfo/list
     public static final String HOUSE_INFO =REST_BASE_URL+"/houseinfo";   
     //municipal/api/landinfo/list
     public static final String LAND_INFO=REST_BASE_URL+"/landinfo";   
     
     //municipal/api/onlineservices/upt
     public static final String USER_PAY_TAX= ONLINESERVICE_URL+"/upt";  
     //municipal/api/onlineservices/ptc
     public static final String PROPERTY_TAX_CALCULATION_URL=ONLINESERVICE_URL+"/ptc";
     //municipal/api/onlineservices/ptp
     public static final String PROPERTY_TAX_PAYMENT_URL=ONLINESERVICE_URL+"/ptp";   //--   
    
     //municipal/userlogin/list
     public static final String USER_URL=REST_BASE_URL+"/user";
      public static final String LOGIN_URL=BASE_URL+"/login";
     //municipal/api/onlineservices/udn
     public static final String USER_DO_NAMSARI_URL=ONLINESERVICE_URL+"/udn";
     //municipal/api/onlineservices/udn/pn
     public static final String PROPERTY_NAMSARI_URL =USER_DO_NAMSARI_URL+"/pn";
     
      //municipal/api/onlineservices/urp
     public static final String USER_REGISTER_PROPERTY_URL=ONLINESERVICE_URL+"/urp"; 
     //municipal/api/onlineservices/urp/pr
     public static final String PROPERTY_REGISTRATION_URL =USER_REGISTER_PROPERTY_URL+"/pr"; 
     
     //municipal/api/onlineservices/uprf
     public static final String USER_PAY_REGISTRATION_FEE_URL=ONLINESERVICE_URL+"/uprf";
      //municipal/api/onlineservices/uprf/rfp
     public static final String REGISTRATION_FEE_PAYMENT_URL=USER_PAY_REGISTRATION_FEE_URL+"/rfp";
     
     

    
}
