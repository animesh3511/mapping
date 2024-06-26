package com.example.mapping.controller;


import com.example.mapping.model.request.UserRequest;
import com.example.mapping.model.response.CustomEntityResponse;
import com.example.mapping.model.response.EntityResponse;
import com.example.mapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

   @Autowired
    UserService userService;

   @PostMapping("/saveOrUpdate")
   private ResponseEntity<?> saveOrUpdate(@RequestBody UserRequest userRequest)
   {
       try{

         return  new ResponseEntity(new EntityResponse(userService.saveOrUpdate(userRequest),0), HttpStatus.OK);

       }catch(Exception e)
       {

        return new ResponseEntity(new CustomEntityResponse(e.getMessage(),-1),HttpStatus.OK);

       }


   }

   @GetMapping("getUserAndProductDetailsByUserId")
   private ResponseEntity<?> getUserAndProductDetailsByUserId(@RequestParam Long userId)
   {
   try {
       return new ResponseEntity(new EntityResponse(userService.getUserAndProductDetailsByUserId(userId), 0), HttpStatus.OK);

   }
   catch (Exception e)
   {

       return new ResponseEntity(new CustomEntityResponse(e.getMessage(),0),HttpStatus.OK);

   }
   }

}
