package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.User;


public interface IUserDAO extends JpaRepository<User,Integer>{
	public User findByUsername(String username);
}
