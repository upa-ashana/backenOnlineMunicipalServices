/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.services;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyTaxCalculation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyTaxCalculationRepo extends JpaRepository<PropertyTaxCalculation, Integer>{
    
}
