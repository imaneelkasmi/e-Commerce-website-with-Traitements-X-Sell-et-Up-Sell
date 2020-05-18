package com.youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.youcode.Entiter.Roles;

import com.youcode.Services.IRolesSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class RolesCTR {
	@Autowired IRolesSRV rolesSRV;
	
// Add 
	@PostMapping(value = "/roles")
	private void addOrUpdateRoles( @RequestBody Roles role) {
		rolesSRV.addOrUpdateRoles(role);
	}
//Update 
	@PutMapping("/roles")
	public void updateRoles(@RequestBody Roles role) {
		rolesSRV.addOrUpdateRoles(role);
	}
//Select All
	@GetMapping(value = "/roles")
	public List<Roles> selectAllRoles() {
		return rolesSRV.selectAllRoles();
	}
//Select By Id
	@GetMapping(value = "/roles/{id}")
	public Roles selectByIdRoles(@PathVariable("id") int id ) {
		return rolesSRV.selectByIdRoles(id).get();
	}
//Delete 
	@DeleteMapping( value = "/roles/{id}")
	private void deleteRoles(@PathVariable("id") int id) {
		rolesSRV.deleteRoles(id);
	}
}
