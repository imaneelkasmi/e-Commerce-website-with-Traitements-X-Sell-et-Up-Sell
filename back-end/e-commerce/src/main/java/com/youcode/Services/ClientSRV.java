package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IClientDAO;
import com.youcode.Entiter.Client;

@Service
public class ClientSRV implements IClientSRV {
	@Autowired IClientDAO clientDAO;

	@Override
	public void addOrUpdateClient(Client client) {
		clientDAO.save(client);
	}

	@Override
	public Optional<Client> selectByIdClient(int id) {
		return clientDAO.findById(id);
	}

	@Override
	public List<Client> selectAllClient() {
		return clientDAO.findAll();
	}

	@Override
	public void deleteClient(int id) {
		clientDAO.deleteById(id);
	}

}
