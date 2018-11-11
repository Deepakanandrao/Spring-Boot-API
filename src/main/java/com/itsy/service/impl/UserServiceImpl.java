package com.itsy.service.impl;

import com.itsy.UserRepository;
import com.itsy.io.entity.NewUserEntity;
import com.itsy.middleware.NewUserDTO;
import com.itsy.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	UserRepository userRepository;
	
	@Override
	public NewUserDTO CreateNewUser(NewUserDTO newuserdto) {
		
		NewUserDTO createdUserdto = new NewUserDTO();
		NewUserEntity userRecord = new NewUserEntity();
		BeanUtils.copyProperties(newuserdto, userRecord);
		
		NewUserEntity storedUser =  userRepository.save(userRecord);
		BeanUtils.copyProperties(storedUser, createdUserdto);
		
		return createdUserdto;
		
	}

}
