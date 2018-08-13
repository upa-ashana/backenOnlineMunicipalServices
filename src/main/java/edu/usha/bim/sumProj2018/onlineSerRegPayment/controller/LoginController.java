/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.controller;


import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserLogin;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.services.UserRepo;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIConstant.LOGIN_URL)
public class LoginController {
    @Autowired
    UserRepo loginrepo;
     
     @Autowired
     PasswordEncoder passwordEncoder;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserLogin userJsonObj) throws ServletException {
        if (userJsonObj.getUserName() == null || userJsonObj.getPassword() == null) {
            throw new ServletException("Please fill username or password");
        }
        String username = userJsonObj.getUserName();
        String password = userJsonObj.getPassword();
      UserLogin userInDb=loginrepo.findByUserName(username);
      if(userInDb==null){
       throw new ServletException("Invalid User");
      }
//       
//       if(!password.equals(userInDb.getPassword())){
//       throw new ServletException("Invalid password");
//       }

//        UserLogin userInDb = loginrepo.findByUserNameAndPassword(username, passwordEncoder.encode(password));

        if(!passwordEncoder.matches(password,passwordEncoder.encode(userInDb.getPassword()))){
             throw new ServletException("Invalid Password");
         }
        String jwtToken = Jwts.builder().setSubject(username)
                .claim("role", userInDb.getRole()).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "1234").compact();
        return jwtToken;
    }
}
