/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserPayTax;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserpayTaxRepo;
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
@RequestMapping(APIConstant.USER_PAY_TAX)
public class UserPayTaxController {
    
    @Autowired
    UserpayTaxRepo paytaxrepo;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserPayTax> getAll(){
    return paytaxrepo.findAll();
    }
    
     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserPayTax> getUserPayTaxById(@PathVariable Integer id) {
        return paytaxrepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserPayTax saveUserPayTax(@RequestBody UserPayTax userpaytax) {
        return paytaxrepo.save(userpaytax);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserPayTax updateUserPayTax(@RequestBody UserPayTax userpaytax) {
        return paytaxrepo.save(userpaytax);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUserPayTaxe(@PathVariable Integer id) {
        paytaxrepo.deleteById(id);
    }
    
}
