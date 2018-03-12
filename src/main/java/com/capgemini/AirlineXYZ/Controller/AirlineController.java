package com.capgemini.AirlineXYZ.Controller;

import com.capgemini.AirlineXYZ.Service.AirlineService;
import com.capgemini.AirlineXYZ.model.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airlinecontroller/")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @RequestMapping(value = "allairlines",method = RequestMethod.GET)
    public Iterable<Airline> indexAirline(){
        return airlineService.getAirlines();
    }

}
