package org.example.salesmanagement_T2208e.controller;

import org.example.salesmanagement_T2208e.entity.Manufacturer;
import org.example.salesmanagement_T2208e.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {
    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerService.getAllManufacturers();
    }

    @PostMapping
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.addManufacturer(manufacturer);
    }

    @PutMapping("/{id}")
    public Manufacturer updateManufacturer(@PathVariable Long id, @RequestBody Manufacturer manufacturer) {
        manufacturer.setId(id);
        return manufacturerService.updateManufacturer(manufacturer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManufacturer(@PathVariable Long id) {
        manufacturerService.deleteManufacturer(id);
        return ResponseEntity.noContent().build();
    }
}
