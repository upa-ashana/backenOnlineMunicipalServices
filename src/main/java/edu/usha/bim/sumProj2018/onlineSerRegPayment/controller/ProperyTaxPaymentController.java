/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyTaxPayment;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.PropertyTaxPaymentRepo;
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
@RequestMapping(APIConstant.PROPERTY_TAX_PAYMENT_URL)
public class ProperyTaxPaymentController {

    @Autowired
    PropertyTaxPaymentRepo taxpayrepo;

    /**
     * this method simply retrieve all the information of PropertyTaxPayment
     * Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<PropertyTaxPayment> getAll() {
        return taxpayrepo.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyTaxPayment> getTaxPayById(@PathVariable Integer id) {
        return taxpayrepo.findById(id);
    }

    
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes="application/json;charset=UTF-8")
    public PropertyTaxPayment saveTaxPay(@RequestBody PropertyTaxPayment taxpay) {
        return taxpayrepo.save(taxpay);
    }

   
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyTaxPayment updateTaxPay(@RequestBody PropertyTaxPayment taxpay) {
        return taxpayrepo.save(taxpay);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletetaxPay(@PathVariable Integer id) {
        taxpayrepo.deleteById(id);
    }

}
