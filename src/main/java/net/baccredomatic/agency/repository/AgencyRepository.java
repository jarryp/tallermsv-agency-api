package net.baccredomatic.agency.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import net.baccredomatic.agency.model.Agency;

@Repository
public interface AgencyRepository extends PagingAndSortingRepository<Agency, Integer> {

}
