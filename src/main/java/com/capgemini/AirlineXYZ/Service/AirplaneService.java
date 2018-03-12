package com.capgemini.AirlineXYZ.Service;

import com.capgemini.AirlineXYZ.Data.AirplaneModel;
import com.capgemini.AirlineXYZ.model.Airplane;
import com.capgemini.AirlineXYZ.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AirplaneService {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private AirportService airportService;

    public Iterable<Airplane> allPlanes(){
        return this.airplaneRepository.findAll();
    }

    public Iterable<Airplane> getPlanes(long airlineid){
        return this.airplaneRepository.findByAirline_id(airlineid);
    }

    @Transactional
    public void newAirplane(AirplaneModel airplaneModel){
        Airplane airplane = new Airplane();
        airplane.setName(airplaneModel.getName());
        airplane.setType(airplaneModel.getType());
        airplane.setAirport(airportService.findAirport(airplaneModel.getAirport_id()));
        this.airplaneRepository.save(airplane);
    }

    public Airplane findPlane(long id){
        return this.airplaneRepository.findOne(id);
    }

//    @Transactional
//    public void deleteAirplane(Long id){
//        this.airplaneRepository.delete(id);
//    }
}
