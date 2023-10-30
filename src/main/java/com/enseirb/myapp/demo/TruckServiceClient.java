package com.enseirb.myapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TruckServiceClient {
    private final RestTemplate restTemplate;

    @Autowired
    public TruckServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Truck getUserById() {
        String resourceUrl = "http://localhost:8080/truck/1";
        Truck truck = restTemplate.getForObject(resourceUrl, Truck.class);
        System.out.println("****"+ truck.toString());
        return truck;
    }

}
