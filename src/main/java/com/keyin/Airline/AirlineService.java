package com.keyin.Airline;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirlineService {

    private final AirlineRepository airlineRepository;

    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    public Airline createAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    public Airline getAirlineById(Long id) {
        return airlineRepository.findById(id).orElse(null);
    }

    public void deleteAirline(Long id) {
        airlineRepository.deleteById(id);
    }
}
