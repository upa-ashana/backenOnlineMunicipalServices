/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyTaxCalculation;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.PropertyTaxCalculationRepo;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIConstant.PROPERTY_TAX_CALCULATION_URL)
public class PropertyTaxCalculationController {
    @Autowired
    PropertyTaxCalculationRepo taxcalrepo;
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<PropertyTaxCalculation> getAll(){
        return taxcalrepo.findAll();
    
    }
    
     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyTaxCalculation> getTaxCalById(@PathVariable Integer id) {
        return taxcalrepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public PropertyTaxCalculation saveTaxCal(@RequestBody PropertyTaxCalculation taxcal) {
        return taxcalrepo.save(taxcal);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyTaxCalculation updateTaxCal(@RequestBody PropertyTaxCalculation taxcal) {
        return taxcalrepo.save(taxcal);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteTaxCal(@PathVariable Integer id) {
        taxcalrepo.deleteById(id);
    }
    
}
