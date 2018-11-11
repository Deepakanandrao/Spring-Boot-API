package com.itsy.ui.controllers;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsy.middleware.NewUserDTO;
import com.itsy.service.UserService;
import com.itsy.ui.model.requests.NewUserModel;
import com.itsy.ui.model.response.NewUserResponseModel;

@RestController
@RequestMapping("/api")

public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(
	path = "/signup", 
	produces=MediaType.APPLICATION_JSON_VALUE, 
	consumes = MediaType.APPLICATION_JSON_VALUE
	)
	
	public NewUserResponseModel createUser(@RequestBody NewUserModel newuser) {
		UUID uuid = UUID.randomUUID();
		
		NewUserDTO newuserdto = new NewUserDTO();
		BeanUtils.copyProperties(newuser, newuserdto);
//		newuserdto.setCreatedUserId(uuid);
		
		 		
		NewUserDTO createduserdto = userService.CreateNewUser(newuserdto);
		NewUserResponseModel createduser = new NewUserResponseModel();
		BeanUtils.copyProperties(createduserdto, createduser);
		
		return createduser;		
	}
	
}
