
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.RegistrationFeePayment;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.RegistrationFeePaymentRepo;
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
@RequestMapping(APIConstant.REGISTRATION_FEE_PAYMENT_URL)
public class RegistrationFeePaymentController {
    @Autowired
    RegistrationFeePaymentRepo regisfeerepo;
    @RequestMapping(value="list",method = RequestMethod.GET)
    public List<RegistrationFeePayment> getAll(){
        return regisfeerepo.findAll();
    
    }
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<RegistrationFeePayment> getRegistFeePayById(@PathVariable Integer id) {
        return regisfeerepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RegistrationFeePayment saveRegistFeePay(@RequestBody RegistrationFeePayment registfeepay) {
        return regisfeerepo.save(registfeepay);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RegistrationFeePayment updateRegistFeePay(@RequestBody RegistrationFeePayment registfeepay) {
        return regisfeerepo.save(registfeepay);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteRegistFeePay(@PathVariable Integer id) {
        regisfeerepo.deleteById(id);
    }

    
}
