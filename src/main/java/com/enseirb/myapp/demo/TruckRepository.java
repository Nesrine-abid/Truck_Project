package com.enseirb.myapp.demo;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class TruckRepository {
    private Map<Long, Truck> trucks = new HashMap<>();

    TruckRepository() {
        trucks.put(0L, new Truck("DF-122-FJ", "2016-08-12"));
        trucks.put(1L, new Truck("DE-136-KD", "2016-01-02"));
        trucks.put(2L, new Truck("SD-275-PQ", "2017-09-04"));
        trucks.put(4L, new Truck("HI-278-HO", "2018-12-17"));
    }
    public Truck getById(Long id) {
        Truck truck = trucks.get(id);
        if (truck == null) {
            throw new TruckNotFoundException("Truck not found");
        }
        return truck;
    }
}
