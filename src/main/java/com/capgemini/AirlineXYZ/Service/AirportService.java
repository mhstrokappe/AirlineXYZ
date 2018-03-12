package com.capgemini.AirlineXYZ.Service;

import com.capgemini.AirlineXYZ.model.Airplane;
import com.capgemini.AirlineXYZ.model.Airport;
import com.capgemini.AirlineXYZ.repositories.AirplaneRepository;
import com.capgemini.AirlineXYZ.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private AirplaneRepository airplaneRepository;

    @PostConstruct
    public void init(){
        Airport amsterdam = new Airport();
        amsterdam.setCity("Amsterdam");
        amsterdam.setCountry("The Netherlands");
        amsterdam.setName("Schiphol");
        this.airportRepository.save(amsterdam);

        Airplane airplane1 = new Airplane();
        airplane1.setType("A380");
        airplane1.setName("De grote");
        airplane1.setAirport(amsterdam);
        this.airplaneRepository.save(airplane1);

        Airport london = new Airport();
        london.setCity("London");
        london.setCountry("United Kingdom");
        london.setName("Heathrow");
        this.airportRepository.save(london);

        Airport paris = new Airport();
        paris.setCity("Paris");
        paris.setCountry("France");
        paris.setName("Charles de Gaulle");
        this.airportRepository.save(paris);

        Airport stockholm = new Airport();
        stockholm.setCity("Stockholm");
        stockholm.setCountry("Sweden");
        stockholm.setName("Pipi Langkous Airport");
        this.airportRepository.save(stockholm);

        Airport berlin = new Airport();
        berlin.setCity("Berlin");
        berlin.setCountry("Germany");
        berlin.setName("Schnell Schnell Schnell");
        this.airportRepository.save(berlin);
    }

    public Iterable<Airport> getAirports(){
        return this.airportRepository.findAll();
    }

    public Airport findAirport(long id){
        return this.airportRepository.findOne(id);
    }

    @Transactional
    public void newAirport(Airport airport){
        this.airportRepository.save(airport);
    }
}
