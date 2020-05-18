package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Client;

public interface IClientSRV {

	public void addOrUpdateClient( Client client);
	public Optional<Client> selectByIdClient(int id);
	public List<Client> selectAllClient();
	public void deleteClient(int id);
}
