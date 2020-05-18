package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Client;

public interface IClientDAO extends JpaRepository<Client, Integer>{

}
