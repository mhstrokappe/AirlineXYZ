package com.capgemini.AirlineXYZ.repositories;

import com.capgemini.AirlineXYZ.model.Airline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Long> {
}
