/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usha.bim.sumProj2018.onlineSerRegPayment.services;


import edu.usha.bim.sumProj2018.onlineSerRegPayment.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepo extends JpaRepository<UserLogin, Integer>{
    @Query("SELECT u FROM UserLogin u WHERE u.userName = :uname")
    public UserLogin findByUserName(@Param("uname")String userName);
     @Query("SELECT u FROM UserLogin u WHERE u.userName=:uname and u.password=:pass")
    public UserLogin findByUserNameAndPassword(@Param("uname") String userName,
            @Param("pass") String password);

   
    
}
