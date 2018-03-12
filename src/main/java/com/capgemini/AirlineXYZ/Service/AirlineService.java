package com.capgemini.AirlineXYZ.Service;

import com.capgemini.AirlineXYZ.model.Airline;
import com.capgemini.AirlineXYZ.repositories.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    @PostConstruct
    public void init(){
        Airline airline1 = new Airline();
        airline1.setName("XYZ Airlines");

        this.airlineRepository.save(airline1);
    }

    public Iterable<Airline> getAirlines(){
        return this.airlineRepository.findAll();
    }

}
