package MAST.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import MAST.model.User;
import MAST.api.services.ProfileService;

@RestController
public class ProfileController {
     private ProfileService profileService;
     @RequestMapping(path = "/profile", method = RequestMethod.GET) 
     public User sayHello(@RequestParam String accountName) { 
          String message = "Hello " + accountName; 
          User dto = profileService.findByAccountName(accountName);
          return dto; 
     }
}