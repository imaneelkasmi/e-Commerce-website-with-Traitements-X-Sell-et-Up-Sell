package com.youcode.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IUserDAO;
import com.youcode.Entiter.User;

@Service
public class UserSRV implements IUserSRV {
	@Autowired IUserDAO userDAO;
	@Override
	public User findByUsername(String username) {
		
		return userDAO.findByUsername(username);
	}

}
