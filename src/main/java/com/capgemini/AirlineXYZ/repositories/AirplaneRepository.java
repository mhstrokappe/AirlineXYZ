package com.capgemini.AirlineXYZ.repositories;

import com.capgemini.AirlineXYZ.model.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Long>{
    Iterable<Airplane> findByAirline_id(long id);
}
