package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.PropertyNamsari;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.PropertyNamsariRepo;

@RestController
@RequestMapping(APIConstant.PROPERTY_NAMSARI_URL)
public class PropertyNamsariController {

    @Autowired
    PropertyNamsariRepo namsarirepo;

    /**
     * this method simply retrieve all the information of PropertyNamsari Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<PropertyNamsari> getAll() {
        return namsarirepo.findAll();

    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyNamsari> getNamsariById(@PathVariable Integer id) {
        return namsarirepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public PropertyNamsari saveNamsari(@RequestBody PropertyNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyNamsari updateNamsari(@RequestBody PropertyNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteNamsari(@PathVariable Integer id) {
        namsarirepo.deleteById(id);
    }

}
