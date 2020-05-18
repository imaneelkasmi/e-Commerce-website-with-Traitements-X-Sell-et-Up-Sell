package com.youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.Entiter.Client;
import com.youcode.Services.IClientSRV;
import com.youcode.Services.IRolesSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class ClientCTR {
	@Autowired IClientSRV clientSRV;
	@Autowired IRolesSRV rolesSRV;
	@Autowired PasswordEncoder passwordEncoder;
	// Add 
		@PostMapping(value = "/public/register")
		private void addOrUpdateClient( @RequestBody Client client) {
			client.setPassword(passwordEncoder.encode(client.getPassword()));
			client.setRoles(rolesSRV.selectByIdRoles(2).get());
			clientSRV.addOrUpdateClient(client);
		}
	//Update 
		@PutMapping("/client")
		public void updateClient(@RequestBody Client client) {
			clientSRV.addOrUpdateClient(client);
		}
	//Select All
		@GetMapping(value = "/client")
		public List<Client> selectAllClient() {
			return clientSRV.selectAllClient();
		}
	//Select By Id
		@GetMapping(value = "/client/{id}")
		public Client selectByIdClient(@PathVariable("id") int id ) {
			return clientSRV.selectByIdClient(id).get();
		}
	//Delete 
		@DeleteMapping( value = "/client/{id}")
		private void deleteClient(@PathVariable("id") int id) {
			clientSRV.deleteClient(id);
		}
		
}
