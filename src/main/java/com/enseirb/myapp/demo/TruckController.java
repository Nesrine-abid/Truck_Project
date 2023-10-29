package com.enseirb.myapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// http://localhost:8080/truck

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    TruckRepository truckRepo;
// ResponseEntity pour renvoyer une réponse HTTP avec le statut OK (200) lorsque le camion est trouvé
    @GetMapping("/{id}")
    public ResponseEntity<Truck> getById(@PathVariable long id) {
        try {
            Truck truck = truckRepo.getById(id);
            return new ResponseEntity<>(truck, HttpStatus.OK);
        } catch (TruckNotFoundException exception) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
