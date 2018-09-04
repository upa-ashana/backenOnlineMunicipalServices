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

    /**
     * this method simply retrieve all the information of RegistrationFeePayment
     * Table
     *  list is a type of return which return all the record of database
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<RegistrationFeePayment> getAll() {
        return regisfeerepo.findAll();

    }

    /**
     * this method simply display information of particular given id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<RegistrationFeePayment> getRegistFeePayById(@PathVariable Integer id) {
        return regisfeerepo.findById(id);
    }

    /**
     * this method save the record in database
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RegistrationFeePayment saveRegistFeePay(@RequestBody RegistrationFeePayment registfeepay) {
        return regisfeerepo.save(registfeepay);
    }

    /**
     * update the record of database
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RegistrationFeePayment updateRegistFeePay(@RequestBody RegistrationFeePayment registfeepay) {
        return regisfeerepo.save(registfeepay);
    }

    /**
     * delete the record according to id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteRegistFeePay(@PathVariable Integer id) {
        regisfeerepo.deleteById(id);
    }

}
