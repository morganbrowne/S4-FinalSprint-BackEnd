package com.keyin.Airline;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("airlines")
public class AirlineController {

    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineService.getAllAirlines();
    }

    @PostMapping
    public Airline createAirline(@RequestBody Airline airline) {
        return airlineService.createAirline(airline);
    }

    @GetMapping("/{id}")
    public Airline getAirline(@PathVariable Long id) {
        return airlineService.getAirlineById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAirline(@PathVariable Long id) {
        airlineService.deleteAirline(id);
    }
}
