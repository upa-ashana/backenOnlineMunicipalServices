/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserPayRegistrationFee;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserPayRegistrationFeeRepo;
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
@RequestMapping(APIConstant.USER_PAY_REGISTRATION_FEE_URL)
public class UserPayRegistrationFeeController {

    @Autowired
    UserPayRegistrationFeeRepo payregistfeerepo;

    /**
     * this method simply retrieve all the information of UserPayRegistrationFee
     * Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserPayRegistrationFee> getAll() {
        return payregistfeerepo.findAll();
    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserPayRegistrationFee> getPayRegistrationFeeById(@PathVariable Integer id) {
        return payregistfeerepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserPayRegistrationFee savePayRegistrationFee(@RequestBody UserPayRegistrationFee payregistfee) {
        return payregistfeerepo.save(payregistfee);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserPayRegistrationFee updatePayRegistrationFee(@RequestBody UserPayRegistrationFee payregistfee) {
        return payregistfeerepo.save(payregistfee);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletePayRegistrationFee(@PathVariable Integer id) {
        payregistfeerepo.deleteById(id);
    }
}
