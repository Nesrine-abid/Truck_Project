package com.enseirb.myapp.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Truck not found")
public class TruckNotFoundException extends RuntimeException {
    public TruckNotFoundException(String message) {
        super(message);
    }
}
