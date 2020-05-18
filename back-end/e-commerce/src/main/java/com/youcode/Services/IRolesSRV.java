package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Roles;

public interface IRolesSRV {

	public void addOrUpdateRoles( Roles role);
	public Optional<Roles> selectByIdRoles(int id);
	public List<Roles> selectAllRoles();
	public void deleteRoles(int id);
}
