/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;


import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserRegisterProperty;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserRegisterPropertyRepo;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(APIConstant.USER_REGISTER_PROPERTY_URL)
public class UserRegisterPropertyController {
 
    @Autowired
    UserRegisterPropertyRepo propertyregisterrepo;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserRegisterProperty> getAll(){
    return propertyregisterrepo.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserRegisterProperty> getUserRegisterPropertyById(@PathVariable Integer id) {
        return propertyregisterrepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserRegisterProperty saveUserRegisterProperty(@RequestBody UserRegisterProperty propertyregister) {
        return propertyregisterrepo.save(propertyregister);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserRegisterProperty updateUserRegisterProperty(@RequestBody UserRegisterProperty propertyregister) {
        return propertyregisterrepo.save(propertyregister);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUserRegisterProperty(@PathVariable Integer id) {
        propertyregisterrepo.deleteById(id);
    }
}
