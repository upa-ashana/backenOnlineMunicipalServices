/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserLogin;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping(APIConstant.USER_URL)
public class UserController {
    @Autowired
    UserRepo userrepo;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
  @RequestMapping(value="/list", method =RequestMethod.GET )
  public List<UserLogin> getAll(){
       return userrepo.findAll();
   
   }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserLogin> getUserById(@PathVariable Integer id) {
        return userrepo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserLogin saveUser(@RequestBody UserLogin user) {
       String password=user.getPassword();
       if(password!=null||!password.isEmpty()){
       user.setPassword(passwordEncoder.encode(password));
       }        
        return userrepo.save(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserLogin updateUser(@RequestBody UserLogin user) {
         String password=user.getPassword();
       if(password!=null||!password.isEmpty()){
       user.setPassword(passwordEncoder.encode(password));
       }
        return userrepo.save(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id) {
        userrepo.deleteById(id);
    }
  
    
}
