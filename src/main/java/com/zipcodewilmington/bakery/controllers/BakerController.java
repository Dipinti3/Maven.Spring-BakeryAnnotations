package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.services.BakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/baker-controller")
public class BakerController {
    @Autowired
    private BakerService service;

    public BakerController(BakerService service) {
        this.service = service;
    }
    @GetMapping(value="/index")
    public  ResponseEntity<Iterable<Baker>> index() {
        return new ResponseEntity<>
                (service.index(), HttpStatus.OK);
    }

    @GetMapping(value = "/read")
    public  ResponseEntity<List<Baker>> readAll() {

        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }
    @GetMapping(value="/show/{id}")
    public  ResponseEntity<Baker> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @PostMapping(value="/create")
    public ResponseEntity<Baker> create(@RequestBody Baker baker) {
        return new ResponseEntity<>(service.create(baker), HttpStatus.CREATED);
    }
    @PostMapping(value="/update/{id}")
    public ResponseEntity<Baker> update(@PathVariable Long id, @RequestBody Baker baker) {
        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
    }
    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
