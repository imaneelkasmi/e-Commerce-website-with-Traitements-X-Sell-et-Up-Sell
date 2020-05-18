package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IRolesDAO;
import com.youcode.Entiter.Roles;

@Service
public class RolesSRV implements IRolesSRV {
	@Autowired IRolesDAO rolesDAO;

	@Override
	public void addOrUpdateRoles(Roles role) {
		rolesDAO.save(role);
	}

	@Override
	public Optional<Roles> selectByIdRoles(int id) {
		return rolesDAO.findById(id);
	}

	@Override
	public List<Roles> selectAllRoles() {
		return rolesDAO.findAll();
	}

	@Override
	public void deleteRoles(int id) {
		rolesDAO.deleteById(id);
	}
	
}
