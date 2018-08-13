
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
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<PropertyNamsari> getAll(){
        return namsarirepo.findAll();
    
    }
    
     
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<PropertyNamsari> getNamsariById(@PathVariable Integer id) {
        return namsarirepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public PropertyNamsari saveNamsari(@RequestBody PropertyNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public PropertyNamsari updateNamsari(@RequestBody PropertyNamsari namsari) {
        return namsarirepo.save(namsari);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteNamsari(@PathVariable Integer id) {
        namsarirepo.deleteById(id);
    }
    
    
}
