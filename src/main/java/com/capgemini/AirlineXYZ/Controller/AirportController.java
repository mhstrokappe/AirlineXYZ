package com.capgemini.AirlineXYZ.Controller;

import com.capgemini.AirlineXYZ.Service.AirportService;
import com.capgemini.AirlineXYZ.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airportcontroller/")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @RequestMapping(value = "allairports", method = RequestMethod.GET)
    public Iterable<Airport> getAirports(){
        return airportService.getAirports();
    }

    @RequestMapping(value = "newairport", method = RequestMethod.POST)
    public void addAirport(@RequestBody Airport airport){
        airportService.newAirport(airport);
    }

    @RequestMapping(value = "getairport", method = RequestMethod.GET)
    public Airport findAirport(long id){
        return airportService.findAirport(id);
    }
}
