package net.baccredomatic.agency.service;

import java.util.Collection;

import net.baccredomatic.agency.model.Agency;

public interface AgencyService {
	
	public void add(Agency agency);
	public Collection<Agency> getAll();

}
