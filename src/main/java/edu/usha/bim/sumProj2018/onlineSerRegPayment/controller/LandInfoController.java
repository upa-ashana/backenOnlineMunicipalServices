
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.LandInfo;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.LandInfoRepo;
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
@RequestMapping(APIConstant.LAND_INFO)
public class LandInfoController {
    @Autowired
    LandInfoRepo landinforepo;
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<LandInfo> getAll(){
        
    return landinforepo.findAll();
    }
    
     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<LandInfo> getLandById(@PathVariable Integer id) {
        return landinforepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public LandInfo saveLand(@RequestBody LandInfo land) {
        return landinforepo.save(land);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public LandInfo updateLand(@RequestBody LandInfo land) {
        return landinforepo.save(land);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteLand(@PathVariable Integer id) {
        landinforepo.deleteById(id);
    }
}
