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

    /**
     * this method simply retrieve all the information of PropertyTaxCalculation
     * Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<PropertyTaxCalculation> getAll() {
        return taxcalrepo.findAll();

    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyTaxCalculation> getTaxCalById(@PathVariable Integer id) {
        return taxcalrepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public PropertyTaxCalculation saveTaxCal(@RequestBody PropertyTaxCalculation taxcal) {
        return taxcalrepo.save(taxcal);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyTaxCalculation updateTaxCal(@RequestBody PropertyTaxCalculation taxcal) {
        return taxcalrepo.save(taxcal);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteTaxCal(@PathVariable Integer id) {
        taxcalrepo.deleteById(id);
    }

}
