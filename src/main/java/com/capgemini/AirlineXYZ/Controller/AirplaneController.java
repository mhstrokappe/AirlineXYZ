package com.capgemini.AirlineXYZ.Controller;

import com.capgemini.AirlineXYZ.Data.AirplaneModel;
import com.capgemini.AirlineXYZ.Service.AirplaneService;
import com.capgemini.AirlineXYZ.model.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airplanecontroller/")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @RequestMapping(value = "allairplanes", method = RequestMethod.GET)
    public Iterable<Airplane> allPlanes(){
        return airplaneService.allPlanes();
    }

    @RequestMapping(value = "findairplanes/{airlineid}", method = RequestMethod.GET)
    public Iterable<Airplane> findplanes(@PathVariable long airlineid){
        return airplaneService.getPlanes(airlineid);
    }

    @RequestMapping(value = "addairplane", method = RequestMethod.POST)
    public void addAirplane(@RequestBody AirplaneModel airplane){
        airplaneService.newAirplane(airplane);
    }

    @RequestMapping(value = "findairplane/{airplaneid}", method = RequestMethod.GET)
    public Airplane findairplane(@PathVariable long airplaneid){
        return airplaneService.findPlane(airplaneid);
    }

//    @RequestMapping(value = "deleteairplane", method = RequestMethod.DELETE)
//    public void deleteAirplane(Long id){
//        airplaneService.deleteAirplane(id);
//    }
}
