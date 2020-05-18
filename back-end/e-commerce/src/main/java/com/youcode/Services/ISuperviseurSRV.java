package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Superviseur;

public interface ISuperviseurSRV {

	public void addOrUpdateSuperviseur( Superviseur superviseur);
	public Optional<Superviseur> selectByIdSuperviseur(int id);
	public List<Superviseur> selectAllSuperviseur();
	public void deleteSuperviseur(int id);
}
