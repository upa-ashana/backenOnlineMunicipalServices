package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.HouseInfo;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.HouseInfoRepo;
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
@RequestMapping(APIConstant.HOUSE_INFO)
public class HouseInfoController {

    @Autowired
    HouseInfoRepo houseinforepo;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    /**
     * this method simply retrieve  all the information of HouseInfo Table
     * list is a type of return which return all the record of database
     */
    public List<HouseInfo> getAll() {
        return houseinforepo.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public Optional<HouseInfo> getHouseById(@PathVariable Integer id) {
        return houseinforepo.findById(id);
    }
        
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes="application/json;charset=UTF-8")
        public HouseInfo saveHuse(@RequestBody HouseInfo house) {
        return houseinforepo.save(house);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)      
       public HouseInfo updateHouse(@RequestBody HouseInfo house) {
        return houseinforepo.save(house);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
        public void deleteHouse(@PathVariable Integer id) {
        houseinforepo.deleteById(id);
    }

}
