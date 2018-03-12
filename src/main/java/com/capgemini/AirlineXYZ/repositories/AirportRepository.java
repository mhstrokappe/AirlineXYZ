package com.capgemini.AirlineXYZ.repositories;

import com.capgemini.AirlineXYZ.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
}
