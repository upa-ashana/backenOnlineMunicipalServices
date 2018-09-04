/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserDoNamsari;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserDoNamsariRepo;
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
@RequestMapping(APIConstant.USER_DO_NAMSARI_URL)
public class UserDoNamsariController {

    @Autowired
    UserDoNamsariRepo namsarirepo;

    /**
     * this method simply retrieve all the information of UserDoNamsari Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserDoNamsari> getAll() {
        return namsarirepo.findAll();
    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserDoNamsari> getLandById(@PathVariable Integer id) {
        return namsarirepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserDoNamsari saveLand(@RequestBody UserDoNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserDoNamsari updateLand(@RequestBody UserDoNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteLand(@PathVariable Integer id) {
        namsarirepo.deleteById(id);
    }
}
