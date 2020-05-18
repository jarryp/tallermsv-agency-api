package net.baccredomatic.agency.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.baccredomatic.agency.model.Agency;
import net.baccredomatic.agency.repository.AgencyRepository;
import net.baccredomatic.agency.service.AgencyService;

@Service
public class AgencyServiceImpl implements AgencyService {

	@Autowired private AgencyRepository repository;
	
	@Override
	public Collection<Agency> getAll() {
		return (Collection<Agency>) repository.findAll();
	}

	@Override
	public void add(Agency agency) {
		repository.save(agency);
	}

}
