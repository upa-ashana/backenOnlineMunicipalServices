/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyRegistration;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.PropertyRegistrationRepo;

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
@RequestMapping(APIConstant.PROPERTY_REGISTRATION_URL)
public class PropertyRegistrationController {

    @Autowired
    PropertyRegistrationRepo registrationrepo;

    /**
     * this method simply retrieve all the information of PropertyRegistration
     * Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list")
    public List<PropertyRegistration> getAll() {
        return registrationrepo.findAll();

    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyRegistration> getRegistrationById(@PathVariable Integer id) {
        return registrationrepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes="application/json;charset=UTF-8")
    public PropertyRegistration saveRegistration(@RequestBody PropertyRegistration registration) {
        return registrationrepo.save(registration);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyRegistration updateRegistration(@RequestBody PropertyRegistration registration) {
        return registrationrepo.save(registration);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteRegistration(@PathVariable Integer id) {
        registrationrepo.deleteById(id);
    }

}
