package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.ISuperviseurDAO;
import com.youcode.Entiter.Superviseur;

@Service
public class SuperviseurSRV implements ISuperviseurSRV {
	@Autowired ISuperviseurDAO superviseurDAO;

	@Override
	public void addOrUpdateSuperviseur(Superviseur superviseur) {
		superviseurDAO.save(superviseur);
	}

	@Override
	public Optional<Superviseur> selectByIdSuperviseur(int id) {
		return superviseurDAO.findById(id);
	}

	@Override
	public List<Superviseur> selectAllSuperviseur() {
		
		return superviseurDAO.findAll();
	}

	@Override
	public void deleteSuperviseur(int id) {
		superviseurDAO.deleteById(id);
	}
}
